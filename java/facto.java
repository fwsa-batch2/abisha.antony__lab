public class facto {
    public static void main(String[] args) {
        int num = 10;
        int num1 = 1;
        for(int i = num; i >= 1;i--){
            num1 = num1 * num;
        }
        System.out.println(num1);
    }
}
