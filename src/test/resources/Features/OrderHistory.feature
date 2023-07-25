@B6DGMAUT-12
Feature: My Account-Order History

  Users Story:
  As a user, I should be able to see and modify order history by clicking the Order History tab under the My Account module.

  Acceptance Criteria :
  AC1- Verify that the user can see the order history by clicking the Order History tab.
  AC2-Verify that the user can access the order detail by clicking the view icon
  AC3- Verify that the user can re-order an item from their order history
  AC4-Verify that the user can return an item from their order history
  AC5- Verify that the user can see the returned product on the 'Product Returns' page
  AC6- Verify that the user can access the return details by clicking the ‘View’ icon
  AC7- Verify that the user can see the product information as ‘Returned’ on the ‘Order Details’ page
  AC8- Verify that the user can not change  the 'Order Date/Order ID/Quantity' area without any restriction on the 'Product Returns' page
  AC9- Verify that the user can not return an item with empty or unchecked options for required fields on the 'Product Returns' page
  AC10- Verify that the user can not return an item from their order history with invalid input on the 'Product Returns' page

  Background:
    Given The user is on the login panel
    When The user enters the given credentials and clicks login button for the first authentication
    Given The user is on the main page
    When  The user enters valid credentials for the user login
    Given The user navigates to "Health & Beauty" category
    When The user selects "Capsule Plate 6pcs" product and clicks to the Add to Cart icon.
    And  The user clicks shopping cart! link from pop-up message and closes the message
    Given The user clicks Checkout button and navigates to Checkout Page
    When The user should be able to complete checkout with valid inputs

Scenario:
  Given The user clicks My Account menu and navigates to "Order History" Page

