package BaiTapThucHanhSo1;



public class BaiTap1_5 {
    public static int BT1(int a, int b, int c) {
        int max = a;
        if(a < b) max = b;
        if(max < c) max = c;
        return max;
    }

    public static void BT2(int a, int b) {
        if(a == 0) {
            if(b == 0) System.out.println("Phương trình có vô số nghiệm");
            else System.out.println("Phương trình vô nghiệm");
        }
        else {
            System.out.println("Phương trình có nghiệm duy nhất x = " + -b*1.0 / a);
        }
    }

    public static void BT3(int a, int b, int c) {
        if(a == 0) {
            BT2(b, c);
        }
        else {
            double detal = b*b -4*a*c;
            if(detal < 0)
                System.out.println("Phương trình vô nghiệm");
            if(detal == 0)
                System.out.println("Phương trình có nghiệm kép x = " + -b/(2*a));
            if(detal > 0) {
                double x1 = (-b + Math.sqrt(detal)) / (2*a);
                double x2 = (-b - Math.sqrt(detal)) / (2*a);
                System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.3f, x2 = %.3f\n", x1, x2);
            }

        }
    }

    public static void BT4(int a, int b, int c, int d, int e, int f) {
        double D = a*e - d*b;
        double Dx = c*e - f*b;
        double Dy = a*f - d*c;

        if(D == 0) {
            if(Dx == 0 && Dy == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else {
            double x = Dx/D;
            double y = Dy/D;
            System.out.printf("Phương trình có nghiệm (x, y) = (%.3f, %.3f)\n", x, y);
        }

    }

    public static int BT5(int a, int b, int c) {
        if ((a < b && b < c) || (c < b && b < a)) return b;
        if ((b < a && a < c) || (c < a && a < b)) return a;
        return c;
    }


//
//    public static void main(String []args) {
//        // Bài Tập 1
//        System.out.println("Max của 3 số 5, 6, 2 là " + BT1(5, 6, 2));
//
//        // Bài Tập 2
//        System.out.println("\nGiải phương trình bật nhất 5x + 10 = 0");
//        BT2(5, 10);
//
//        // Bài Tập 3
//        System.out.println("\nGiải phương trình bật hai 5x² + 6x + 1");
//        BT3(5, 6, 1);
//
//        // Bài Tập 4
//        System.out.println("\nGiải phương trình bật nhất:\n" +
//                "5x + 3y = 9\n" +
//                "5x + 7y = 1");
//        BT4(5, 3, 9, 5, 7, 1);
//
//        // Bài Tập 5
//        System.out.printf("\nSố trung gian của 3 số 3, 5, 2 là %d\n", BT5(3, 5, 2));
//    }

}
