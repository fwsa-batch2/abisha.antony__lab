public class switchcase {
    public static void main(String[] args) {
        int num = 44;
        String size=" ";
        switch(num){
            case 34:
            size = "small";
            break;
            case 24:
            size = "very small";
            break;
            case 44:
            size = "medium";
            break;
            case 55:
            size = "large";
            break;
        }
        System.out.println(size);
    }
}
