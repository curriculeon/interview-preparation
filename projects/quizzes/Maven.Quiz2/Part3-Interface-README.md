# Interface & Abstract

### Section 1: The Animals
Create the following animals:
1. `Horse` is a concrete class which implements Animal.
    - `move` will return the string `"gallop"`
    - `color` will return the string `"brown"` (Yes I am aware not all horses are brown.)
    - `getSpeed` will return `40`
2. `Bird` is an abstract class that implements Animal.
    1. `move` will return the string `"fly"` (Yes I am aware not all birds fly.)
3. `BlueJay` is a concrete class which extends from Bird
    - `color` will return the string `"blue"`
    - `speed` will return `13`
4. `RedRobin` is a concrete class which extends from Bird
    - `color` will return the string `"red"`
    - `speed` will return `10`
    - Add a `String migrationMonth` field. Add a getter and setter for it.

### Section 2: Speed Comparator
2. Create a SpeedComparator class. The class should implements `Comparator<Animal>`
3. Implements the `int compare(Animal animal1, Animal animal2)` method
  1. If animal1's and animal2's speed are the same, then return 0
  2. If animal1's speed is greater than animal2 speed, then return a negative number
  3. If animal1's speed is less than animal2 speed, then return a positive number 
