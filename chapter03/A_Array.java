package chapter03;

/**     배열(Array)
 *      같은 타입의 여러 변수를 하나의 집합으로 묶어서 처리하는 자료 구조
 *      데이터를 연속적으로 저장
 *      순서 O (imdex 인덱스 번호, 0부터 1씩 증가되는 값)
 *      중복 O (동일한 값을 여러 요소에 저장 가능)
 *      요소 : 배열 각각의 데이터
 *
 *      Ex) 학생들의 시험 점수를 저장, 여러 개의 문자열을 다룰 때
*/

public class A_Array {
    public static void main(String[] args) {
/**     배열 VS 변수
 *      배열: 생성한다 (같은 타입의 데이터를 여러 개 저장 가능)
 *      변수: 선언한다 (하나의 데이터만 저장 가능)
 *
 *      1) 변수
*/        int kpr = 90;
          int math = 70;
          int eng = 60;

/**     2) 배열
 *         생성하여 사용 - new 연산자
 *
 *         === 배열의 선언 ===
 *         생성한 배열을 담을 그릇
 *         >> 데이터타입[] 배열명;
 *         >> 데이터타입 배열명[];
 */         int[] array;    //정수형 데이터를 담을 수 있는 배열

  /**       === 배열의 생성 ===
   *        실제 데이터가 저장 X, 데이터 배열이 저장된 첫번째 메모리 주소가 저장
   *        >> new 데이터타입[배열의 길이];
  */        array = new int[3];

  //        참조 자료형 - 주소값이 저장
            System.out.println(array);  //[I@7c30a502

  /**       === 배열의 요소에 접근 ===
   *            배열명[인덱스번호]
   *            +) 데이터 변경(삽입): 배열명[인덱스번호] = 데이터값;
  */
            System.out.println(array[0]);   // 0
            System.out.println(array[1]);   // 0
            System.out.println(array[2]);   // 0

    //      배열 생성 시 모든 요소는 해당 데이터 타입의 기본값으로 초기화
    //      숫자(0), 문자열(''), 논리형(fl
            array[1] = 456;
            array[0] = 123;
            System.out.println(array[1]);   // 456
            System.out.println(array[0]);   // 123

    //       === 배열의 선언과 동시에 초기화 ===
    //      new 연산자를 사용한 직접적인 배열 생성 시 길이 지정 X

   //         1) 데이터타입[] 배열명 = new 데이터타입[] {요소1, 요소2,...}
                int[] scoreList = new int[] {80, 60, 54};
                System.out.println(scoreList[0]);

   //         2) 데이터타입[] 배열명 = {요소1, 요소2, ...}
                char[] greet = {'h', 'd', 'g', 'r'};
                System.out.println(greet[0]);

   /**          === 배열의 길이(크기)===
    *               .length 속성으로 확인
    *          System.out.println(greet.length);
    *
    *          === 배열의 특징 ===
    *          한 번 생성되면 크기 변경 X
    *          > 참조 타입: 주소값이 저장
    *          > 모든 요소는 같은 자료형이어야 함
    *
    *
    *          === 문자열 배열 생성 ===
    *          String 타입 배열의 초기값은 null;
   */
                String[] fruits = new String[3];
                System.out.println(fruits[0]); // null

                fruits[0] = "사과";
                System.out.println(fruits[0]);

    /**         === 배열 요소 삭제 ===
     *          삭제 기능을 담당하는 문법 X
     *          삭제할
    * */        int[] original = {1,2,3,4};
                int removeIndex = 2;

                int[] newArray = new int[original.length -1];
                int k = 0; // 새로운 배열의 인덱스 번호

                int oroginalLength = original.length; // 4

                for (int i = 0; i < original.length; i++) {
                    if (i == removeIndex) {
                        continue; // 루프의 나머지 부분을 건너뛰고 다음 반복을 진행
                    }

                    newArray[k++] = original[i];
                    // k, i
                    // 0, 0
                    // 1, 1
                    // 2, 3
                }
                System.out.println(newArray[0]);    // 1
                System.out.println(newArray[1]);    // 2
                System.out.println(newArray[2]);    // 4

    /**         === 배열을 순회하는 향상된 for문 (for each문) ===
     *              for (데이터 타입 변수명: 해당 데이터타입의 배열) {
     *                  배열의 모든 소스에 순차적으로 접근하는 코드
     *                  }
    */              int[] arrayNumber = {1,3,4,6,8};
                for (int number: arrayNumber) {     // number 변수: for 문 내의 변수
                    System.out.println(number);
                }


                // === 배열 활용 예시 ===
                int[] scores = {85, 100, 75, 60, 90};
                int total = 0;
                // 풀이

                for (int i = 0; i < scores.length; i++) {
                        total += scores[i];

                }
            double average = (double) total / scores.length;
             System.out.println("평균 점수: " + average);

    }
}
