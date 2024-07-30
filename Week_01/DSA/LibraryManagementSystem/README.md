# Library Management System

## Overview
This Java project implements a simple Library Management System where users can search for books by title using linear and binary search algorithms.

## Project Structure
- `lms/`
  - `Book.java`: Defines the `Book` class with attributes `bookId`, `title`, and `author`.
  - `LinearSearch.java`: Contains a method to perform a linear search for a book by title.
  - `BinarySearch.java`: Contains a method to perform a binary search for a book by title.
  - `Main.java`: Main class to demonstrate linear and binary search functionalities.

## Search Algorithms

### Linear Search
- **Time Complexity**: O(n)
- **Description**: Checks each element of the list one by one until the desired element is found or the list ends.

### Binary Search
- **Time Complexity**: O(log n)
- **Description**: Efficiently searches a sorted list by repeatedly dividing the search interval in half.

## Usage
1. Compile the project using a Java compiler.
2. Run the `Main` class to see the results of linear and binary search.

## Compilation and Execution
To compile and run the project:

**1. Navigate to the `src` in the project directory:**
```sh
cd src
```
**2. Compile and Run the `Main` Class:**
```sh
javac lms/*.java
java lms.Main
```