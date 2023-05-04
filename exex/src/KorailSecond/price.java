package KorailSecond;

public class price extends TicketingInfo  {
	private int price; // 결제금액

	
	
   public void choiceEndstation() {
	   if(this.endStation == 1) {price busan = new GangneungPrice();}
	   if(this.endStation == 2) {price busan = new YeosuPrice();}
	   if(this.endStation == 3) {price busan = new GangneungPrice();}
	   
	   priceEndstation(price);
	   priceObstacle();
	   priceSeat();
   }
	
	
	
	public void priceEndstation(int price) {
		this.price = price;
		priceObstacle();
		priceSeat();
	}
	
	public int priceObstacle() {
		if(obstacle == 'o') {this.price = this.price *(int) 0.5; }
		return price;
	}
	
	public int priceSeat() {
		if(seat == 2) {this.price += 20000;}
		return price;
	}

	
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}








}

