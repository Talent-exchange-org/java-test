
## 2020.12.10

maven은 여러가지 목적으로 사용되는데,
가장 많이 사용되는 목적은 라이브러리를 다운 받는거예요

테스트 코드는 로직이 정상적으로 작동하는지 Assertion 하기 위해 작성한다.

call by value & call by reference

## 2020.12.23

### 메모리 구조
- Static area 
  
  모든 메서드, 정적 멤버변수, 상수 등이 저장된다.
  
  프로그램이 시작할때 로드되어서 끝날때까지 존재한다.
  
- Stack area

  런타임에서 실행되는 지역변수가 저장된다.

  메서드가 호출되면 메모리에 할당되고, 종료되면 해제된다.

- Heap area

  실제 데이터가 저장된 stack area에 존재하는 인스턴스의 참조값(reference)가 저장된다.

  stack area와 다르게 메서드 호출이 끝나도 제거되지 않고, 메모리를 참조하는 값이 없어지면 GC에 의해 제거된다. (혹은 JVM 종료시까지.)


#### stack vs queue
- stack
  
  FILO (First Input Last Ouput)

  바구니(책, 필통, 티슈) -> (티슈, 필통, 책)

- queue 
  
  FIFO (First Input First Ouput)

  파이프(책, 필통, 티슈) -> (책, 필통, 티슈)

#### 함수 실행시 스택구조
a -> b -> c 
```
// 함수 실행에 따른 stack 메모리 구조 
          c
     b    b    b
a -> a -> a -> a -> a
```
