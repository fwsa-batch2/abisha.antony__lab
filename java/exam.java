interface example{
void mname();
void mename();
}
class example1 implements example {
    public void mname(){
        String a = "abisha";
        System.out.println(a);
      
     
    }
    public void mename(){
        int age = 18;
        System.out.println(age);
    }
}


public class exam {
    public static void main(String[] args) {
        example1 myobj = new example1();
        myobj.mname();
    

    }
    
}
