import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
    }
}


