# Java 11 Features Demonstration

This project demonstrates several features introduced in Java 11, with simple examples and explanations. It is structured as a Maven project.

## Features Demonstrated

- **Local-Variable Syntax for Lambda Parameters** (`var` in lambda)
- **List.toArray()** method
- **String.strip()**, **String.stripLeading()**, **String.stripTrailing()** methods
- **String.isBlank()** method
- **String.repeat()** method
- **String.lines()** method
- **HttpClient API** for HTTP requests

## Project Structure

- `com.java11.service.Service`: Contains methods demonstrating Java 11 String and List features.
- `com.java11.service.http.HttpClientService`: Demonstrates the new HttpClient API.
- `com.java11.exec.Main`: Entry point that runs all demonstrations.

## How to Build and Run

1. **Build the project:**
   ```sh
   mvn clean package
   ```
2. **Run the main class:**
   ```sh
   mvn exec:java -Dexec.mainClass="com.java11.exec.Main"
   ```

## Method Explanations

- `getListItems()`: Uses `var` in lambda expressions.
- `listToArray()`: Demonstrates `List.toArray()` method.
- `stripString(String value)`: Uses `String.strip()` to remove leading/trailing whitespace.
- `trimString(String value)`: Uses `String.trim()` (for comparison with `strip()`).
- `stripLeadingString(String value)`: Uses `String.stripLeading()`.
- `stripTailingString(String value)`: Uses `String.stripTrailing()`.
- `isBlankString(String value)`: Checks if a string is blank with `String.isBlank()`.
- `repeatString(String value, int numberOfRepeats)`: Repeats a string using `String.repeat()`.
- `linesString(String value)`: Splits a string into lines using `String.lines()`.
- `sendHttpRequest()`: Demonstrates the new `HttpClient` API by sending a GET request.

---

Feel free to explore the code and modify the examples to further experiment with Java 11 features.
