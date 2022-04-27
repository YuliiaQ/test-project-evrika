Feature: As an unregistered user
  I want to send email to support
  So that I can communicate with support

  Scenario: Successful email sending to support
    When I click Support button in HeaderComponent
    And I click email link