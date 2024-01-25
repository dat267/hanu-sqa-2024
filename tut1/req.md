# Software Quality Assurance

## Tutorial 1

In this tutorial, you will follow the principles of the Test-Driven Development methodology to develop some simple Java programs.

### Exercise 1

Write a method to square every digit of a number and concatenate them. For example, if we run 9119 through the function, 811181 will come out, because 9^2 is 81 and 1^2 is 1. Note: The method accepts an integer and returns an integer.

### Exercise 2

Mark is an accountant, and he wants to build a program to calculate the pre-tax price of products given a desirable sale (after-tax) price. For example: If the sale price is $12, then the actual price should be $11.42 (because $11.42 plus 5% is approximately $12). The tax rate is not always 5%; it depends on the sale price. If the sale price is less than $100, tax is 5%, but if the sale price is $100 or higher, tax is 10%. Write a program to get the expected sale price from the keyboard and display the pre-tax price, rounded to 2 decimal places. The rounding method should always reduce, not increase the resulting price. The program is allowed to have an error margin of $0.01 (1 cent).

### Exercise 3

Using TDD, write a program to calculate taxi fares from the distance (in KM) entered by the user. Following are the rules to calculate taxi fares:
- The minimum fare is 10,000 VND.
- The first kilometer costs 15,000 VND.
- The next 9 kilometers (from 2nd to 10th) cost 12,000 VND each.
- From the 11th kilometer, the cost is 11,000 VND per km and reduced by 500 VND every other 10 KMs until 7,000 VND. The travel distance is entered by the user in KMs. The program only accepts travel distances no more accurate than 10 meters. The calculated fee is rounded up to the nearest thousand (VND).

### Exercise 4

You are given a string of space-separated numbers and have to return the highest and lowest number. Examples:
- `highAndLow("1 2 3 4 5")` // return "5 1"
- `highAndLow("1 2 -3 4 5")` // return "5 -3"
- `highAndLow("1 9 3 4 -5")` // return "9 -5" Notes: There will always be at least one number in the input string. Output string must be two numbers separated by a single space, and the highest number is first.
