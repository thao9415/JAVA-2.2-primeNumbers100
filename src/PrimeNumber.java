public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Show prime number < 100");
        for (int num = 0; num < 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + "\t");
            }
        }

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number > 2) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }




}