import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1

//        System.out.print("please enter first number: ");
//        int first =input.nextInt();
//        System.out.print("please enter second number: ");
//        int second = input.nextInt();
//        System.out.print("please enter third number: ");
//        int third = input.nextInt();
//        comparison(first,second,third);

        //2
//
//        System.out.print("please enter first number: ");
//        int first =input.nextInt();
//        comparison(first);



        //3
        System.out.println("please remember");
        System.out.println("password must have at least ten characters.");
        System.out.println("password consists of only letters and digits.");
        System.out.println("password must contain at least two digits.");

        System.out.println("please enter your password");
        String pass=input.nextLine();

        if (isLong(pass) && contains(pass) && twoDigits(pass)) {
            System.out.println("Password is valid: " + pass );
        } else {
            System.out.println("Password is not valid.");
        }





    }
//1
//    public static void comparison (int first, int second ,int third){
//
//        if (first < second && first <third){
//            System.out.println("the smallest number is= "+first);
//        }else if (second < first && second <third ){
//            System.out.println("the smallest number is= "+second);
//        }else System.out.println("the smallest number is= "+third);
//    }

    //2

//    public static void comparison (int first){
//
//        if (first<0){
//            System.out.println("is negative");
//        }else if (first== 0){
//            System.out.println("is zero");
//        }else System.out.println("is positive");
//    }

    //3

    public static boolean isLong (String pass){

        if  (pass.length() < 10) {
            System.out.println("A password must have at least ten characters.");
            return false;
        }
        return true;
    }

    public static boolean contains (String pass){

        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("A password consists of only letters and digits.");
                return false;
            }
        }
        return true;
    }

    public static boolean twoDigits(String password) {
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                digitCount++;
            }
            if (digitCount >= 2) {
                return true;
            }
        }
        System.out.println("A password must contain at least two digits.");
        return false;
    }

}