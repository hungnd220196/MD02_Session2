import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời bạn nhập số đầu");
        int startNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("mời bạn nhập số cuối");
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println("Tổng các số chẵn trong khoảng " + startNumber + " đến " + endNumber + " là " + sum);

    }
}
