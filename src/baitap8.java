import java.util.Scanner;

public class baitap8 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("============Menu============");
            System.out.println("1. Tính hình tròn");
            System.out.println("2. Tính hình chữ nhật");
            System.out.println("3. Tính tam giác");
            System.out.println("4. Thoát");
            System.out.println();
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập bán kính hình tròn");
                    double r = Double.parseDouble(scanner.nextLine());
                    final double PI = 3.14d;
                    System.out.println("Chu vi hình tròn là: " + (PI * 2 * r));
                    System.out.println("Diện tích hình tròn là: " + (PI * r * r));
                    break;
                case 2:
                    System.out.println("Nhập chiều dài hình chữ nhật");
                    double a = Double.parseDouble(scanner.nextLine());
                    System.out.println("Nhập chiều rộng hình chữ nhật");
                    double b = Double.parseDouble(scanner.nextLine());
                    System.out.println("Chu vi hình chữ nhật là: " + (a + b) * 2);
                    break;
                case 3:
                    double canh1, canh2, canh3;
                    while (true) {
                        System.out.println("Nhập vào độ dài của 3 cạnh tam giác:");
                        System.out.print("Cạnh 1: ");
                        canh1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Cạnh 2: ");
                        canh2 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Cạnh 3: ");
                        canh3 = Double.parseDouble(scanner.nextLine());
                        if (canh1 > 0 && canh2 > 0 && canh3 > 0 && (canh1 + canh2 > canh3) && (canh1 + canh3 > canh2) && (canh2 + canh3 > canh1)) {
                            double perimeter = canh1 + canh2 + canh3;
                            double s = perimeter / 2; // nửa chu vi
                            double area = Math.sqrt(s * (s - canh1) * (s - canh2) * (s - canh3));
                            System.out.println("Chu vi của tam giác là: " + perimeter);
                            System.out.println("Diện tích của tam giác là: " + area);
                            break;
                        } else {
                            System.out.println("Ba cạnh nhập vào không tạo thành một tam giác. Vui lòng nhập lại.");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời nhập lại");
                    break;
            }

        }
    }
}
