import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
        String s ="mariam";
        s=s+" ahmed";
        // charAt Method
        for (int i = 0; i < s.length(); i++) { //
            System.out.println(s.charAt(i));
        }
//        for (int i = s.length()-1; i >=0; i--) { // بطبع بالعكس
//            System.out.println(s.charAt(i));
//        }
        // indexOff
        System.out.println(s.indexOf("am")); // عكس charat
        // contains - endwith - startwith
        if (s.endsWith("ha")){

        }



        String a = s.substring(0,3);
        System.out.println(a);
        char[] chars= s.toCharArray();
        for (char aChar:chars) {
            System.out.println(aChar);
        }

        String r = "hany.nemr";
//        String[] result = r.split("\\."); // 0=hany 1=hany ->
////        String prefix= result[0]; //hany
////        result[0]=result[1];
////        result[1]= prefix;
//        System.out.println(result[0]+result[1]);

//        String[] results= r.split(" ");
//        System.out.println(results[0]);
//
//        int index = r.indexOf(" ");
//        System.out.println(r.substring(0,index));
//        System.out.println(r.substring(index+1));

        String prefix = r.substring(0,r.indexOf("."));
        r =r.substring(prefix.length()+1)+"."+prefix;
        System.out.println(r);


    }
}