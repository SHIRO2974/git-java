package test;

// 1번 문제
// - 기본 데이터 타입
//   기본 데이터 타입은 int, double, boolean 등 소문자로 시작하며 변수를 생성하여 "값"을 지정해주어야 한다

// - 참조 데이터 타입
//   참조 데이터 타입은 Integer, String, Boolean, 등 대문자로 시작하며 변수를 생성하고
//   "값"을 지정해주지 않으면 null; 값이 들어간다.


// 6번 문제
// : Object

// 7번 문제
// : size? .Length???

// 8번 문제
// :  switch ()??

// 9번 문제
// : 3

// 10번 문제
// : 3

// 11번 문제
// : "Child"

// 12번 문제
// : 1

// 13번 문제
// : 1

// 14번 문제
// :

// 15번 문제
// : 2

// 16번 문제
// : 3

// 17번 문제
// :public

// 18번 문제
// : 3

// 19번
// : 작성을 했을때 리뷰를 같이 하는시간이 많았으면 좋겠어요!



// 20번
// : 너무 재밌었습니다


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*      **요구사항:**

1. `Student`라는 클래스를 작성합니다.
    - `name` (이름, 문자열 타입)과 `score` (점수, 정수 타입) 필드를 가집니다.
    - `Student` 객체를 생성할 때 이름과 점수를 초기화할 수 있는 생성자를 만듭니다.
2. `Student` 객체 배열을 생성하여 학생 5명의 이름과 점수를 초기화합니다.
    - 예: 학생 이름: "John", "Jane", "Tom", "Emily", "Alex" / 점수: 85, 92, 78, 88, 95
3. 반복문을 사용하여 점수가 90점 이상인 학생의 이름을 출력합니다.
*/
class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
public class Test {



    public static void main(String[] args) {
        // 2번 문제
/**     요구사항**

 1. `int` 타입의 변수 `num1`에 10, `double` 타입의 변수 `num2`에 3.5를 저장합니다.
 2. 두 변수를 더한 결과를 `double` 타입의 변수 `result`에 저장합니다.
 3. 결과 값을 출력합니다.
*/
        int num1 = 10;
        double num2 = 3.5;

        double result = num1 + num2;
        System.out.println(result);

        // 3번 문제
/**     요구사항:**

        1. 사용자로부터 `int` 타입의 숫자 하나를 입력받습니다.
        2. 입력받은 숫자가 짝수인지 홀수인지 판단하여 출력합니다.
        - 짝수인 경우: "입력하신 숫자는 짝수입니다."
                - 홀수인 경우: "입력하신 숫자는 홀수입니다."
 */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int num = scan.nextInt();
        scan.nextLine();

        if (num % 2 == 0) {
            System.out.println("입력하신 숫자는 짝수 입니다.");

        } else if (num < 0) {
            System.out.println("정수를 입력해주세요");

        } else {
            System.out.println("입력하신 숫자는 홀수입니다.");
        }

        scan.close();
        // 4번 문제
 //        for-each 반복문을 사용하여 배열 요소를 출력할 때 적합한 코드를 작성하세요.

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        // 5번 문제
        // : class Test 바로 위에 클래스를 작성하고 main 메서드 내부에서 객체를 생성하세요.
        Student[] students = {
                new Student("아무개", 90),
                new Student("아무새", 80),
                new Student("아무배", 70),
                new Student("아무재", 60),
                new Student("아무대", 50)
        };

        for (Student student : students) {

            if (student.getScore() >= 90) {
                System.out.println("90점 이상인 학생: " + student.getName());
            }
        }

    }
}

