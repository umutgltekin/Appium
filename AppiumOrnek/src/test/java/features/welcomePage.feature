
Feature: Welcome Page

  Scenario: Check Welcome Page
    Given oppened lcWaikiki app
    When click skip buton
    When click "Kategoriler" title
    When click "Erkek" icon
    When click "Giyim" category
    When click "Tişört" product
    When click product name"ssrsrs"
    When add favorite
    When close product
    When click "Favoriler"
    Then check product favorite
    When remove product
    Then check empty favorite





