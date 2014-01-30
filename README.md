StackBasedVM
============

Java implementation of Stack-based VM

This should be a reference implementation of own version Stack-Based VM for other project.

Usage
=============

Machine use RPN (postfix)

Example: 2+2 --> 2 2 +

Commands
============

+ Plus - +
+ Minus - -
+ Multiplication - *
+ Division - *
+ Square root - SQRT
+ Duplicate first member - DUP
+ Swap first and second member - SWAP
+ Print and remove first member of stack - .
+ Print of whole stack - PRINT
+ Clear stack - CLR
+ Compare operators - <, >, <=, =>, ==, /=

Examples
============

If we want add 2 to 5 and show result, syntax will be:

2 5 + .

Result is:

7

Example of Pythagoras for 3 and 4:

3 4 dup * swap dup * + sqrt .

Result is: 

5

Compare operators
=======================

Compare operators works little different. If operator is true, add to stack 1. If operator is false, add to stack 0

Example:

2 3 < .

Is 2 smaller than 3? Yes, It is.

Result is:

1

Future
===========

+ Add more mathematics commands
+ Define macros (like Forth or Lisp)
