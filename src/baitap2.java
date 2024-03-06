import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập số");
            System.out.println("1. vẽ hình chữ nhật");
            System.out.println("2. vẽ hình tam giác vuông bottom-left");
            System.out.println("3. vẽ hình tam giác vuông bottom-right");
            System.out.println("4. vẽ hình tam giác cân");
            System.out.println("5.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // in hình chữ nhật
                    for (int i = 1; i < 4; i++) {
                        System.out.println();
                        for (int j = 1; j < 8; j++) {
                            System.out.print("* \t");

                        }

                    }
                    System.out.println();
                    break;
                case 2:
                    // in hình tam giác
                    for (int i = 1; i < 6; i++) {
                        System.out.println();
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*\t");
                        }

                    }
                    System.out.println();
                    break;

                case 3:
                    // in tam giác vuông ngược
                    for (int i = 1; i < 6; i++) {
                        System.out.println();
                        for (int j = 5; j >= i; j--) {
                            System.out.print("* \t");

                        }
                    }
                    break;
                case 4:
                    //in tam giác cân
                    for (int i = 0; i < 6; i++) {
                        // In ra khoảng trắng phía trước
                        for (int j = 0; j < 5 - i; j++) {
                            System.out.print(" ");
                        }

                        // In ra dấu '*' cho phần tam giác
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("*");
                        }

                        // Xuống dòng cho hàng tiếp theo
                        System.out.println();
                    }
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("số nhập k hợp lệ");
                    break;
            }
        }


    }
}
