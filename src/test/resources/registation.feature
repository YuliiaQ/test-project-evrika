Feature: As an unregistered user
  I want to register to the system with my credentials
  So that I can have access to site

  Scenario Outline: Successful registration with valid data
    Given Login page is opened in pop up
    When I click sign in button
    And I choose the enum type of radio button <typeOfOrganization>
    And I enter the enum field NAME data <nameField>
    And I enter the enum field SURNAME data <surnameField>
    And I enter the Phone Field data <phoneNumber>
    And I input random data in the EMAIL field on Registration Page
    And I enter the enum field PASSWORD data required ''
    And I enter the Password Confirm field data
    And I click the Privacy Policy checkbox
    And I click button Register
    Then 'добро пожаловать в личный кабинет!' heading is displayed
    Examples:
      | typeOfOrganization | nameField | surnameField | phoneNumber  |
      | RADIOBUTTON_1      | 'Наташка' | 'Наташка'    | '0987654321' |
      | RADIOBUTTON_2      | 'Антошка' | 'Антошка'    | '0987657621' |



