package chapter04;

class Card {
    // 인스턴스 변수
    // 각 카드 마다 개별 속성
    int num;
    String kind;

    // 클래스 변수
    // 모든 카드가 공유할 속성
    static  int width = 100;
    static  int height = 250;
}

public class ObjectPractice {
    public static void main(String[] args) {
        // 클래스 변수
        System.out.println(Card.height);
        System.out.println(Card.width);

        // 클래스 Card의 객체 생성
        Card c1 = new Card();
        c1.kind = "spade";
        c1.num = 7;
        System.out.println(c1.kind + c1.num);   // spade7



    }
}
