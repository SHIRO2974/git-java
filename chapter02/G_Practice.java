package chapter02;

public class G_Practice {
    public static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *
        int star = 5;

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
//        -------------
//        *****
//         ****
//          ***
//           **
//            *
        System.out.println();
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= 5 -i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }
            System.out.println();
        }

        }

    }

