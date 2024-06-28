public class STAR_PATTERN6 {
    public static void main(String args[]) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 7; j >= i; j--) {
                System.out.print("*");
            }
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 1; i <= 6; i++) {
//            for (int j = 2; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 2; k <= i; k++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
    }
    }
