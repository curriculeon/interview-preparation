# Assessment 2

## Question 1

Finish the class called "TCMath" using Test Driven Development, using atleast 2 custom test, so that can determine whether a given integer number is prime. 

## Question 1 Example

String response = TCMath.isPrime(7);  
// should return the following  
1: *** Output ***  
2: true
### Question 2 GCD

Use [Euclid’s Algorithm](http://en.wikipedia.org/wiki/Euclidean_algorithm) to finish the class called "EuclidMath" using Test Driven Development, using atleast 2 custom test, so that can determine the Greatest Common Divisor of two positive integer numbers

http://en.wikipedia.org/wiki/Euclidean_algorithm

#### Question 2 Example

1: String response1 = euclidMath.gcd(1071, 462);  
2: *** Output ***  
3: 21  
4: String response2 = euclidMath.gcd(6, 35);  
5: *** Output ***  
6: 1  
7: String response3 = euclidMath.gcd(36, 63);  
8: *** Output ***  
9: 9 

### Question 3 Coprimes

Finish the class called "Optimus" using Test Driven Development, using atleast 2 custom test, so that can determine whether two positive integer numbers are coprime. Two numbers are coprime if their greatest common divisor equals 1.

#### Question 3 Example

1: String response = optimus.isCoprime(35,64);  
2: *** Output ***  
3: true

### Question 4 Totient Function

Finish the class called "MoreEuler" using Test Driven Development, using atleast 2 custom test, so that can calculate Euler’s totient function phi(m).

Euler’s so-called totient function phi(m) is defined as the number of positive integers r (1 <= r < m) that are coprime to m.

For example: m = 10: r = 1,3,7,9; thus phi(m) = 4\. Note the special case: phi(1) = 1.

#### Question 4 Example

1: String response = moreEuler.phi(10);  
2: *** Output ***  
3: 4 

### Question 5 Goldbach’s Conjecture

Goldbach’s conjecture says that every positive even number greater than 2 is the sum of two prime numbers. Example: 28 = 5 + 23\. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers. Finish the class called "goldBach" using Test Driven Development, using atleast 2 custom test, so that can write a predicate to find the two prime numbers that sum up to a given even number.

#### Question 5 Example

1: String response1 = goldBach.Pair(28);  
3: *** Output ***  
4: 5 + 23 = 28  
2: String response2 = goldBach.Pair(1856);  
3: *** Output ***  
5: 67 + 1789 = 1856 

### Question 6 More Goldbach

Extending GoldBach object

Given a range of integers by its lower and upper limit, print a list of all even numbers and their Goldbach composition.

In most cases, if an even number is written as the sum of two prime numbers, one of them is very small. Very rarely, the primes are both bigger than say 50\. Try to find out how many such cases there are in the range 2..3000.

#### Question 6 Example

01: String response1 = goldBach.List(9, 20);  
02: *** Output ***  
03: 3 + 7 = 10  
04: 5 + 7 = 12  
05: 3 + 11 = 14  
06: 3 + 13 = 16  
07: 5 + 13 = 18  
08: 3 + 17 = 20  
09: String response2 = goldBach.list(1,2000,50);  
10: *** Output ***  
11: 73 + 919 = 992  
12: 61 + 1321 = 1382  
13: 67 + 1789 = 1856  
14: 61 + 1867 = 1928