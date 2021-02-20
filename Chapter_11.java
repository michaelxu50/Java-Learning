//controlling hte main Thread.
class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t);

        //change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);

        try {
            for(int n=5; n>0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}

//Create a second thread.
class NewThread implements Runnable{
    Thread t;

    NewThread() {
        //create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    //This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child interupted. ");
        }
        System.out.println("Exiting child thread. ");
    }
}

class ThreadDemo {
    public static void main(String args[]) {
        NewThread nt = new NewThread(); //create a new thread

        nt.t.start(); //Start the thread

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted. ");
        }
        System.out.println("Main thread exiting.");
    }
}

//Create a second thread by extending Thread.
class NewThread2 extends Thread{
    Thread t;

    NewThread2() {
        //create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    //This is the entry point for the second threade.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Child interupted. ");
        }
        System.out.println("Exiting child thread. ");
    }
}

class ExtendThread {
    public static void main(String args[]) {
        NewThread2 nt = new NewThread2(); //create a new thread

        nt.start(); //Start the thread

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted. ");
        }
        System.out.println("Main thread exiting.");
    }
}

class NewThread3 implements Runnable {
    String name; //name of thread
    Thread t;

    NewThread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    //This is the entry point for the thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

class MultiThreadDemo {
    public static void main(String args[]) {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            //wait for other threads to end
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Main thread exiting.");
    }
}

//use final boolean isAlive() to check when a thread has terminated.
// ex. final void join() throws InterruptedException.
class NewThread4 implements Runnable {
    String name; //name of thread
    Thread t;

    NewThread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    //This is the entry point for the thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}

class DemoJoin {
    public static void main(String args[]) {
        NewThread4 nt1 = new NewThread4("One");
        NewThread4 nt2 = new NewThread4("Two");
        NewThread4 nt3 = new NewThread4("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is alive: " + nt3.t.isAlive());

        try {
            System.out.println("Waiting for thread to finish.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();

        }
        catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: " + nt1.t.isAlive());
        System.out.println("Thread Two is alive: " + nt2.t.isAlive());
        System.out.println("Thread Three is alive: " + nt3.t.isAlive());

        System.out.println("Main thread exiting.");
    }
}

//to set a priority of a thread use final void setPriority(int level)
//int level between 1 and 10
//use norm prioity to set a value back to 5

//a synchronized thread can let one method into the resource at a time. It makes the other one wait.
class Callme {
    synchronized void call (String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    public void run() {
        target.call(msg);
    }
}

class Synch {
    public static void main(String args[]) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        //Start the threads.
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        //wait for thread to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

//if you can't add synchronized to the method then use
// synchronized(objRef) {
// statement to be synchronized
// }

