package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class F_Array {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        items.add("사과");
        items.add("연필");
        items.add("노트북");
        items.add("시계");
        items.add("텀블러");

/*         난수 (무작위의 실수) 를 생성하는 Random 기능
         random.nextUnt(숫자값);
         0 부터 해당 숫자 미만의 정수가 생성
*/
        Random random = new Random();
       int index = random.nextInt(items.size());

       String selectedItem = items.get(index);

        Scanner scan = new Scanner(System.in);

        String userGuess;

        while (true){
            System.out.println("아이템을 맞춰보세요.");
            userGuess = scan.nextLine();

            if (userGuess.equals(selectedItem)) {
                System.out.println("정답입니다.");
                break;

            } else if (userGuess.equals("종료")) {
                break;

            }else {
                System.out.println("틀렸습니다. 다시 시도하세요.");
            }
        }
        scan.close();
        System.out.println("종료되었습니다.");

    }
}
