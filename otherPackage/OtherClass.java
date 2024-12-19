package otherPackage;


//      부모클래스


public class OtherClass {

    // 같은 패키지 또는 다른 패키지의 하위 클래스에서만 접근가능
        protected  String otherField = "다른 패키지에 있는 부모필드";
        protected  void otherMethod(){
            System.out.println("다른 패키지에 있는 부모메서드");
        };

    }

