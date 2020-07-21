Feature: example feature 2
  Scenario:
    Given url 'http://httpbin.org/'
    When method get
    Then status 200