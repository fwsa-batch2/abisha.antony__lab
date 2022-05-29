public class runnableinterface implements Runnable{
    public void run(){
        System.out.println("Runnable");
    }

    public static void main(String[] args) {
        Thread obj = new Thread(new runnableinterface());
        for (int i = 0; i < 7; i++) {
            obj.run();
        }
    }
}
