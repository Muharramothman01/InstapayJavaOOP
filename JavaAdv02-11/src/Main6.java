import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

//        System.out.println("Enter String: " );
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        int sum = 0;
//        for(int i=0; i<str.length(); i++) {
//            char o = (char) (str.charAt(i) );
//            int num = Integer.parseInt(String.valueOf(o));
//            sum += num;
//        }
//        System.out.println(sum);


        // solution2
        String s = "246";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
               int oo = Character.getNumericValue(s.charAt(i));
//            System.out.println(s.charAt(i));
//            String o = String.valueOf(s.charAt(i));
//            int oo = Integer.parseInt(o);
            sum+= oo;
            }
        }
        System.out.println("The summation of numbers: "+ sum);

        // solution3



    }
}

