package project;

class MyRunnable implements Runnable{
	public void run() {
		 for (int i = 1; i <= 5; i++) {
	            System.out.println(i + " - " + Thread.currentThread().getName());
	            try {
	                Thread.sleep(2000);  
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}
		
	}

}
