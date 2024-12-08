//package multiThread;
//
//
//class CSITBOOKStatic{
//	static int csitseats = 68;
//	public static synchronized void bookSeat(int reqseats) {
//		if(csitseats >= reqseats) {
//			System.out.println(reqseats + " seats books successfully");
//			csitseats = csitseats - reqseats;
//			System.out.println(csitseats + " seats are available");
//		}else {
//			System.out.println(reqseats + " Seats are not vailable");
//			System.out.println(csitseats + " seats are available");
//			}
//	}
//}
//
//class Mythread extends Thread{
//	CSITBOOKStatic a;
//	int seats;
//	Mythread(CSITBOOKStatic a, int seats){
//		this.a = a;
//		this.seats = seats;
//	}
//	
//	public void run() {
//		a.bookSeat(seats);
//	}
//	
//}
//
//
//
//
//public class StaticSynchronization extends Thread{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CSITBOOKStatic esewa = new CSITBOOKStatic();
//		Mythread ram = new Mythread(esewa, 12);
//		Mythread shyam = new Mythread(esewa, 10);
//		Mythread hari = new Mythread(esewa, 15);
//		ram.start();
//		shyam.start();
//		hari.start();
//		CSITBOOKStatic khalti = new CSITBOOKStatic();
//		Mythread k1 = new Mythread(khalti, 12);
//		Mythread k2 = new Mythread(khalti, 10);
//		Mythread k3 = new Mythread(khalti, 15);
//		k1.start();
//		k2.start();
//		k3.start();
//	}
//
//}
