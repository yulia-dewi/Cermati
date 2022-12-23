Feature: Register First Step Success

  Scenario Outline: Input Data Registrant Step One Success
    Given Gabung page is loaded successfully
    When the user input the email <user_email> and phone number <phone_number>
    And the user password <password> and confirm password <confirm_pswd>
    And the user input first name <first_name> and last name <last_name>
    And the user input district or city <district_city>
    And the user click button Daftar
    Then register success and go to next step

Examples: 
      | user_email							| phone_number 	| password	| confirm_pswd	| first_name	| last_name	| district_city				|
      | bddmetest1@yopmail.com	| 081100112900  | BDDtest1 | BDDtest1 			| Sukaman			| Mandoyo		| KOTA JAKARTA BARAT	|
      | bddmetest2@yopmail.com	| 081100112901  | BDDtest2	| BDDtest2			| Sukiman			| Sandoyo		| KOTA JAKARTA BARAT	|