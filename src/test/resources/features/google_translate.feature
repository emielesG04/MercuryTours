#Author: jhpelaezn@gmail.com

Feature: Google Translate
	As a web user
	I want to use Google Translate
	to translate words between different languages

  Scenario: Translate from English to Spanish
    Given that Susan wants to translate a word
    When she translate the word 'cheese' from English to Spanish
    Then she should see the word 'queso' in the screen
    
