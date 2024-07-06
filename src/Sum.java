import java.util.Scanner;

public class Sum {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Welcome tom  our Calculator ");


        System.out.println("Please Enter our First Number ");

        int firstNum = input.nextInt();
        System.out.println("Please Enter our second Number ");

        int secondNum = input.nextInt();

        int sum = firstNum + secondNum;

        System.out.println("Sum of your numbers is :" +sum);





    }

}
