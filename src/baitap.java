import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        // nhập vào số nguyên bất kỳ
        //in ra menu và thực hiện chức năng sau:
        /*
        1. tìm ước của số vừa nhập
        2. tính tổng các ước đó
        3. tìm các số chia hết cho 3 và 5 trong khoảng từ 1 đến số vừa chọn
        4. thoát

         */
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập số nguyên");
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("==============MENU==============");
            System.out.println("1.tìm ước của số vừa nhập");
            System.out.println("2.tính tổng các ước đó");
            System.out.println("3.tìm các số chia hết cho 3 và 5 trong khoảng từ 1 đến số vừa chọn");
            System.out.println("4.Thoát");
            System.out.println("mời bạn nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                            System.out.println("ước của " + num + " là " + i);
                        }
                    }
                    break;
                case 2:
                    int sum = 0;
                    for (int i = 1; i <= num; i++) {
                        if (num % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.println("tổng của các ước là " + sum);
                    break;
                case 3:

                    for (int i = 1; i <= num; i++) {
                        if (i % 3 == 0 && i % 5 == 0) {
                            System.out.println(i + "chia hết cho 3 và 5");
                        }
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("số nhập không hợp lệ");
                    break;

            }

        } while (true);
    }
}
