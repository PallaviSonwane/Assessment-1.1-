# Task1
# Reverse Words in a File

Java program to reverse each word in a text file while preserving punctuation.

## Features

- Reads from `input.txt` and writes reversed words to `output.txt`.
- Preserves non-alphanumeric characters at word boundaries.
- Utilizes `java.util.logging` for logging operations and errors.
- Handles file operations using `BufferedReader` and `BufferedWriter`.
- Includes exception handling for file I/O errors.

## Instructions

- **Setup:**
  - Place your input text in a file named `input.txt` in the same directory as `StringReverce.java`.

- **Compile:**
  - Open a terminal or command prompt.
  - Navigate to the directory containing `StringReverce.java`.
  - Run the following command to compile:
    ```sh
    javac StringReverce.java
    ```

- **Run:**
  - Execute the compiled Java program:
    ```sh
    java StringReverce
    ```

- **Output:**
  - The reversed words will be written to `output.txt` in the same directory.

## Logging

- Logs messages using Java's built-in logging framework (`java.util.logging`).
- Prints log messages to the console indicating successful operations or file handling errors.

## Example

### Input (`input.txt`)
Hello Good Morning India.


### Output (`output.txt`)
olleH dooG gninroM aidnI.

