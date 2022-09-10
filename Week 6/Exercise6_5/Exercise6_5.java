//Add necessary codes to print the following:
// -----------------OUTPUT-------------------

// Name of thread 't':Thread-0
// New name of thread 't':NPTEL
// Thread is running.
// -------------------------------------------------

class Exercise5_5 extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String args[]) {
        Exercise5_5 t = new Exercise5_5();
        System.out.println("Name of thread 't':" + t.getName());

        // Write the necessary code below...
        t.start();
        t.setName("NPTEL");

        System.out.println("New name of thread 't':" + t.getName());
    }
}