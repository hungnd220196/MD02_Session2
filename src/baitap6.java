import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==============MENU==============");
            System.out.println("1.Kiểm tra tính chẵn lẻ của 1 số.");
            System.out.println("2.Kiểm tra số nguyên tố.");
            System.out.println("3.Kiểm tra một số có chia hết cho 3 không.");
            System.out.println("4.Thoát");
            System.out.println("Mời bạn nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("mời bạn nhập số kiểm tra");
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num % 2 == 0) {
                        System.out.println(num + " là số chẵn");

                    } else {
                        System.out.println(num + " là số lẻ");
                    }
                    break;
                case 2:
                    System.out.println("mời bạn nhập số kiểm tra");
                    int num1 = Integer.parseInt(scanner.nextLine());
                    boolean isPrime = true;
                    if (num1 <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i < Math.sqrt(num1); i++) {
                            if (num1 % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(num1 + " là số nguyên tố");
                        } else {
                            System.out.println(num1 + " không là số nguyên tố");
                        }
                    }
                    break;
                case 3:
                    System.out.println("mời bạn nhập số kiểm tra");
                    int num2 = Integer.parseInt(scanner.nextLine());
                    if (num2 % 3 == 0) {
                        System.out.println(num2 + " là số chia hết cho 3");
                    } else {
                        System.out.println(num2 + " không chia hết cho 3");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }
}
