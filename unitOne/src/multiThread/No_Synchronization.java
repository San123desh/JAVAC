package multiThread;

class CSITBOOK{
	int csitseats = 68;
	public void bookSeat(int seats) {
		if(csitseats >= seats) {
			System.out.println(seats + " seats books successfully");
			csitseats = csitseats - seats;
			System.out.println(csitseats + " seats are available");
		}else {
			System.out.println("Seats are not vailable");
			System.out.println(csitseats + " seats are available");
			}
	}
}

public class No_Synchronization extends Thread{
	
	static CSITBOOK sd;
	int seats;
	
	public void run() {
		sd.bookSeat(seats);
	}

	public static void main(String[] args) {
		sd = new CSITBOOK();
		No_Synchronization s1 = new No_Synchronization();
		s1.seats = 40;
		s1.start();
		
		No_Synchronization s2 = new No_Synchronization();
		s2.seats = 20;
		s2.start();
		

	}

}
