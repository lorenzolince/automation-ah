@traditionalSale
Feature: Testing all process to make a traditional sale

Scenario: Login in sales portal Chubb
Given The user access the Chubb sales portal
When the user enter a valid username and password 
Then the user can see the Chubb sales menu

#Scenario: Open Weblink Sales
#When the user click on Weblink link
#Then the user can see the Weblink pages