# Duck Behavior Simulation

## Overview
- This project demonstrates the behavior of different types of ducks using the **Strategy Pattern**.
- Ducks exhibit different behaviors for **quacking, swimming, and flying**, which are implemented using separate interfaces and classes.

## Features
- Implements **Strategy Pattern** for managing duck behaviors.
- Uses interfaces **FlyBehavior** and **SwimBehavior** for flexible behavior assignment.
- Supports multiple duck types:
  - **Mallard Duck**
  - **RedHead Duck**
  - **Rubber Duck**
  - **Decoy Duck**
- Demonstrates dynamic behavior changes at runtime.

## Class Structure
- **Main.java** → Runs the program and displays duck behaviors.
- **Duck.java** → Abstract class defining common duck behaviors.
- **QuackBehavior.java** → Interface for quacking behavior.
- **SwimBehavior.java** → Interface for swimming behavior.
- **FlyBehavior.java** → Interface for flying behavior.
- **Concrete Quack Behaviors:**
  - `Quack.java` → Implements normal quack.
  - `Squeak.java` → Implements squeaky sound.
  - `MuteQuack.java` → No quack.
- **Concrete Swim Behaviors:**
  - `SwimWithLegs.java` → Normal swimming.
  - `Floating.java` → Floating on water.
  - `Drowning.java` → Cannot swim.
- **Concrete Fly Behaviors:**
  - `Fly.java` → Can fly.
  - `NotFly.java` → Cannot fly.
- **Duck Subclasses:**
  - `MallardDuck.java` → Swims with legs, quacks, and flies.
  - `RedHeadDuck.java` → Similar to Mallard Duck.
  - `RubberDuck.java` → Floats and squeaks, cannot fly.
  - `DecoyDuck.java` → Does not quack, flies, or swim.

