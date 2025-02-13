package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        // == 생일까지 남은 일수 계산 프로그램 ==
        // : 사용자로부터 생년월일을 입력받고 다가오는 생일까지 남은 일수를 반환

        Scanner scanner = new Scanner(System.in);

        // 1. 사용자로부터 생년월일 입력 받기 (형식 YYYY-MM-DD)

        // 2. 사용자 입력을 LocalDate 로 변환 (formatter)

        // 3. 현재 날짜 구하기

        // 4. 올해의 생일 계산

        // 5. 생일이 이미 지났다면 내년으로 설정

        // 6. 남은 일수 계산

        // 7. 결과 출력


        System.out.println("올해 년도를 입력하세요 (예 2024");
        int year = scanner.nextInt();
        System.out.println("생일의 월을 입력하세요 (예 11 ");
        int month = scanner.nextInt();
        System.out.println("생일의 일을 입력하세요 (예 21 ");
        int day = scanner.nextInt();

        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        System.out.println(today.format(formatter));

        LocalDate birthdayThisYear = LocalDate.of(year,month,day);

        if (birthdayThisYear != today ) {

            birthdayThisYear = birthdayThisYear.plusYears(1);


        }

        long daysUntilBirthday = ChronoUnit.DAYS.between(today, birthdayThisYear);
        System.out.println("올해의 생일까지 " + daysUntilBirthday + "남았습니다.");









    }
}

