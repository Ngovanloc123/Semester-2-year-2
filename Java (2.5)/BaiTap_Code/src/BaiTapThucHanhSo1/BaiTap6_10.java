package BaiTapThucHanhSo1;

public class BaiTap6_10 {

    public static void BT6(int a, int b) {
        if(a > b || a < 0) System.out.println("Thời gian không hợp lệ");
        else {
            int time = b - a;
            if(b < 18) {
                System.out.println("Số tiền phải trả là " + time * 45 + ".000đ");
            }
            else System.out.println("Số tiền phải trả là " + time * 60 + ".000đ");
        }
    }

    public static int BT7(int m, int y) {
        int d;
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12:
                d = 31;
                break;
            case 4, 6, 9, 11:
                d = 30;
                break;
            default:
                d = 28;
        }
        if(m == 2) {
            if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                d = 29;
            }
        }
        return d;
    }

    public static double BT8(int n) {
        double result = 0;
        for(int i = 1; i <= n; i++) {
            result += 1.0/i;
        }
        return result;
    }

    public static double BT9(int n) {
        double result = 15;
        int sign = 1;
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
            sign *= -1;
            result += (1.0*sign) / factorial;
        }
        return result;
    }

    public static double BT10(int n) {
        double retult = 1;
        int factorial = 1;
        for(int i = 3; i <= 2*n - 1; i += 2) {
            factorial *= i * (i - 1);
            retult += 1.0/factorial;
        }
        return retult;
    }

    public static void main(String []args) {
        // Bài Tập 6
        BT6(8, 15);
        BT6(8, 17);

        // Bài Tập 7
        System.out.println("\nSố ngày trong tháng 2 năm 2000 là " + BT7(2, 2000));
        System.out.println("Số ngày trong tháng 5 năm 2025 là " + BT7(2, 2000));

        // Bài Tập 8
        System.out.printf("\nKết quả BT8 với n = 9: %.3f\n", BT8(9));

        // Bài Tập 9
        System.out.printf("\nKết quả BT9 với n = 9: %.3f\n", BT9(9));

        // Bài Tập 10
        System.out.printf("\nKết quả BT10 với n = 9: %.5f\n", BT10(9));
    }
}


