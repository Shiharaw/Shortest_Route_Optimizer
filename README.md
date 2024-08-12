Shortest_Route_Optimizer Automation test assignment
****************************************************

Automated test suit Document
****************************

Test Case ID  - TC1001

Test Scenario - Enable Random Mode

Test Steps - 
1. Navigate to the application.     
2. Click on the random mode selector checkbox.

Expected Result - 
1. The checkbox should be checked Indicating random mode is enabled.
2. Refresh icon displayed
3. Calculate Random button displaye

**********************************************


Test Case ID  - TC1002

Test Scenario - Disable Random Mode

Test Steps - 
1. Click on the random mode selector checkbox to uncheck it.

Expected Result - 
1. The checkbox should be unchecked, indicating random mode is disabled.
2. Calculate Random button did not displayed

**********************************************


Test Case ID  - TC2001

Test Scenario - Refresh Random Nodes

Test Steps - 
1. Enable random mode.    
2. Click the refresh icon.

Expected Result -  
1. The nodes should refresh and display new random selections.

**********************************************


Test Case ID  - TC3001

Test Scenario - Select From Node

Test Steps - 
1. Navigate to the 'From' node dropdown.
2. Select a node (e.g., "C").

Expected Result -  
1. The selected node should be displayed in the 'From' node field.

**********************************************


Test Case ID  - TC3002

Test Scenario - Select To Node

Test Steps - 
1. Navigate to the 'To' node dropdown.
2. Select a node (e.g., "H").

Expected Result -  
1. The selected node should be displayed in the 'To' node field. 

**********************************************


Test Case ID  - TC4001

Test Scenario - Calculate Path Random Mode	 

Test Steps - 
1. Enable random mode.       
2. Click "Calculate Random".

Expected Result -  
1. The shortest path and total distance should be displayed.

**********************************************


Test Case ID  - TC4002

Test Scenario - Calculate Path Manual Mode

Test Steps - 
1. Select 'From' node as "C".
2. Select 'To' node as "H".
3. Click "Calculate Path".

Expected Result -  
1.  The shortest path and total distance should be displayed.

**********************************************


Test Case ID  - TC5001

Test Scenario - Display Results

Test Steps - 
1. Perform path calculation.

Expected Result -  
1. The results should be displayed in the specified format.

**********************************************


Test Case ID  - TC6001

Test Scenario -  Clear Selection

Test Steps - 
1. Perform path calculation. 

Expected Result -  
1. All fields should be cleared and reset.

 **********************************************

 
Used Hybrid Selenium framework using Selenium, Maven, and TestGN-based framework.

Created a project in GitHub and provided the link

Project run in Chrome browser with Headed and headless options


Instructions on how to run the project

a) Go to the project and open master.xml and Run as TestNG suit

Things included in the project

1. Page objects and methods 
src/test/java/pageObjects/AlgorithmCalculatorPage.java

2. Base Page
src/test/java/pageObjects/BasePage.java

3. Base Class - 
src/test/java/testCases/BaseClass.java

4. Test Cases 
src/test/java/testCases

5. Extent Report - Report generation and Email report options
src/test/java/utilities/ExtentReportManager.java
Reports  - reports

6. Log4J
src/test/resources/log4j2.xml
Log  files - logs

7. Added to get Screen shorts when test fails
src/test/java/testCases/BaseClass.java

                                       2. Click the "Clear" button.

