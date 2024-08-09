Shortest_Route_Optimizer Automation test assignment

Automated test suit Document
Test Case ID	  Test Scenario	         Test Steps	                                     Expected Result
TC1001	        Enable Random Mode	   1. Navigate to the application.                 The checkbox should be checked Indicating random mode is enabled.
                                       2. Click on the random mode selector            Refresh icon displayed
                                       checkbox.	                                     Calculate Random button displayed
                                  
TC1002	         Disable Random Mode	 1. Click on the random mode selector             The checkbox should be unchecked, indicating random mode is disabled. 
                                       checkbox to uncheck it.	                        Calculate Random button did not displayed

TC2001	         Refresh Random Nodes	 1. Enable random mode.                            The nodes should refresh and display new random selections.
                                       2. Click the refresh icon.

TC3001	         Select From Node	     1. Navigate to the 'From' node dropdown.          The selected node should be displayed in the 'From' node field.
                                       2. Select a node (e.g., "C").	

TC3002	         Select To Node	       1. Navigate to the 'To' node dropdown.            The selected node should be displayed in the 'To' node field.
                                       2. Select a node (e.g., "H").

TC4001	         Calculate Path        1. Enable random mode.                            The shortest path and total distance should be displayed.
                 Random Mode	         2. Click "Calculate Random".

TC4002	         Calculate Path        1. Select 'From' node as "C".                     The shortest path and total distance should be displayed.
                 Manual Mode           2. Select 'To' node as "H".
                                       3. Click "Calculate Path".

TC5001	         Display Results	     1. Perform path calculation.	                      The results should be displayed in the specified format.

TC6001	         Clear Selection	     1. Perform path calculation.                       All fields should be cleared and reset.
                                       2. Click the "Clear" button.

