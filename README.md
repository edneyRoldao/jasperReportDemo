# jasperReportDemo

- The next steps will guide you on how to create a jasperReport and connect with java.

<b>step 1 - Download IReport Designer</b>
<br>link: https://community.jaspersoft.com/project/ireport-designer/releases (IReport-5.6.0.zip)

<b>step 2 - Download JDK 7 (IReport Designer doesn't on above versions)</b>
<br>link: https://www.oracle.com/technetwork/java/javase/downloads/java-archive-downloads-javase7-521261.html

<b>step 3 - Add JDK 7 path to ireport.config</b>
<br>File file can be found on: iReport-5.6.0/etc/ireport.config
<br><img src="https://github.com/edneyRoldao/jasperReportDemo/blob/master/images/jdk-jasper-config.png">
<br>

<b>step 4 - Creating a Blank Report</b>
<br>
<br><img src="https://github.com/edneyRoldao/jasperReportDemo/blob/master/images/create-report-steps.png">
<br>

<b>step 5 - Creating Parameters </b>
<br> Each parameter must be an item from Map<String, Object> on your java project
<br> parameter's name represents the key value on HashMap.
<br> Let's create a simple parameter that will be a String myTitle and another that will be a JRBeanDataSource (this will read our arrayList on java)
<br><img src="https://github.com/edneyRoldao/jasperReportDemo/blob/master/images/create-parameters.png">

