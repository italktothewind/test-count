Feature: example feature 1
  Scenario:
    Given url 'http://httpbin.org/'
    When method get
    Then status 200