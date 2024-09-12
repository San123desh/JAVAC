package first_lab;

class MyNepse{
    private int shares = 100;

    // Synchronized method for buying shares
    public void buyShares(int amount) {
    	synchronized(this) {
    		
    		if (shares >= amount) {
    			System.out.println("Shares bought: " + amount  );
    			try {
    				Thread.sleep(100);
    			}catch(InterruptedException e) {
    				e.printStackTrace();
    			}
    			shares -= amount;
    			System.out.println("Remaining: " + shares);
    		} else {
    			System.out.println("Not enough shares to buy " + amount);
    			System.out.println("Shares buyable: " + shares);
    		}
    	}
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Nepse market = new Nepse();

        Thread buyer1 = new Thread(() -> market.buyShares(30));
        Thread buyer2 = new Thread(() -> market.buyShares(50));
        Thread buyer3 = new Thread(() -> market.buyShares(80));
        

        buyer1.start();
        buyer2.start();
        buyer3.start();
    }
}
