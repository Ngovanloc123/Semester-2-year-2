package BaiTapThucHanhSo1;

public class BaiTap16_20 {

    public static boolean BT16(int n) {
        String str = Integer.toString(n);
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        }
        return true;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void BT17(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    public static void BT18(int n) {
        for (int i = 1; i < 1000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void BT19(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static int BT20(int n) {
        int a = 0, b = 1, index = 0;
        while (a <= n) {
            if (a == n) return index;
            int temp = a + b;
            a = b;
            b = temp;
            index++;
        }
        return -1;
    }

    public static void main(String []args) {
        // Bài Tập 16
        if (BT16(1321)) {
            System.out.println("\n" + 12321 + " là số đối xứng.");
        } else {
            System.out.println("\n" + 12321 + " không phải là số đối xứng.");
        }

        // Bài tập 17
        System.out.println("\nCác số nguyên tố nhỏ hơn hoặc bằng " + 90 + ":");
        BT17(90);

        // Bài Tập 18
        System.out.println("\nCác số hoàn hảo nhỏ hơn 1000:");
        BT18(1000);

        // Bài Tập 19
        System.out.println("\n" + 10 + " chữ số Fibonacci đầu tiên:");
        BT19(10);

        // Bài Tập 20
        if (BT20(34) != -1) {
            System.out.println("\n" + 34 + " thuộc dãy Fibonacci ở vị trí thứ " + BT20(34));
        } else {
            System.out.println("\n" + 34 + " không thuộc dãy Fibonacci.");
        }
    }
}
