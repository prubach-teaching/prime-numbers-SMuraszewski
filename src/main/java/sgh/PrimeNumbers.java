package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        
        StringBuilder output = new StringBuilder();
        int count = 0;

        int CheckingValue = 2;
        while (count < n) {
            if (isPrimeNumber(CheckingValue)) {
                if (count == 0) {
                    output.append(CheckingValue);
                } else {
                    output.append(", ").append(CheckingValue);
                }
                count++;
            }
            CheckingValue++;
        }
        
        System.out.println(output);
    }


   public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primes(4);
    }
}
