package chapter08;

/*      === 추상화 (Abstract) ===
         1. 추상화 클래스 정의
         2. 미완성 설계도, 완전하지 않은 클래스
          >> 직접 인스턴스를 생성할 수 없음!
          >> 다른 클래스가 상속받아 구현해야 사용 가능

          2. 추상화 클래스 특징
           1) 클래스 자체로 인스턴스 생성 X
           2) 하나 이상의 추상 메서드를 포함
           3) 확장성 제공을 위해 사용
           - 자식 클래스들이 공통된 기능을 공유 + 고유 기능을 구현하도록 강제
           4) 다중 상속 불가능 ! - extends 만 가능

           +) 메서드 오버라이딩과 추상화 메서드
           - 추상화 메서드: 반드시 자식 클래스에서 오버라이딩해야 함
           - 일반 메서드: 필요에 따라 오버라이딩 가능

          3. 추상화 클래스 구현 방법
            클래스 선언 앞에 'abstract' 키워드 사용

          4.  추상 메서드
           메서드의 선언부만 존재, 구현부가 없는 메서드
          >> 자식 클래스에서 해당 메서드를 반드시 구현하도록 강제하는 역할 !
          >> abstract 키워드를 사용 + 구현부 {} 대신 세미콜론; 을 사용하여 선언을 마침

          5. 메서드의 구성: 선언부 + 구현부
          (접근 제한자) 반환타입 메서드명 (파라미터) {메서드의 기능 동작)
*/

/*
    abstract class Lion {
    abstract void mane();   // 갈기

    }

    abstract class Tiger {
    abstract void stripe();     // 줄무늬
}

    class Liger extends Liom extends Tiger {    - 다중 상속 불가 !
    void mane() {
    }

    void stripe() {     - 해당 메서드를 상속 받을 수 없음
    }
    }
*/

//  추상화 클래스
   abstract class Human {

      abstract void work();     // 추상화 메서드
}

    class Police extends Human{
//      추상화 메서드 구현!
        void work() {
            System.out.println("경찰은 치안유지 업무를 담당합니다.");
        }
    }
    class Student extends Human {
//        추상화 메서드 구현!
        void work() {
            System.out.println("학생은 공부를 합니다.");
    }
    }

    abstract class Animal {
       abstract void maksSound();

        void eat() {
            System.out.println("동물은 먹이를 먹습니다.");
        }
    }

    class Dog extends Animal {

        void maksSound() {
            System.out.println("멍멍");
        }

        @Override
        void eat() {
            System.out.println("강아지는 개껌을 먹습니다.");    // 자식 클래스 고유 메서드
        }
    }

    class Cat extends Animal {

        void maksSound() {
            System.out.println("야옹");
        }
    }



    public class Abstract {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        cat.maksSound();    // 야옹
        cat.eat();  // 동물은 먹이를 먹습니다. >> 부모 클래스에서 정의된 기능

        dog.maksSound();    // 멍멍
        dog.eat();      // 강아지는개껌을 먹습니다.
    }
}
