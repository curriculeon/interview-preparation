## Jump The Flag

Tariq, the Kangaroo,  is trying to reach a flag that's `flagHeight` units above the ground. In his attempt to reach the flag, Tariq can make any number of jumps up the rock wall where it's mounted; however, he can only move up the wall (meaning he cannot overshoot the flag and move down to reach it). There are 2 types of jumps:

1. A jump of height 1.
2. A jump of height `jumpHeight`.
 

Tariq wants your help determining the minimum number of jumps it will take him to collect the flag. Complete the jumps function in your editor. It has 2 parameters:

1. An integer, `flagHeight`, the height of the flag.
2. An integer, `jumpHeight`, the number of units he ascends in a jump of type 2.


It must return an integer denoting the minimum number of times Tariq must jump to collect the flag.

 

### Input Format

```java
public int jumps(int flagHeight, int jumpHeight) {
}
```
 
**Constraints**

```
1 ≤ flagHeight ≤ 109
1 ≤ jumpHeight ≤ 109
```

**Output Format**

Your function must return an integer denoting the minimum number of jumps Tariq must make to collect the flag.



# Test Cases

### Sample Test 0

```java
// Should assert to true
Jumper jumper = new Jumper();
Integer expected = jumper.jumps(3,1);
Integer actual = 3;
Assert.assertEquals(expected, actual);
``` 

* **Explanation**
	* As Tariq can only jump 1 unit or `jumpHeight` units and `jumpHeight = 1`, Tariq can only ever make 1-unit jumps. This means that it will take him 3 steps to reach the flag, so we return 3.



### Sample Test 1

```java
// Should assert to true
Jumper jumper = new Jumper();
Integer expected = jumper.jumps(3,2);
Integer actual = 2;
Assert.assertEquals(expected, actual);
``` 

* **Explanation**
	* Tariq will jump `jumpHeight = 2` units, and then jump 1 more unit to reach the flag. Thus, we return 2.



### Sample Test 2

```java
// Should assert to true
Jumper jumper = new Jumper();
Integer expected = jumper.jumps(3,3);
Integer actual = 1;
Assert.assertEquals(expected, actual);
``` 

* **Explanation**
	* Tariq will make a single jump `jumpHeight = 3` units up the rock wall and reach the flag, so we return 1.
