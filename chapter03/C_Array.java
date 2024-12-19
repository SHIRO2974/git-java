package chapter03;

import java.util.Arrays;

/*      Array 클래스
        배열을 조작하는 데 유용한 기능들을 제공해주는 자바 내부 클래스
        정렬, 검색, 변환 등
*/
public class C_Array {
    public static void main(String[] args) {
//      === Arrays 클래스 사용법 ===

//      배열 생성
        int[] nimbers = {3,2,5,4,1};

//      1. 배열 정렬 (오름차순)
//         Arrays.sort(정렬할 배열);
        Arrays.sort(nimbers);
        System.out.println(nimbers[0]); // 1

/*      2. 배열 변환
//        Arrays.toString(배열);
//       배열의 전체 구조를 파악할 수 있는 기능
         각 요소를 순회하며 문자열 [요소1, 요소2,...] 형태로 반환*/

        System.out.println(nimbers);    // [I@49e4cb85
        System.out.println(Arrays.toString(nimbers));   // [1, 2, 3, 4, 5]

//      3. 배열 내 검색
//         Arrays,
//         존재o 존재하는 요소의 인덱스 번호 반환
//         존재x (음수반환)
        System.out.println(Arrays.binarySearch(nimbers,2
        ));
        System.out.println(Arrays.binarySearch(nimbers,6));

//      4. 배열의 비교
//        Arrays.equals(a배열, b배열)
//        > 논리형태로 반환(true, fales)
        int[] numbers2 = {1,2,3,5,4};
        System.out.println(Arrays.equals(nimbers,numbers2));    //fales

 /*     5. 배열의 채움
           Arrays.fill ( 배열, 삽입할 값);
           배열의 모든요소를 특정 값으로 채움
 * */
        int[] example = new int[3];
        System.out.println(Arrays.toString(example));   // [0, 0, 0]

        Arrays.fill(example, 10);
        System.out.println(Arrays.toString(example));   // [10, 10, 10]


    }
}