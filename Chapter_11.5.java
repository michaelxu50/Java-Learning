class Q {
    int n;
    boolean ValueSet = false;

    synchronized int get() {
        while(!ValueSet)
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }

            System.out.println("Got: " + n);
            ValueSet = false;
            notify();
            return n;
    }

    synchronized void put(int n) {
        while(ValueSet) {
            try {
                wait();
            }
            catch(InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
            this.n = n;
            ValueSet = true;
            System.out.println("Put: " + n);
            notify();
        }
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    public void run() {
        while(true) {
            q.get();
        }
    }
}

class PCFixed {
    public static void main(String args[]) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        //start the threads.
        p.t.start();
        c.t.start();

        System.out.println("Press Control-c to stop. ");
    }
}

//use suspend, remume, and stop to do said things.

