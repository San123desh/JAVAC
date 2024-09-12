package first_lab;

//public class multithreadManagement {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


class MyThread extends Thread {
    final Object lock;

    public MyThread(String name, Object lock) {
        super(name);
        this.lock = lock;
    }

    public void run() {
        System.out.println(getName() + " started.");

        // sleep() - pause the thread for 1 second
        try {
            System.out.println(getName() + " is sleeping.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }

        // yield() - hint to give other threads a chance to run
        System.out.println(getName() + " is yielding.");
        Thread.yield();

        // wait() - waiting for a notification
        synchronized (lock) {
            try {
                System.out.println(getName() + " is waiting.");
                lock.wait(); // wait for notify to continue
            } catch (InterruptedException e) {
                System.out.println(getName() + " was interrupted while waiting.");
            }
        }

        System.out.println(getName() + " resumed after notify.");
    }

    // Stop thread (simulating stop since stop() is deprecated)
    public void stopThread() {
        System.out.println(getName() + " is stopped.");
        interrupt(); // interrupts the thread (like stopping)
    }
}

public class multithreadManagement {
    public static void main(String[] args) {
        Object lock = new Object(); // shared lock object

        MyThread t1 = new MyThread("Thread 1", lock);
        MyThread t2 = new MyThread("Thread 2", lock);

        t1.start();
        t2.start();

        // Let threads start and sleep for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // notify() - wake up one of the waiting threads
        synchronized (lock) {
            System.out.println("Main thread is notifying one thread.");
            lock.notify(); // wakes up one waiting thread
        }
    }
}
