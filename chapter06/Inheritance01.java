package chapter06;

/*  === 상속 ===
        한 클래스의 객체와 메서드를 다른 클래스가 물려받는 것
        기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것
        코드의 재사용성과 중복을 제거(프로그램의 생산성 향상)

        상속 구현 방법
        extends 키워드를 사용하여 구현 (확장하다)
*/
    class Parent {} // 부모 클래스
    class  Child extends Parent {} // 자식 클래스

/*      명칭
        상속해주는 클래스 - 조상, 부모, 상위, 기반, 슈퍼 클래스
        상속 받는 클래스 - 자손, 자식, 하위, 파생, 서브 클래스
*/

    class Animal {
        String name;
    }

    class Dog extends Animal {

        void bark() {
            System.out.println(name + "가 짖습니다.");
        }
    }

//       === 상속 예시 ===
        class Tv {
        boolean power;
        int channel;

        void setPower() {
            power = !power;
        }

        void channelUP() {++channel;}
        void channelDown() {--channel;}
        }

        class SmartTv extends Tv {
        boolean ott;

        void displayOtt(String platfirm) {
            if (ott) {
                System.out.println(platfirm);
            }else {
                System.out.println("OTT 연결이 되지 않았습니다.");
            }
        }

        }

public class Inheritance01 {
    public static void main(String[] args) {

        Dog choco = new Dog();
        choco.name = "초코";
        choco.bark();

        SmartTv smartTv = new SmartTv();
        smartTv.channel = 10;
        smartTv.channelUP();
        smartTv.channelUP();
        smartTv.channelUP();
        System.out.println(smartTv.channel);    // 13

        smartTv.displayOtt("Netflix");  // OTT 연결이 되지 않았습니다.
        smartTv.ott = true;
        smartTv.displayOtt("Netflix");  // Netflix
    }



}
