# Bowling Game

## Summary

This is the Bowling Game project for TDD practice.

# TDD Rules
1. Smallest test sequence of meaning
1. Create Failure Test (Red Page)
1. Complete enough code to pass the Failing Test (Green page) 
1. Reflector (Blue Page)
1. Repeat --->

## Rules
- Bowling games consist of 10 frames.
- Each frame has up to two chances to knock down 10 pins.
- Spare: 10 + number of pins collapsed from first roll
- Strikes: Number of pins collapsed at 10+ next two rolls
- 10th frame can be thrown 3 times with spare treatment.

## Purpose
- Make Game *Class*
- It has two method (roll, score)
- The *roll* method is called every time you *roll* a ball. A factor has a knockout number of pins.
- Score methods are only called after a game to return the score of the game.

## Diagram
![diagram](assets/diagram.png)

# Result
If you think your production code becomes too complex or violates TDD design rules while writing tests, you should think about changing the structure of your production code.

---

## 참고
[ Clean Coders - msbaek ](https://www.youtube.com/user/codetemplate/videos)


