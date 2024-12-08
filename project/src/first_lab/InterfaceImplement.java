package first_lab;

interface ShareMarket{
	void buyShare(int quantity);
	
	void sellShare(int quantity);
	
	double getCurrentPrice();
	
	String getStockName();
	
	int getTotalShares();
}


class Stock implements ShareMarket{
	private String stockName;
	private double currentPrice;
	private int totalShares;
	
	public Stock(String stockName,double initialPrice) {
		this.stockName = stockName;
		this.currentPrice = initialPrice;
		this.totalShares = 0;
	}
	
	@Override
	public void buyShare(int quantity) {
		totalShares += quantity;
		System.out.println("Bought " + quantity + " share of " + stockName);
		
	}
	
	@Override
	public void sellShare(int quantity) {
		totalShares -= quantity;
		System.out.println("Sold " + quantity + " shares of " + stockName);
	}
	
	@Override
	public double getCurrentPrice() {
		
		return currentPrice;
	}
	
	@Override
	public String getStockName() {
		
		return stockName;
	}
	
	@Override
	public int getTotalShares() {
		
		return totalShares;
	}
	
	public double getValue() {
		return totalShares*currentPrice;
	}
}



public class InterfaceImplement {

	public static void main(String[] args) {
		
		
		Stock myShare = new Stock("ZYX",990.56);
		
		myShare.buyShare(501);
		
		System.out.println("Current Price of " + myShare.getStockName() + " is Rs:" + myShare.getCurrentPrice());
		
		myShare.sellShare(30);
		
		System.out.println("Remaining share of " + myShare.getStockName() + " is " + myShare.getTotalShares());
		
		System.out.println("Value of remaining share " + myShare.getValue());
	}

}
