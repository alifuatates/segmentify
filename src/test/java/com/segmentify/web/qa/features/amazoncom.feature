Feature: Control of login and product search screens

  Background:
    Given I navigate to amazon.com.tr homepage

  @done @login @logout
  Scenario: Check success login and then success logout case
    When user login system
    Then the page must have "Hesabım" content
    And user logout system
    Then the page must have "Giriş yap" content

  @done @search
  Scenario Outline: control of the search of the products with and without results in the search
    When user search product "<product>"
    Then confirm search result
    Examples:
      | product                                                          |
      | Televizyon                                                       |
      | =1-234093584790241o[pkej2roy4h3o1p3;kemrn.2kbho'1pu3o;jer2uo1y4e |





