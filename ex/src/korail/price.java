package korail;

public class price extends TicketingInfo  {
	private int price; // 결제금액

	
	public price() {
		choiceEndstation();
	}
	
	
	
   public void choiceEndstation() {
	   if(super.getEndStation() == 1) {price bp = new BusanPrice();}
	   if(super.getEndStation() == 2) {price yp = new YeosuPrice(35000);}
	   if(super.getEndStation() == 3) {price gp = new GangneungPrice();}
   }
	
	
	


	public void priceEndstation(int price) {
		this.price = price;
		priceAdult();
		priceSeat();
	}
	
	
//	인원수(장애인원)포함 금액
	public int priceAdult() {
		this.price = (this.price * (super.getAdult() - super.getObstacle())) + (((int) (this.price * 0.5) * super.getObstacle()) ) ;
		return price;
	}
	
//  특별석 추가요금	금액
	public int priceSeat() {
		if(super.getSeat() == 2) {this.price += 20000;}
		return price;
	}

	
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}








}

