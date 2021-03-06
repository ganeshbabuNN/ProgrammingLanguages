<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<f:view>
	<html>
	<body>
	<h1>Ganesh Learning Center</h1>
	<h:panelGrid id="showPanel" columns="2">
		<h:outputText value="Name"/>
		<h:outputText value="#{mbdemoBean.name}"/>
		<h:outputText value="Email"/>
		<h:outputText value="#{mbdemoBean.email}"/>
		<h:outputText value="phone"/>
		<h:outputText value="#{mbdemoBean.phone}"/>
		<h:outputText value="DOB"/>
		<h:outputText value="#{mbdemoBean.dob}"/>
		<h:outputText value="Fee"/>
		<h:outputText value="#{mbdemoBean.fee}"/>
		<h:outputText value="Courses"/>
		<h:dataTable value="#{mbdemoBean.courses}"
		var="cou" border="1" bgcolor="#ddcc00">
		<h:column>
		<h:outputText value="#{cou}"/>		
		</h:column>
		</h:dataTable>
		
		<h:outputText value="References"/>
		<h:outputText value="#{mbdemoBean.refs}"/>
		<h:outputText value="Course Id"/>
		<h:outputText value="#{mbdemoBean.mycourse.cid}"/>
		<h:outputText value="Course Name"/>
		<h:outputText value="#{mbdemoBean.mycourse.cname}"/>
		<h:outputText value="Duration"/>
		<h:outputText value="#{mbdemoBean.mycourse.duration}"/>
		<h:outputText value="Cost"/>
		<h:outputText value="#{mbdemoBean.mycourse.cost}"/>
		<h:outputText value="Course ID"/>
		<h:outputText value="#{courseBean.cid}"/>
		<h:outputText value="Course Name"/>
		<h:outputText value="#{courseBean.cname}"/>
		<h:outputText value="Duration"/>
		<h:outputText value="#{courseBean.duration}"/>
		<h:outputText value="cost"/>
		<h:outputText value="#{courseBean.cost}"/>
	</h:panelGrid>
	</html>
</f:view>
