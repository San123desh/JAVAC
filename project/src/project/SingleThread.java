package project;


public class SingleThread extends Thread{
	public void run() {
		for(int i=1;i<=4;i++) {
			System.out.println(i + "--" +"sandesh");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		SingleThread a = new SingleThread();
		a.start();

	}

}
