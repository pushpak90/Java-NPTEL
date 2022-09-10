public class Exercise6_1 extends Thread{
    public void run(){
    System.out.print("Thread is Running.");  
    }
    
        public static void main(String args[]){  
  
          // Creating object of thread class
          Exercise6_1 thread=new Exercise6_1();  
  
                  // Start the thread
          thread.start();
      }  
  }