# Quiz 6
## Overview
* This quiz has sections
	1. fundamentals
		* `BasicStringUtils`
		* `StringUtils` - difficult
	2. arrays
		* `ArrayUtils`
	3. collections
		* `CollectionUtils`
		* `PowerSet`
	4. generics
	    * `GenericUtils`
	4. generics
	    * `Television`
	    * `TVChannel`







<hr><hr>

## Section 1 - Fundamentals

### BasicStringUtils
* **Description**
	* The purpose of this class is to perform basic `String` manipulations.
* **Methods to Complete**
	* `String getString(char[])`
	* `String getString(Character[])`
	* `String removeAllVowels(String)`
	* `String removeSpecifiedCharacters(String, String)`

### StringUtils
* **Description**
	* The purpose of this class is to aggregate _utility methods_ to define a `getAllCasings` method.
* **Methods to Complete**
	* `Collection<String> getAllCasings(String)
	* `String upperCaseIndices(String, Integer...)`
	* `String insertAtIndex(String, String, Integer)`
	* `String replaceAtIndex(String, Character, Integer)`





## Section 2 - Arrays
### ArrayUtils
* **Description**
	* The purpose of this class is to manipulate Array objects
* **Methods to Complete**
	* `Integer[] getRange(Integer, Integer)`
	* `char[] unbox(Character[])`
	* `Character[] box(char[])`




<hr><hr>

## Section 3 - Object Orientation
### Television
* **Description**
	* The purpose of this class is to model a Television by composing a `TVChannel` and `isTurnedOn` flag.
* **Methods to Complete**
	* `void turnOn()`
	* `void setChannel(Integer channel)`
	* `TVChannel getChannel()`

### TVChannel
* **Description**
	* The purpose of this class is to create a set of Enumerations each representative of an expected `TVChannel`
* **Methods to Complete**
	* `TVChannel getByOrdinal(int)`
	













<hr><hr>

## Section 4 - Generics
### GenericUtils<T>
* **Description**
	* The purpose of this class is create methods to handle generic operations
* **Methods to Complete**
	* `<T> T[] toArray(Collection<T>`













<hr><hr>

## Section 5 - Collections
### CollectionUtils<T>
* **Description**
	* The purpose of this class is create methods to handle operations on collection objects
* **Methods to Complete**
	* `<E> List<E> toList(Collection)`
	* `Boolean contains(Collection<? extends Collection<?>>, Collection<?>)`
	* `Collection<? extends Collection<?>> nest(Collection<?>...)`
	* `Collection<?> flatten(Collection<?>...)`



	
