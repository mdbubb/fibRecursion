
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to see if it is in the fib. sequence");
        int num = input.nextInt();
        fib f = new fib();
        for (int i = 0; i <= num; i++){
            if (num==f.solve(i)||num==0) {
                System.out.println("Your number is in the sequence...Do you want to enter another number?");
                String response = input.next();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Enter your next number");
                    num = input.nextInt();
                } else {
                    System.out.println("Have a nice day");
                }
            }
            //else{
              //  if(i==1)
             //   System.out.println("it is not in the sequence" );
         //   }




        }



    }

}
