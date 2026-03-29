[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Payroll Management System

## Problem Statement (max 150 words)

Many small organizations face difficulties in managing payroll manually, leading to errors in salary calculation, tax deductions, and record maintenance. This system aims to provide a structured and object-oriented solution to manage employee payroll efficiently. It models employees with different salary structures and automates salary computation using modular and reusable components, ensuring accuracy and maintainability.


## Target User

Small businesses, startups, and organizations managing employee payroll manually.

## Core Features

- Add and remove employees
- Support for full-time and part-time employees
- Salary calculation with bonus and tax
- Display employee details
- Total payroll computation
- Input validation and exception handling

## OOP Concepts Used

- **Abstraction**: Abstract Employee class defining common structure
- **Inheritance**: FullTimeEmployee and PartTimeEmployee extend Employee
- **Polymorphism**: Overriding calculateSalary() for different employee types
- **Encapsulation**: Private fields with getters and setters
- **Exception Handling**: Validation for invalid inputs

## Proposed Architecture Description

The system follows a modular object-oriented architecture. The abstract Employee class defines shared attributes and behavior, while specialized subclasses implement specific salary logic. A PayrollManager class manages employee records and payroll operations. The Main class provides a menu-driven interface for user interaction, ensuring separation of concerns and scalability.

## How to Run

1. Open terminal in project folder
2. Navigate to src:
   cd src
3. Compile the code:
   javac *.java
4. Run the program:
   java Main

## Git Discipline Notes
Minimum 10 meaningful commits required.
