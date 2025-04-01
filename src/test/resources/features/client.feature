Feature: As user I want create a new student So that matriculate the new student in the institute
  Scenario: Creation an student
    When you create an student
      | name   |dateOfBirth | email         |
      | Pedro |1997-02-28  |testmail.ext1@mail.com|
    Then i should see the student created

