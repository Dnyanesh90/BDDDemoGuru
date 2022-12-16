Feature: Test guru99 Application

  Scenario Outline: Test register on guru99 multiple register page
    Given user is on register page
    When enter valid user "<firstname>" and "<lastname>"
    And enter valid user "<phone>" and "<email>"

    Examples: 
      | firstname   | lastname | phone      | email                   |
      | DNYANESHWAR | KADAM    | 7507847874 | kadamdnyanesh@gmail.com |
