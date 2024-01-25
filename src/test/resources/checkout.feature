 Feature: check out

  @web
    @checkout

  Scenario: user check out after atc of Sauce Labs Bolt T-Shirt
    #user already atc
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    And user click login button
    When user click add to cart "Sauce Labs Bolt T-Shirt"
    Then  validate cart badge notification is "1"

    #check page
    When user click add to cart
    Then user is on cart page

    #check out
    When user click check out button
    Then user is on your information page

    #continue
    When user click continue button
    Then user is on Checkout Overview page

    #finish
   When user click finish button
    Then user is on Thank You page




