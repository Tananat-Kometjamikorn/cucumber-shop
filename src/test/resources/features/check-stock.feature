#Feature: Check Stock
#  As a user
#  I will sell product if I have enough in stock
#
#  Background:
#    Given a product "bread" have 4 item in stock
#    And a product "jam" have 3 in stock
#
#  Scenario: Enough
#    When customer buy "Bread" with quantity 2
#    Then user say "Here you are"
#
#  Scenario: Not Enough
#    When customer buy "Jam" with quantity 4
#    Then user say "Not enough item in stock"
