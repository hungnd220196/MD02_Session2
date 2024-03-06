import java.util.Scanner;

public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============MENU==============");
        System.out.println("1.Món cá nhảy");
        System.out.println("2.Món thịt lợn");
        System.out.println("3.Món thịt bò");
        System.out.println("4.Món thịt gà");
        System.out.println("5.Món thịt ngựa");
        System.out.println("6.Thoát");
        System.out.println("Mời bạn chọn món");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                System.out.println("ăn cá đi");
                break;
            case 2:
                System.out.println("ăn thit bò đi");
                break;
            case 3:
                System.out.println("ăn thịt gà đi");
                break;
            case 4:
                System.out.println("ăn ngưa đi");
                break;
            case 5:
                System.exit(0);
                break;
        }

    }

}
