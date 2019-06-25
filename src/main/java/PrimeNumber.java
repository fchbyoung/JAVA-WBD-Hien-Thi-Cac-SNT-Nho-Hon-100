import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 100;
        System.out.println("Những số nguyên tố < 100 là: ");
        System.out.println(printPrimeNumber(n));
    }
        public static String printPrimeNumber(int n){
            String result = "";
            for(int i = 2; i <= n; i++){
                int divisible = 0;
                for( int j = 2; j <= i; j++){
                    if(i % j == 0){
                        divisible += 1;
                    }
                }
                if(divisible == 1){
                    result += i + "\t";
                }
            }
            return  result;
        }
}
