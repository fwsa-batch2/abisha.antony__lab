class parent{
    String word = "cow";
}
class child extends parent{
    int num = 10;
}


public class singleinherit {
  public static void main(String[] args) {
    child obj = new child();
    System.out.println(obj.word);
    System.out.println(obj.num);
      
  }  
}
