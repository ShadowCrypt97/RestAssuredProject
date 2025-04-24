Feature: As user I want create a new client So that matriculate the new Client in the App
  Scenario: Creation an Client
    When you create a client
      | name   |birthday | email         |gender|
      | Juan |1997-02-28  |testmail3.ext1@mail.com|0|
    Then i should see the client created

