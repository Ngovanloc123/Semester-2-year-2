package BaiTapThucHanhSo1;

public class BaiTap11_15 {

    public static long BT11(int n) {
        long result = 1;
        for(int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    public static void BT12(String n) {
        int sum = 0;
        long product = 1;
        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int charToNumber = c - '0';
            sum += charToNumber;
            product *= charToNumber;
        }
        System.out.printf("\nKết quả BT12 với m = 12456 là tổng bằng %d, tích bằng %d\n", sum, product);
    }

    public static int BT13_GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int BT13_LCM(int a, int b) {
        return (a * b) / BT13_GCD(a, b);
    }

    public static boolean BT14(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean BT15(int n) {
        if (n < 0) return false;
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public static void main(String []args) {
        // Bài Tập 11
        System.out.printf("\nKết quả BT11 với n = 9: %d\n", BT11(9));

        // Bài Tập 12
        BT12("12345646786536");

        // Bài Tập 13
        System.out.println("\nUCLN của 16 và 24 là " + BT13_GCD(16, 24));
        System.out.println("BCNN của 16 và 24 là " + BT13_LCM(16, 24));

        // Bài Tập 14
        if (BT14(29)) {
            System.out.println("\n" + 29 + " là số nguyên tố.");
        } else {
            System.out.println("\n" + 29 + " không phải là số nguyên tố.");
        }

        // Bài Tập 15
        if (BT15(36)) {
            System.out.println("\n" + 36 + " là số chính phương.");
        } else {
            System.out.println("\n" + 36 + " không phải là số chính phương.");
        }

    }
}
