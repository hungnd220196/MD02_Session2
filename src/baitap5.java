import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        // tìm số nguyên dương nhỏ nhất
        int N = 1;
        while (true) {
            if (N % 5 == 0 && N % 7 == 0 && N % 11 == 0){
                break;
            }
            N++;
        }
        System.out.println(N);
    }
}

