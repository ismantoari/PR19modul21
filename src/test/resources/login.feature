@web
Feature: Login

  #@web
    #@login
   #positive test : valid login
  Scenario Outline: Login using valid username and password
    Given user is on login page
    #And user input username with "standard_user"
      And user input username with "<username>"
    #And user input password with "secret_sauce"
      And user input password with "<password>"
    When user click login button
    #Then user is on homepage
    Then assert login "<case login>"

      Examples:
      |username     |password         | case login         |
      |standard_user|secret_sauce     | positive           |
      |standard_user|invalid_password | negative invalid   |
      |invalid_user |secret_sauce     | negative invalid   |
      |             |                 | negative blank     |
      |standard_user|                 | negative no pwd    |


