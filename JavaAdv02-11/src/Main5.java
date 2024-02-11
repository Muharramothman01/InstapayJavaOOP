public class Main5 {
    public static void main(String[] args) {
        String x = "i love java i love backend";

        StringBuilder reverse = new StringBuilder(x);
        reverse.reverse();

//        StringBuilder reverse = new StringBuilder();
//        for (int i = x.length()-1; i >=0 ; i--) {
//            reverse.append(x.charAt(i));
//        }

        System.out.println(reverse);
    }
}
