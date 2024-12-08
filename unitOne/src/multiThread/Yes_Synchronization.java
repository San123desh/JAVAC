package multiThread;


class CSITBOOK1{
	int csitseats = 68;
	synchronized public void bookSeat(int seats) {
		if(csitseats >= seats) {
			System.out.println(seats + " seats books successfully");
			csitseats = csitseats - seats;
			System.out.println(csitseats + " seats are available");
		}else {
			System.out.println(seats + " Seats are not vailable");
			System.out.println(csitseats + " seats are available");
			}
	}
}



public class Yes_Synchronization extends Thread{

	static CSITBOOK1 sd;
	int seats;
	
	public void run() {
		sd.bookSeat(seats);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sd = new CSITBOOK1();
		Yes_Synchronization s1 = new Yes_Synchronization();
		s1.seats = 40;
		s1.start();
		
		Yes_Synchronization s2 = new Yes_Synchronization();
		s2.seats = 20;
		s2.start();
		
		Yes_Synchronization s3 = new Yes_Synchronization();
		s3.seats = 25;
		s3.start();

	}

}
