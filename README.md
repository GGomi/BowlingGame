# Bowling Game

## Summary
TDD연습을 위한 Bowling Game 프로젝트입니다.

## TDD Rules
1. 의미가 있는 가장 작은 테스트 순서로
1. Failing 테스트 작성(Red page)
1. Failing 테스트를 통과할 만큼의 코드를 작성(Green page) 
1. Refactor(Blue Page)
1. 반복 --->

## Rules
- 볼링게임은 10개의 프레임으로 구성된다.
- 각 프레임은 10개의 핀을 쓰러뜨리기위해 최대 2번의 기회를 갖는다.
- 스페어 : 10 + next first roll에서 쓰러뜨린 핀 수
- 스트라이크 : 10 + next two rolls에서 쓰러뜨린 핀 수
- 10번째 프레임은 스페어 처리하면 3번 던질 수 있다.

## Purpose
- Game 클래스를 생성해야한다.
- Game 클래스는 *roll*과 *score*라는 2개의 메소드를 갖는다.
- *roll*은 ball을 roll할 때마다 호출된다. 인자로는 쓰러뜨린 핀 수를 갖는다.
- score 메소드는 게임이 끝난 후에만 호출되어 게임의 점수를 반환한다.

## Diagram
![diagram](assets/diagram.png)

---

## Result
테스트를 작성하다가 프로덕션코드가 너무 복잡해지거나 TDD 디자인 규칙에 어긋난다고 생각이 들면 프로덕션코드의 구조를 확 바꿀 생각을 해야함.

---
## 참고
[ 클린코더스 - 백명석님 (msbaek) ](https://www.youtube.com/user/codetemplate/videos)
