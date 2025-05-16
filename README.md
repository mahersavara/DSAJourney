# DSAJourney

Welcome to **DSAJourney**, a project dedicated to exploring and implementing data structures and algorithms (DSA) in Kotlin and Java. This repository includes solutions to common algorithmic problems, such as string permutations.

---

## 🚀 Project Overview

This project was initially written in Java and has been transformed into a Kotlin-based project to leverage Kotlin's modern features and concise syntax. The repository contains implementations of various data structures and algorithms, along with examples and explanations.

---

## 📂 Project Structure

```
DSAJourney/
├── src/
│   ├── Main.java                     # Entry point for the project
│   └── string_permutation/           # Folder for string permutation problem
│       ├── StringPermutation.kt      # Kotlin implementation of string permutations
│       └── input.txt                 # Sample input file for testing
├── .gitignore                        # Git ignore rules
├── README.md                         # Project documentation
└── .git/                             # Git configuration files
```

---

## 🚀 String Permutation Problem

The **string permutation problem** involves generating all possible permutations of a given string. This is a common problem in combinatorics and is useful in various applications such as generating passwords, solving puzzles, and more.

### 📖 How It Works

1. **Input**: A string is read from the `input.txt` file.
2. **Processing**: The program generates all permutations of the string using recursion.
3. **Output**: The permutations are printed to the console.

---

## 🛠️ Features

- **Kotlin-based Implementation**: Clean and concise code written in Kotlin.
- **Beginner-Friendly**: Easy-to-understand examples for learning DSA concepts.
- **Scalable**: Designed to grow with additional algorithms and data structures.

---

## 🧑‍💻 Getting Started

### Prerequisites
- **Kotlin Compiler**: Install Kotlin from [Kotlin's official website](https://kotlinlang.org/).
- **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed.
- **Git**: Install Git to clone the repository.

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mahersavara/DSAJourney.git
   cd DSAJourney
   ```

2. Compile and run the project:
   ```bash
   kotlinc src/Main.kt -include-runtime -d Main.jar
   java -jar Main.jar
   ```

---

### Steps to Run the String Permutation Program

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/mahersavara/DSAJourney.git
   cd DSAJourney
   ```

2. **Navigate to the `string_permutation` Folder**:
   ```bash
   cd src/string_permutation
   ```

3. **Compile and Run the Program**:
   - For Kotlin:
     ```bash
     kotlinc StringPermutation.kt -include-runtime -d StringPermutation.jar
     java -jar StringPermutation.jar
     ```
   - For Java (if implemented in Java):
     ```bash
     javac Main.java
     java src.Main
     ```

4. **Input File**:
   - Modify the `input.txt` file to include your desired string for testing.
   - Example:
     ```
     abc
     ```

5. **Output**:
   - The program will print all permutations of the input string to the console.
   - Example:
     ```
     Input String: abc
     Permutations:
     abc
     acb
     bac
     bca
     cab
     cba
     ```

---

## 📖 Usage

- Modify the `Main.kt` file to add your own algorithms or data structures.
- Use this project as a template for your DSA learning journey.

---

## 🤝 Contributing

Contributions are welcome! If you'd like to contribute:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your feature description"
   ```
4. Push to your branch:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Open a pull request.

---

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## 🌟 Acknowledgments

- Inspired by the need to make DSA learning accessible and fun.
- Special thanks to the Kotlin and GitHub communities for their amazing tools and support.

---

## 📬 Contact

For questions or feedback, feel free to reach out:
- **GitHub**: [mahersavara](https://github.com/mahersavara)

---
