# Word Mania README


## Introduction

The **Word Mania** program is an interactive word guessing game designed for kids. Players are challenged to guess and spell words within a limited number of attempts.

## How to Play

1. **Setup**: Upon running the program, a random word is selected from a predefined list of words.
2. **Gameplay**: Players are presented with a series of underscores representing the letters of the word to be guessed. They must guess individual letters to spell out the word.
3. **Guessing**: Players enter one letter at a time to guess the word. They have a limited number of attempts to guess the correct letters.
4. **Feedback**: After each guess, players receive feedback on whether their guess is correct or incorrect.
5. **Completion**: If the player successfully guesses all the letters of the word within the allotted attempts, they win the game. Otherwise, they lose.

## How to Run

To run the Word Mania program:
1. Compile the Java file `wordMania.java`.
2. Execute the compiled Java class file.

Example:
```bash
javac wordMania.java
java wordMania
```

## Program Details

- The program randomly selects a word from a predefined list of words.
- Players have a limited number of attempts to guess the letters of the word.
- Correctly guessed letters are revealed in the word display.
- The game ends when the player successfully guesses the entire word or runs out of attempts.

## Program Structure

- The `wordMania` class contains the main method for running the game.
- The list of words to be guessed is stored in an array.
- The game logic handles user input, word selection, guessing, and feedback.

 