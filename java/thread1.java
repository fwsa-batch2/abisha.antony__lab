 public class thread1 implements Runnable{
    public void run(){
        System.out.println("sanboi");
    }
     public static void main(String[] args) {
         Thread obj = new Thread(new thread1());
         for(int i = 0;i <4;i++){
             obj.run();
         }
     }


}