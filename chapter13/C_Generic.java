package chapter13;

/*      제네릭 와일드카드 정리
        1. 일반 와일드카드 (?)
           모든 타입 허용
           List<?>

        2. 상한 제한 와일드카드 (? extends Type)
            특정 타입 및 그 하위 클래스만 허용
            List<? extends Number>

        3. 하한 제한 와일드카드 (? super Type)
           특정 타입 및 그 상위 클래스만 허용
           List<? super
*/

import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

class Electronics extends Product {

    public Electronics(String name, int price) {
        super(name, price);
    }
}

class Furniture extends Product {

    public Furniture(String name, int price) {
        super(name, price);
    }
}


class DiscountPolicy {

    public static double applyDiscount(List<? extends Product> products, double discountRate) {
        double totalDiscount = 0.0;

        for (Product product : products) {
            double discount = product.getPrice() * discountRate;
            totalDiscount += discount;
            System.out.println(product.getName() + "할인 적용: " + discount + "원");
        }

        return totalDiscount;
    }
}


public class C_Generic {
    public static void main(String[] args) {

        List<Electronics> electronics = new ArrayList<>();
        electronics.add(new Electronics("냉장고", 254));
        electronics.add(new Electronics("세탁기", 154));
        electronics.add(new Electronics("인덕션", 54));

        double totalElectroics = DiscountPolicy.applyDiscount(electronics, 0.1);

        List<Furniture> furnitures = new ArrayList<>();
        furnitures.add(new Furniture("침대", 224));
        furnitures.add(new Furniture("쇼파", 124));
        furnitures.add(new Furniture("의자", 24));

        double totalFurnitureList = DiscountPolicy.applyDiscount(furnitures, 0.2);

        System.out.println("총 가전 할인액: " + totalElectroics + "원");
        System.out.println("총 가구 할인액: " + totalFurnitureList + "원");

    }
}
