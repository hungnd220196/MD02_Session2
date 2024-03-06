import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        // in ra các số nguyên tố  từ 1 đến 100
        int N = 2;
        while (N < 100) {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(N + " là số nguyên tố");
            }
            N++;
        }
    }
}
