public class ExceptionHandling {
    public static void main(String[] args) {
      try {
          int a = 6;
          int b = 2;
          int c = a/b;
          System.out.println(c);
      }
      catch (ArithmeticException e){
          System.out.println("sanboi kiruku");
      }
      finally {
          System.out.println("success");
      }
    }
}
