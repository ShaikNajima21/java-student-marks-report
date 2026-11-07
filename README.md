# Build a student marks report

A program that reads the names and marks of a class, then prints a neat report: a table with each grade, the class average, the topper and how many passed.

Marks outside 0 to 100 are not accepted; the program asks again.

## Features

- Ask how many students there are (at least 1); a smaller number prints `Enter at least 1: ` and asks again.
- Read each student's first name and marks into two arrays.
- Accept marks only from 0 to 100; ask again otherwise.
- Give a grade: A (90+), B (75+), C (60+), D (35+), F (below 35).
- Print a table of name, marks and grade with `printf`.
- Print the class average (2 decimals), the topper and how many passed (35 or more).

## How to run

```
javac *.java
java MarksReport
```

## Sample run

```
=== Student Marks Report ===
How many students? 3
Name of student 1: Asha
Marks (0-100): 92
Name of student 2: Rahul
Marks (0-100): 105
Marks must be from 0 to 100. Try again: 67
Name of student 3: Meena
Marks (0-100): 30

Name       Marks Grade
----------------------
Asha          92     A
Rahul         67     C
Meena         30     F
----------------------
Class average: 63.00
Topper: Asha (92)
Passed: 2 of 3
```

## Author

ShaikNajima21
