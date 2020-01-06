# Part 2 - Collections

## Section 1 - ArrayUtility
2. Ensure all the tests pass

### Methods
1. `Integer[] merge(Integer[] array1, Integer[] array2)` - given two arrays, create a new array with elements from both array. Return the new array.
2. `Integer[] rotate(Integer[] array, int number)` - given an array and a number, rotate the content to the left as many times as the number given. Return the new rotated array. 
For example, given `Integer[] array = {5, 4, 2, 18};`, calling `utility.rotate(array, 2);` will move the first two numbers to the back so the returning array looks like this: `{2, 18, 5, 4}`.
3. `Integer countOccurrance(Integer[] array1, Integer[] array2, Integer valueToCount)` - count how many time a number appear in both arrays
4. `Integer mostCommon(Integer[] array)` return the element that appears in the array the most. For example, given an array `{1, 5, 5, 7}`, the result should be 5 because there are two fives while there are only one one and one seven.


## Section 2 - ListUtility
2. Create a new class named `ListUtility` in `src/test/java/com/zipcodewilmington/part2/`
3. Make all the tests pass

### Methods
1. `boolean add(Integer number)` - add an element to the list. Return true if it was successful. Return false otherwise
2. `int size()` - the number of elements that was added
3. `List<Integer> getUnique()` - return all the unique element in the list. For example, if you add `4, 1, 8, 3, 3, 1, 7` to the list, the method should return a new list with `4, 1, 8, 3, 7`.
4. `String join()` - join all the elements together, separate them by a comma and space `, `. 
5. `Integer mostCommon()` - return the element that appears in the list the most. For example, if you add `1, 5, 5, 7`, the return value should be 5 because there are two fives while there are only one one and one seven.

## Section 3 - Router
In a common web application framework, there is usually a Router class which figures out which class to call when the user goes to a certain url. The class that actually handle the user request are called the controller. 
In this section we will write a basic router which stores the url path and the associated controller. 

2. Create a new class named `Router` in `src/test/java/com/zipcodewilmington/part2/`
3. Make all the tests pass

### Methods
1. `void add(String path, String controller)` - given two String (a key, and a value), add the string to the map
2. `int size()` - the number of elements that was added
3. `String getController(String path)` - given a path (the key), return the controller's name (the value) associated with that path
4. `void update(String path, String newController)` - given a path and a new controller, associate the new controller to that path
5. `void remove(String path)` - remote the path from the routes
6. `String toString()` - List out all the path and its controller. Separate each path by a new line (`\n`). The format should be `path -> controller`.

```
   /user -> UserController
   /student -> StudentController
```
