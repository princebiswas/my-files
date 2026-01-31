@tag 
Feature: ebay login
 

    #@tag1 @All
    #Scenario: Incorrect email and correct password
    #Given User enters the url in browser
    #Then Click on Sign in 
    #Then User enters incorrect email address or username in the textbox
    #Then Click on Continue button
    #Then User enters correct Password
    #Then Click on sign in after entering password
    #Then Validate the error
    #And Close the browser
    
    @tag2 @All
    
 		Scenario: Correct email and correct password
    Given User enters the url in browser
    Then Click on Sign in 
    Then User enters correct email
    Then Click on Continue button
    Then User enters correct Password
    Then Click on sign in after entering password
    Then Validate the error
    #And Close the browser
    

  #@tag2
  #Scenario Outline: Engine Performence text box validate
    #Given User enters numaric data in the textbox
    #When I check for the <value> in step
    #Then I verify the <status> in step
    #And Validate the error
#
    #Examples: 
      #| email | password  |
      #|  1200 | success |
      #|  3000 | Fail    |
