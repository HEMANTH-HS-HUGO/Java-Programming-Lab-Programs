import java.util.Scanner;

class Prime {
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        num = sc.nextInt();
        
        if (num == 1) {
            System.out.println("It is not a prime number");
        } else if (num > 1) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println("It is a prime number");
            } else {
                System.out.println("It is not a prime number");
            }
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
