# Quiz 4

## Overview
* This quiz has 4 sections.
	1. fundamentals
		* `Calculator`
		* `StringUtils`
	2. arrays
		* `ArrayUtils`
	3. object orientation - Difficult
		* `Account`
		* `BankAccount`
		* `Bank`
		* `Transactable`
		* `Employee`
		* `Worker`
	4. collections
		* `WordCounter`
		* `Food` - Difficult
		* `Curry`
		* `Pepper`
		* `Spice`
		* `Ginger`
















<hr>
<hr>

## Section 1 - Fundamentals

### Calculator
* **Description**
	* The purpose of this class is to create a simple calculator.
* **Methods to Complete**
	* `Double add(Double val1, Double val2)`
		* return the _sum_ of `val1` and `val2`
	* `Double subtract(Double val1, Double val2)`
		* return the _difference_ of `val1` and `val2`
	* `Double divide(Double val1, Double val2)`
		* return the _quotient_ of `val1` and `val2`
	* `Double squareRoute(Double value)`
		* return the _square root_ of `value`
	* `Double square(Double value)`
		* return the _square_ of `value`
	* `Double[] squareRoutes(Double[] values)`
		* return an array of `Double`, containing the square root of each of the elements in `values`.
	* `Double[] squares(Double[] values)`
		* return an array of `Double`, containing the square of each of the elements in `values`.

### StringUtils
* **Description**
	* The purpose of this class is to create utility `String` methods
* **Methods to Complete**
	* `String getMiddleCharacter(String string)`
		* return character at index `string.length()/2` as `String`.
	* `String capitalizeMiddleCharacter(String string)`
		* return near-identical `String` with character at index `string.length()/2` capitalized.
	* `String lowercaseMiddleCharacter(String string)`
		* return near-identical `String` with character at index `string.length()/2` lowercased.
	* `String invertCasing(String string)`
		* return near-identical `String` with each character's casing inverted: Capital letters become lowercase, lowercase letters become lowercase.
	* `Boolean hasDuplicateConsecutiveCharacters(String string)`
		* return `true` if `string` contains two identical characters in adjacent indices.
	* `Boolean removeDuplicateConsecutiveCharacters(String string)`
		* return near-identical `String` with each occurrence of duplicate-adjacent characters removed.
	* `Boolean isIsogram(String string)`
		* return `true` if each `Character` in `string` occurs exactly 1 time.















<hr>
<hr>

## Section 2 - Arrays


### ArrayUtils
* **Description**
	* The purpose of this class is to create a utility for manipulating arrays.
* **Methods to Complete**
	* `String getMiddleElement(String[] values)`
		* return the element at index `values.length/2`
	* `String[] removeMiddleElement(String[] values)`
		* return near-identical array with element at index `values.length/2` removed.
	* `String getLastElement(String[] values)`
		* return element at index `values.length-1`
	* `String[] removeLastElement(String[] values)`
		* return near-identical array with element at index `values.length-1` removed.















<hr>
<hr>

## Section 3 - Object Orientation
### Account
* **Description**
	* The purpose of this class is to create a model of an `Account`.
* **Methods to Complete**
	* `Long getId()`
	* `void setId(Long id)`

	

### BankAccount
* **Description**
	* The purpose of this class is to create a subclass of an `Account` which implements `Transactable`.
* **Methods to Complete**
	* `void setBalance(Double double)`



### Bank
* **Description**
	* The purpose of this class is to create an encapsulation of a `Collection` of `BankAccount` objects.
* **Methods to Complete**
	* `BankAccount removeBankAccountByIndex(Integer indexNumber)`
	* `void addBankAccount(BankAccount bankAccount)`
	* `Boolean containsBankAccount(BankAccount bankAccount)`



### Employee
* **Description**
	* The purpose of this class is to create an implementation of a `Worker` and `Transactable` which can `deposit`, `withdrawal`, and `getBalance`, of its composite `BankAccount`.
* **Methods to Complete**
	* `BankAccount getBankAccount()`
	* `void setBankAccount(BankAccount bankAccount)`

		
### Transactable
* **Description**
	* The purpose of this interface is to ensure a class can `deposit`, `withdrawal`, and `getBalance`.
* **Methods to Complete**
	* `void deposit(Double amountToIncreaseBy)`
	* `void withdrawal(Double amountToDecreaseBy)`
	* `Double getBalance()`

### Worker
* **Description**
	* The purpose of this interface is to ensure a class has `BankAccount`
* **Methods to Complete**
	* `BankAccount getBankAccount()`
	* `void setBankAccount(BankAccount bankAccount)`












<hr>
<hr>

## Section 4 - Collections
### Word Counter
* **Description**
	* The purpose of this class is to manage a mapping of `String` to `Integer`.
	* The class should be able to identify the number times a word has occurred in a given `String` array
		* A _word_ is a series of _characters_ delimited by _spaces_
* **Methods to Complete**
	* `Map<String, Integer> getWordCountMap()`

	
### Food
* **Description**
	* The purpose of this class is to manage a list of `Spice` object.
	* The class should be able to identify the number of specific spice-type applied to an instance of a food.
* **Methods to Complete**
	* `List<Spice> getAllSpices()`
	* `<SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount()`
	* `void applySpice(Spice spice)`

### Curry, Ginger, Pepper
* **Description**
	* The purpose of this class is to create a concrete implementation of a `Spice`
* **Methods to Complete**
	* `String getName()`
