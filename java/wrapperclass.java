public class wrapperclass {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a);// boxing
        System.out.println(a);
        int b = obj;//unboxing
        System.out.println(b);
        System.out.println(obj.getClass().getSimpleName());
    

    }

}
