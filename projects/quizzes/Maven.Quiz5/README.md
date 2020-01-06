# Quiz 5
## Overview
* This quiz has sections
	1. fundamentals
		* `StringEvaluator`
		* `PalindromEvaluator`
	2. object orientation
		* `PalindromeObject`
		* `StringAssembler`
		* `StringEvaluatorObject`
	3. collections
		* `Student`
		* `ZipCodeWilmington`
		* `SimpleStringGroup`
	4. generics
	    * `MyStack`
	    * `Group`
	    * `SortedGroup`
	    * `GenericUtils` - Difficult
	    * `ComparableTreeSet` - Very Difficult







<hr><hr>

## Section 1 - Fundamentals

### PalindromeEvaluator
* **Description**
	* The purpose of this class is to evaluator palindromes.
	* A _palindrome_ is a word or phrase that is spelled the same forwards and backwards.
		* the word `racecar` is an example of a palindrome
* **Methods to Complete**
	* `String reverseString(String str)`
	* `Boolean isPalindrome(String str)`
	* `String[] getAllPalindromes(String str)`

### StringEvaluator
* **Description**
	* The purpose of this class is to create a utility class for `String`
* **Methods to Complete**
	* `String[] getAllSubstrings(String string)`
	* `String[] getCommonSubstrings(String string1, String string2)`
	* `String[] getLargestCommonSubstring(String string1, String string2)`


## Section 2 - Object Orientation
### PalindromeObject
* **Description**
	* The purpose of this class is to create an object capable of evaluating palindromes.
* **Methods to Complete**
	* `String reverseString()`
	* `Boolean isPalindrome()`
	* `String[] getAllPalindromes()`


### StringAssembler
* **Description**
	* The purpose of this class is to create a wrapper class for `StringBuilder` 
* **Methods to Complete**
	* `StringAssembler append(String string)`
	* `String append()`


### StringEvaluatorObject
* **Description**
	* The purpose of this class is to create a wrapper object for `StringEvaluator` 
* **Methods to Complete**
	* `String[] getAllSubstrings()`
	* `String[] getCommonSubstrings(String string2)`
	* `String[] getLargestCommonSubstring(String string2)`











<hr><hr>

## Section 3 - Collections
### Student
* **Description**
	* The purpose of this class is to manage `totalAmountOfHoursLearned`
* **Methods to Complete**
	* `void learn(Double amountOfHours)`
	* `Double getTotalStudyTime()`

### ZipCodeWilmington
* **Description**
	* The purpose of this class is to mediate `List` of `Student` objects.
* **Methods to Complete**
	* `void enroll(Student student)`
	* `Boolean isEnrolled(Student student)`
	* `void lecture(double numberOfHours)`
	* `Map<Student, Double> getStudyMap()`

### SimpleStringGroup
* **Description**
	* The purpose of this class is to create a wrapper of `List` of `String` objects
* **Methods to Complete**
	* `Integer count()`
	* `void insert(String string)`
	* `Boolean has(String string)`
	* `String fetch(int indexOfValue)`
	* `void delete(String string)`
	* `void clear()`














<hr><hr>

## Section 4 - Generics
### MyStack<T>
* **Description**
	* The purpose of this class is to implement a _proper_ `Stack`.
* **Methods to Complete**
	* `void push(T value)`
	* `T peek()`
	* `T pop()`
	* `Boolean isEmpty()`

### Group<T>
* **Description**
	* The purpose of this class is to create a generic wrapper for a `List` object
* **Methods to Complete**
	* `Integer count()`
	* `void insert(T value)`
	* `Boolean has(T value)`
	* `T fetch(int indexOfValue)`
	* `void delete(T value)`
	* `void clear()`
	* `Iterator<T> iterator()`

### SortedGroup<T>
* **Description**
	* The purpose of this class is to create a generic wrapper for sorted `List` object.
* **Methods to Complete**
	* `insert(T value)`
	* `delete(T value)`
	* `Integer indexOf(T value)`

### GenericUtils
* **Description**
	* The purpose of this class is to create a procedure to generate the [power set](https://www.mathsisfun.com/sets/power-set.html) of an `Set` of objects.
* **Methods to Complete**
	* `<T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet)`
	* `<T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet)`

### ComparableTreeSet<T>
* **Description**
	* The purpose of this class is to create subclass of a `TreeSet<T>` which can `compareTo` other objects of the same type.
	* This shit is hard.
* **Methods to Complete**
	* `int compareTo(ComparableTreeSet<T> o)`
	
