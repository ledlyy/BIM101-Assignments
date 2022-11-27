import java.util.Scanner;
//Assignment 3 İbrahim Yaşin
public class OddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        //for loop-based count
        System.out.printf("Loop-based solution: The numbers of odds in range [%d, %d] = %d\n", a,b,loopBasedCount(a,b));
        //for math-based count
        System.out.printf("Math-based solution: The numbers of odds in range [%d, %d] = %d\n", a,b,mathBasedCount(a,b));
    }

     static int loopBasedCount(int a, int b){
        int numOfOdds = 0;
        for(int i = a; i <= b; i++){
            if(i % 2 != 0){
                numOfOdds++;
            }
        }
        return numOfOdds;
     }
     static int mathBasedCount(int a, int b){
         int numOfOdds = (b-a)/2;
         if((a % 2 != 0) || (b % 2 != 0)){
             numOfOdds++;
         }
        return numOfOdds;
     }
}
