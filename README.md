# Bank Management System OOP

A console-based **Bank Management System** developed using **Core Java and Object-Oriented Programming (OOP) concepts**.

The application allows users to select different banks and perform basic banking operations such as creating an account, displaying account details, depositing money, withdrawing money, and checking account balance.

## Features

- Select different banks
- Create bank account
- Display account details
- Deposit money
- Withdraw money
- Check account balance
- Console-based menu
- Multiple bank implementations
- Input-based bank selection

## Supported Banks

The application supports the following banks:

1. State Bank of India (SBI)
2. India Post Payments Bank (IPPB)
3. Central Bank of India (CBI)
4. Bank of India (BOI)
5. HDFC Bank

## Banking Operations

After selecting a bank, the user can perform:

```text
1. Create Account
2. Display All Details
3. Deposit Money
4. Withdrawal
5. Balance Check
6. Exit
```

## OOP Concepts Used

This project demonstrates important Core Java and OOP concepts:

- Class and Object
- Interface
- Abstraction
- Inheritance
- Polymorphism
- Method Overriding
- Encapsulation
- Upcasting
- Dynamic Method Dispatch
- Packages
- Switch Statement
- Loops
- Scanner for User Input

## Polymorphism Example

The project uses the `Rbi` interface as a common reference for different bank implementations.

```java
Rbi bank = null;

switch(bankname) {

case 1:
    bank = new Sbi();
    break;

case 2:
    bank = new IPPB();
    break;

case 3:
    bank = new CBI();
    break;

case 4:
    bank = new BOI();
    break;

case 5:
    bank = new HDFC();
    break;
}
```

Here, the same `Rbi` reference can refer to different bank objects.

```java
Rbi bank = new Sbi();
Rbi bank = new IPPB();
Rbi bank = new CBI();
Rbi bank = new BOI();
Rbi bank = new HDFC();
```

This demonstrates **runtime polymorphism** and **upcasting**.

## Project Structure

```text
Bank_Management_System_OOP
│
├── src
│   └── com.braindata.bankmanagement
│       │
│       ├── client
│       │   └── Test.java
│       │
│       ├── model
│       │   └── Account.java
│       │
│       ├── service
│       │   └── Rbi.java
│       │
│       └── serviceImpl
│           ├── Sbi.java
│           ├── IPPB.java
│           ├── CBI.java
│           ├── BOI.java
│           └── HDFC.java
```

## Technologies Used

- Java
- Core Java
- Object-Oriented Programming
- Eclipse IDE

## How to Run

1. Clone or download this repository.
2. Open Eclipse IDE.
3. Import the project into Eclipse.
4. Open:

```text
src
└── com.braindata.bankmanagement.client
    └── Test.java
```

5. Run `Test.java` as a Java Application.
6. Select a bank.
7. Select the required banking operation.
8. Follow the instructions displayed in the console.

## Example

```text
Select Your Bank
<<------------------>>
1.Sbi
2.IPPB
3.CBI
4.BOI
5.HDFC

Enter Your Option: 1

Welcome to State Bank of India

Menu(Select One Option)
1.CreateAccount
2.DisplayAllDetails
3.DepositeMoney
4.Withdrawal
5.BalanceCheck
6.Exit
```

## Learning Objectives

The main purpose of this project is to understand how OOP concepts can be used to build a real-world application.

Through this project, the following concepts are practiced:

- Designing classes and interfaces
- Implementing interfaces
- Creating multiple implementations
- Runtime polymorphism
- Abstraction
- Encapsulation
- Method overriding
- Menu-driven applications
- User input handling

## Future Improvements

The project can be extended with:

- MySQL database integration
- JDBC
- Transaction history
- PIN authentication
- Account number generation
- Admin login
- Customer login
- Money transfer between accounts
- Exception handling
- Input validation
- Java Swing or JavaFX GUI

## Author

**Abhishek Rathod**

Computer Science & Engineering Graduate

## License

This project is created for learning and educational purposes.
