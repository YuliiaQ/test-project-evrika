Feature: As a registered user
  I want to make an order
  So that I can pay for it

  Background: Personal Information page is opened after successful login in
    Given Login page is opened in pop up
    And I enter in the enum field LOGIN data 'sajowi9588@epeva.com'
    And I enter in the enum field PASSWORD data 'qwertyuiop['
    And I click Login button
    And I click Accept Cookies button
    Then 'добро пожаловать в личный кабинет!' heading is displayed

  Scenario: Successful making the order and paying it by card
    When I click Catalog Dropdown button
    And I click choose Category button
    And I click item
    And I click the enum item ITEM_1
    And Add To Shopping Cart button
    And I click Checkout Button
    And I enter in the field Surname data 'dvbfkjv'
    And I click enum button COURIER_DELIVERY
    And I enter in the address enum field STREET data 'csjkn'
    And I enter in the address enum field HOUSE data '3'
    And I click the DatePicker to choose the date of delivery
    And I click the next day after current day
    And I click Select Time Dropdown button
    And I click Delivery time enum button TIME3
    And I click enum button PAYING_CASH
    And I click Confirm Order button
    Then message 'Ошибка создания заказа. Повторите попытку чуть позже' is displayed

  Scenario: Successful making the order and paying it by card
    When I click Catalog Dropdown button
    And I click choose Category button
    And I click item
    And I click the enum item ITEM_2
    And Add To Shopping Cart button
    And I click Checkout Button
    And I enter in the field Surname data 'dvbfkjv'
    And I click enum button COURIER_DELIVERY
    And I enter in the address enum field STREET data 'fcgv'
    And I enter in the address enum field HOUSE data '65'
    And I click the DatePicker to choose the date of delivery
    And I click the next day after current day
    And I click Select Time Dropdown button
    And I click Delivery time enum button TIME2
    And I click enum button PAYING_CARD
    And I click Confirm Order button
    Then message 'Ошибка создания заказа. Повторите попытку чуть позже' is displayed