package chapter06;

/*      클래스 구조
        필드, 메서드, 생성자

        === 생성자 ===
        인스턴스가 생성될 때 호출되는 '인스턴스 초기화 메서드'

        생성자 조건
        생성자 이름은 클래스 이름과 동일
        리턴값이 없는 메서드 형식 (void 타입 생략)

        컴파일러가 제공하는 기본 생성자
        클래스에 생성자가 없으면 컴파일러가 자동으로 생성
        파라미터가 없고 아무 작업도 하지 않는 생성자

        인스턴스 생성
        생성자가 인스턴스 생성 X
        new 키워드가 인스턴스 생성 O
*/
    class Ex1 {
        int velue;

        // 컴파일러가 제공하는 기본 생성자(파라미터 X, 아무런 구현 X)가 생략
}
    class Ex2 {
        int valie;

        // 사용자 정의 생성자
        // 컴파일러가 자동으로 기본 생성자를 제거
        Ex2(int valie){
            this.valie = valie;

        }
        // 빈 생성자를 직접 명시해야만 사용가능
        // >> 사용자 정의 생성자가 1개라도 있는 경우
        //Ex2(){}


    }
class Car {
    String color;
    String gearType;
    int door;

    // 빈 생성자
    Car(){}

    // 사용자 정의 생성자
    Car(String color, String gearType, int door){
        this.color = color;
        this.door = door;
        this.gearType = gearType;

    }
    Car(String color) {
        // 생성자 이름으로 클래스 이름 대신 this 를 사용
        // 정의 생성자에서 다른 생성자 호출 시 반드시!! 첫 줄에서만 가능

        // 호출된 생성자가 변수값을 초기화하는 경우
        // 해당 생성자가 수행하는 작업을 유지하기 위함(무의미함을 방지!)
        this(color, "auto", 4);
        door = 5;
        // 객체 생성시 색상만 작성하는 경우 - 색상 + auto + 문 5개
    }
    void  displayInfo() {
        System.out.println(color + "/" + gearType + "/" + door);
    }
}
/*          this 키워드
            1. this :인스턴스 자신을 참조
                    :모든 인스턴스 메서드와 생성자에 사용 가능
            2. this(): 같은 클래스 내의 다른 생성자를 호출할 때 사용
                    : 중복 코드 제거와 유지보수 향상에 기여
*/

public class Constructor {
    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();
        ex1.velue = 10;
        System.out.println(ex1.velue);

        // 인스턴스 생성시 반드시 인자값 필요(초기화 값)
        Ex2 ex2 = new Ex2(10);
        System.out.println(ex2.valie);


        System.out.println("=== Car 클래스 사용 ===");
        Car car1 = new Car();
        car1.color = "Red";
        car1.gearType = "manual";
        car1.door = 2;
        car1.displayInfo();     // Red/manual/2

        Car car2 = new Car("white", "auto", 4);     // white/auto/4
        car2.displayInfo();     // white/auto/4

        Car car3 = new Car("blue");
        car3.displayInfo();     // blue/auto/5




    }
}
