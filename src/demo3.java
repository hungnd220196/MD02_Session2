import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Mời bạn nhập vào số 1 đến 10");
        num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i < 11; i++) {
            System.out.printf(num+ "*%d = %d \n", i, num * i);

        }
    }
}
