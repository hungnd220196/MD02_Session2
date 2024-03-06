public class baitap4 {
    public static void main(String[] args) {
        // in ra 20 số nguyên tố dầu tiên
        int count = 0;
        int N = 2;
         while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println( N + " là số nguyên tố");
                count++;
            }
            N++;
        }
    }
}
