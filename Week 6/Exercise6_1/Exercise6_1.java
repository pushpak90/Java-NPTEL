public class Exercise6_1 extends Thread{
    public void run()
    {
        System.out.println("Thread is Running.");
    }
    public static void main(String[] args) {
        Exercise6_1 thread = new Exercise6_1();
        thread.start();
    }
}
