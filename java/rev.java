public class rev {
    public static void main(String[] args) {
        String a = "abisha";
        char ch;
        String s = "";
        int i = 0;
        String b = "";
        char ch1;
        do {
            ch1 = b.charAt(i);
            b = ch1 +
                    b;
            i++;
        }while (i<b.length());
        System.out.println(b);

    }
}
