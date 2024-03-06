public class demo2 {
    public static void main(String[] args) {
        int sum =0;
        // in ra số chẵn từ 1 đến 10
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);

    }

}
