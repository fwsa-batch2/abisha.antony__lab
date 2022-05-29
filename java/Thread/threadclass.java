public class threadclass extends Thread {
    public void run(){
        System.out.println("thread");
    }

    public static void main(String[] args) {
        threadclass obj = new threadclass();
        obj.start();
    }

}
