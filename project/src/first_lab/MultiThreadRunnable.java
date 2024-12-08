package first_lab;


class MyWorkout1 implements Runnable{
	public void run() {
		int weight = 5;
		for(int i=1;i<=5;i++) {
			System.out.println("Lift " + weight + "kg");
			weight += 2;
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
			}
		}
	}
}


class MyGym1 implements Runnable{
	public void run() {
		int weight = 7;
		for(int i=1;i<=5;i++) {
			System.out.println("Add " + weight + "kg");
			weight += 2;
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
			}
		}
	}
}


public class MultiThreadRunnable {

	public static void main(String[] args) {
		MyWorkout1 a = new MyWorkout1();
		MyGym1 b = new MyGym1();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		
		t2.start();
	}

}



