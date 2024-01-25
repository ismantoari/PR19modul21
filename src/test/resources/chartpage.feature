@web

  Feature :
  @chartPage
  Scenario: user do add to cart of Sauce Labs Bolt T-Shirt
    # Precondition: user already login and atc
  Given user is on login page
  And user input username with "standard_user"
  And user input password with "secret_sauce"
  And user click login button
  And user click add to cart "Sauce Labs Bolt T-Shirt"
  # Then validate cart badge notification is "1"

  # test chart page
  When user click shopping cart icon on homepage
  Then user is on shopping cart page


