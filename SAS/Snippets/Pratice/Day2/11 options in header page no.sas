

options nodate pageno=40;
data hospital;
input name $ sex $ amount;
cards;
reema f 20 a
aparna f 800
ram m 400
;
run;

proc print data=hospital;

run;