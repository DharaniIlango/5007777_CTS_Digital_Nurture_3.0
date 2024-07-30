# ObserverPatternExample

## Overview

This project demonstrates the Observer Pattern using a stock market monitoring application. In this application, multiple clients (observers) are notified whenever stock prices change.

## Project Structure

ObserverPatternExample/
├── build.gradle
├── settings.gradle
├── src
│ ├── main
│ │ ├── java
│ │ │ └── org
│ │ │ └── digital
│ │ │ └── nurture
│ │ │ ├── Stock.java
│ │ │ ├── StockMarket.java
│ │ │ ├── Observer.java
│ │ │ ├── MobileApp.java
│ │ │ ├── WebApp.java
│ │ │ └── Main.java
│ └── test
│ ├── java
│ │ └── org
│ │ └── digital
│ │ └── nurture
│ │ └── StockMarketTest.java
└── README.md

## How to Run

1. **Clone the repository**:
   ```sh
   git clone <repository-url>
   cd ObserverPatternExample
   ```
2. **Build the Project:**
   ```sh
   ./gradlew build
   ```
3. **Run Tests:**
   ```sh
   ./gradlew test
   ```
4. **Run the Application:**
   ```sh
   ./gradlew run
   ```

# Observer Pattern Implementation

## Subject Interface (`Stock`)

Defines methods to register, deregister, and notify observers.

## Concrete Subject (`StockMarket`)

Implements the `Stock` interface and maintains a list of observers. It notifies observers whenever the stock price changes.

## Observer Interface (`Observer`)

Defines the `update` method that concrete observers must implement.

## Concrete Observers (`MobileApp`, `WebApp`)

Implement the `Observer` interface and provide the update logic.

## Example Usage

The `Main` class demonstrates the registration of `MobileApp` and `WebApp` observers and the notification mechanism when the stock price changes.