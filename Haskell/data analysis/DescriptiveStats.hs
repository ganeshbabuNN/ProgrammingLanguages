module DescriptiveStats where

import Data.List
import Data.Ord
import Data.Maybe

{- Returns a tuple of the range of values in a list
   packaged inside of a Maybe. -}
range :: Ord a => [a] -> Maybe (a, a)
range [] = Nothing
range [x] = Just (x, x)
range xs = Just (minimum xs, maximum xs)

{- Returns the mean of a list packaged in a Maybe -}
mean :: Real a => [a] -> Maybe Double
mean []  = Nothing
mean [x] = Just $ realToFrac x
mean xs  = Just $ realToFrac (sum xs) / fromIntegral (length xs)

{- Returns the sample standard deviation of a list
   packaged in a Maybe -}
stdev :: Real a => [a] -> Maybe Double
stdev []  = Nothing
stdev [_] = Nothing
stdev xs = Just $ sqrt (sumsquares / n_m1)
  where
    n_m1 = fromIntegral (length xs - 1)
    meanxs = fromJust (mean xs)
    sumsquares = sum $ map (diffsquare . realToFrac) xs
    diffsquare x = (x - meanxs) * (x - meanxs)

{- Computes the median of a data set, wrapped in a Maybe. -}
median :: Real a => [a] -> Maybe Double
median [] = Nothing
median list
 | odd (length list) = Just middleValue
 | otherwise = Just middleEven
 where
    sorted = sort list
    middleIndex = length list `div` 2
    middleValue = realToFrac $ sorted !! middleIndex
    beforeMiddleValue =  realToFrac $ sorted !! (middleIndex - 1)
    middleEven = 0.5 * (middleValue + beforeMiddleValue)

{- Group each similar subsequence of values into a tuple
   of (value, frequency) -}
runLengthEncoding :: Ord a => [a] -> [(a, Integer)]
runLengthEncoding = (map (\ x -> (head x, genericLength x)) . group)

{- Return the mode of a list as a tuple (mode, frequency). -}
mode :: Ord a => [a] -> Maybe (a, Integer)
mode [] = Nothing
mode list = Just $ maximumBy (comparing snd) pairs
 where
     sorted = sort list
     pairs = runLengthEncoding sorted
