@api
Feature: Veriy CRUD operation on the comments

 Scenario: Get list of comments details from API
   Given I have access to API
    When I perform a GET request on "http://localhost:3000/comments"
    Then I get a 200 http status code
    And the response collections contains comments as "some comment"


