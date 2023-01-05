Feature: Bag functionalities

  Scenario: Putting one thing in the bag
    Given the bag is empty
    When I put 1 potato in the bag
    Then the bag should contain only 1 potato