
Feature: Saucedemo purchase items

  @smoke
  Scenario Outline: User navigates saucedemo page and complete purchasing items
    Given user open saucedemo page
    When user login with credential <userName> and <password>
    And user click on Login button
    And user sort the products by Price (high to low)
    And user select cheapest & costliest products to basket
    And user open shopping cart
    And user go to checkout
    And user enter details <firstName>, <lastName> and <zipPostalCode>
    And user click on continue button
    And user click on finish button
    Then user should be able to see message <message>
    Examples:
      | userName         | password       | firstName   | lastName   | zipPostalCode    | message                    |
      | "Satandard_user" | "secret_sauce" | "firstName" | "lastName" | "Zip/PostalCode" | 'THANK YOU FOR YOUR ORDER' |

