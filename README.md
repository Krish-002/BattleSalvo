# CLI BattleSalvo Game

![BattleSalvo Logo](battle_salvo_logo.png)

BattleSalvo is a Command Line Interface (CLI) game where players engage in strategic naval warfare. The game can be played locally against a computer with smart algorithms or as a multiplayer game over a server. It is implemented in Java and follows the Model-View-Controller (MVC) design pattern. The game incorporates various algorithms, data structures, and design principles to provide an enjoyable gaming experience.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Game Modes](#game-modes)
- [Installation](#installation)
- [How to Play](#how-to-play)
- [Technologies Used](#technologies-used)
- [Contributing](#contributing)

## Introduction

BattleSalvo is a classic naval combat game where players take turns firing salvos of missiles at each other's fleets, aiming to sink their opponent's ships. The game offers both a single-player mode against the computer and a multiplayer mode over a server. The computer player utilizes smart algorithms to attack strategically, providing a challenging experience for the players.

## Features

- Engaging CLI-based gameplay with intuitive commands and prompts.
- Single-player mode against the computer with intelligent algorithms for the opponent.
- Multiplayer mode over a server, allowing players to compete with their friends.
- A variety of ships with different sizes and characteristics to create diverse strategies.
- Real-time game state updates and notifications during multiplayer matches.
- Error handling for invalid input and game rule violations.
- Save and load functionality to resume single-player games later.
- Comprehensive unit tests using JUnit5 for ensuring the game's correctness.

## Game Modes

### Single-Player Mode

In single-player mode, the player faces off against the computer AI. The AI is equipped with smart algorithms designed to make strategic decisions during gameplay, providing a challenging experience for the player.

### Multiplayer Mode

In multiplayer mode, players can compete against each other over a server. The server handles the game state, turn management, and ensures smooth communication between players. Players take turns firing salvos at each other, and the game continues until one player's fleet is completely destroyed.

## Installation

To run BattleSalvo on your local machine, follow these steps:

1. Clone the repository from GitHub:
git clone https://github.com/Krish-002/BattleSalvo.git
cd battlesalvo/src/main/java/cs3500


2. Compile the driver file:
javac Driver.java


## How to Play

### Single Player Mode

To play against the computer:

java Driver


### Multiplayer Mode

join existing game:

java Driver [host] [port]


## Technologies Used

- Java: The programming language used to implement the game logic and CLI interface.
- Model-View-Controller (MVC) Design Pattern: Organizing the codebase to separate concerns for better maintainability.
- CLI Development: Building an interactive Command Line Interface for user interaction.
- Algorithms and Data Structures: Implementing algorithms for ship placement, AI moves, and game state management.
- JUnit5: Writing unit tests to ensure the correctness of the implemented functionality.
- SOLID Principles: Designing the codebase with focus on maintainability and extensibility.
- Git: Version control system used for collaborative development.
- JSON and Jackson Library: Handling data serialization for saving and loading game states.
- Design Patterns: Utilizing design patterns to solve common problems in software development.

## Contributing

Contributions to BattleSalvo are welcome! If you find any issues or want to add new features, feel free to open an issue or submit a pull request. Please ensure that your code follows the established coding standards and is adequately tested.
