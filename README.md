# Task-2-Prasannanjaneyulu-Muppaneni
### Project Explanation – Student Grade Calculator

The **Student Grade Calculator** is a Java console application that calculates a student's academic performance based on marks obtained in multiple subjects.

#### Working of the Program

1. The program first asks the user to enter the **number of subjects**.
2. It then uses a **for loop** to read marks for each subject.
3. A **while loop** and **exception handling** are used to ensure that only valid numeric marks are accepted.
4. If the user enters a non-numeric value (such as `a`, `@`, or `abc`), the program displays an error message and asks for the input again.
5. If the entered marks are less than **0** or greater than **100**, the program rejects the value and prompts the user to re-enter the marks.
6. After collecting all valid marks, the program calculates:

   * **Total Marks** = Sum of all subject marks
   * **Average Percentage** = Total Marks ÷ Number of Subjects
7. Based on the average percentage, the program assigns a grade:

   * **A** : 90 and above
   * **B** : 80 – 89
   * **C** : 70 – 79
   * **D** : 60 – 69
   * **F** : Below 60
8. Finally, the program displays the total marks, average percentage, and grade.

#### Concepts Used

* Scanner Class
* Variables and Data Types
* Loops (`for`, `while`)
* Conditional Statements (`if-else`)
* Exception Handling (`try-catch`)
* Arithmetic Operations
* Type Casting
* Input Validation

#### Features

* Accepts marks for any number of subjects.
* Prevents invalid marks outside the range 0–100.
* Handles non-numeric input without crashing.
* Calculates results accurately.
* Displays output in a clear and user-friendly format.

This project helps beginners understand input handling, validation, looping, exception handling, and decision-making in Java.
