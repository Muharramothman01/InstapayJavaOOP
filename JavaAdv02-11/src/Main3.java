public class Main3 {
    public static void main(String[] args) {
        String o = "ILoveJava  ILoveBackEnd";
        // number of char in every word

//        String[] results= o.split(" ");

//        System.out.println(o.length());
//        for (int i = 0; i < results.length; i++) {
//            System.out.println(results[i] + ":" + results[i].length());
//        }
//        for (String o1:results) {
//            System.out.println(o1+ ":" + o1.length());
//        }


//        System.out.println(result1.length());

        // number of spaces
        //Solution 1
//        char[] x= o.toCharArray();
//        int count = 0;
//        for (int i =0 ; i<o.length() ; i++) {
//            if (x[i] == ' '){
//                count++;
//            }
//        }
//        System.out.println("Number of Space: " + count);

        // solution 2
//        int count = 0;
//        for (int i = 0; i <o.length(); i++) {
//            if(o.charAt(i)==' '){
//                count++;
//            }
//        }
//        System.out.println("Number of Space: " + count);

        // Solution 3
        String replace = o.replaceAll(" ","");
        int count = o.length()-replace.length();
        System.out.println("Space: "+ count);
//       System.out.println("Number of Spaces: " + (o.length()-o.replaceAll(" ","").length()));

        // Solution 4
        String[] results= o.split(" ");
        System.out.println( "Number of Spaces is: " + (results.length-1) );

    }
}
