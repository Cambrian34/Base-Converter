# Base Converter Application

This is a JavaFX-based application that converts numbers between various bases, such as hexadecimal, decimal, binary, and octal. It allows users to input a number in one base and select the output base for conversion.

## Features

- **Input Bases**: 
  - Hexadecimal (Base 16)
  - Decimal (Base 10)
  - Binary (Base 2)
  - Octal (Base 8)
  
- **Output Bases**: 
  - Hexadecimal (Base 16)
  - Decimal (Base 10)
  - Binary (Base 2)
  - Octal (Base 8)

- **Functionality**: 
  - Converts between all the base combinations such as Hex to Decimal, Binary to Hex, Decimal to Binary, etc.
  
## Requirements

To run this application, you will need:

- Java 8 or higher
- JavaFX library

## How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/your-username/base-converter.git
Navigate to the project folder:
cd base-converter
Compile and run the application using your preferred IDE or the following command (make sure you have JavaFX set up):
javac Main.java
java Main
UI Overview

The application has a simple user interface with the following components:

Input Section: A text field where users can enter the number they want to convert.
Conversion Direction: Radio buttons that allow users to select the base of the input number and the base for the output.
Output Section: A text field displaying the result of the conversion.
Convert Button: A button that triggers the conversion when clicked.
Conversion Logic

The conversion process works by selecting the input base and the output base. Based on the user’s selection, the input number is converted accordingly.

Here are the conversion combinations supported by the application:

Hexadecimal to Hexadecimal
Hexadecimal to Decimal
Hexadecimal to Binary
Hexadecimal to Octal
Decimal to Hexadecimal
Decimal to Decimal
Decimal to Binary
Decimal to Octal
Binary to Hexadecimal
Binary to Decimal
Binary to Binary
Binary to Octal
Octal to Hexadecimal
Octal to Decimal
Octal to Binary
Octal to Octal
