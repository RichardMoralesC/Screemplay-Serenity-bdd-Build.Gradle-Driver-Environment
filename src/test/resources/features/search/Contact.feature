Feature: Send a request to contact us

  Scenario: Send to contact us
    Given a user contacts to find out why a trouser i buy in a smaller size
    When sends their request with their mail the reference order umero and the message
    Then expects a response