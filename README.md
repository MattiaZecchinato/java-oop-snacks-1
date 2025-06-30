# 🧃 Java OOP Snacks

A collection of small Java console applications demonstrating Object-Oriented Programming concepts like encapsulation, user interaction, and dynamic array handling.

## 📁 Project Structure

```
java-oop-snack-1/
├── src/
│   ├── org/
│   │   └── lessons/
│   │       └── java/
│   │            ├── contoBancario/
│   │            │   ├── ContoBancario.java
│   │            │   └── Main.java
│   │            ├── registroStudenti/
│   │            │   ├── RegistroStudenti.java
│   │            │   └── Main.java
│   │            ├── studente/
│   │            │   ├── Studente.java
│   │            │   └── Main.java
├── README.md
```

## 💸 Bank Account

### `ContoBancario.java`
- Models a bank account with:
  - Account number
  - Balance (using `BigDecimal` for precision)
- Methods:
  - `depositMoney(BigDecimal money)`: Adds money to the balance
  - `withdrawMoney(BigDecimal money)`: Withdraws money if the balance is sufficient
  - `getCurrentBalance()`: Returns the current balance
  - `getNumberBankAccount()`: Returns the account number

### `Main.java`
- Menu-driven program using `Scanner`
- Allows the user to:
  1. View the bank account number
  2. View the current balance
  3. Deposit money
  4. Withdraw money
  5. Exit the application

## 🎓 Student Register

### `Studente.java`
- Models a student with:
  - First name
  - Last name
  - Age
- Includes setters and getters with basic validation (e.g., minimum age)
- `getStudentData()`: Returns a formatted string with student information

### `RegistroStudenti.java`
- Manages an array of students
- `addStudent(String firstName, String lastName, int age)`: Adds a new student to the array
- `printStudentRegister()`: Prints the list of registered students

### `Main.java`
- Menu-driven program using `Scanner`
- Allows the user to:
  1. View the student register
  2. Add a new student
  3. Exit the application

## 👤 Student

### `Main.java` in the `studente` package
- Prompts the user to input a student's:
  - First name
  - Last name
  - Age
- Creates a `Studente` object and displays the full data using `getStudentData()`

## ⚙️ How to Compile and Run

### Compile

```bash
cd src
javac org/lessons/java/studente/Studente.java
javac org/lessons/java/registroStudenti/RegistroStudenti.java
javac org/lessons/java/contoBancario/ContoBancario.java
javac org/lessons/java/studente/Main.java
javac org/lessons/java/registroStudenti/Main.java
javac org/lessons/java/contoBancario/Main.java
```

### Run

```bash
java org.lessons.java.studente.Main
java org.lessons.java.registroStudenti.Main
java org.lessons.java.contoBancario.Main
```

## 👨‍💻 Author

[@Mattia Zecchinato](https://github.com/MattiaZecchinato)
