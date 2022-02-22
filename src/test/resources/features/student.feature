Feature: As user I want create a new student So that matriculate the new student in the institute
  Scenario: Creation an student
    When you create an student
      | name   |dateOfBirth | email         |
      | Nathaly |1989-09-16  |sergio5@mail.com|
    Then i should see the student created

