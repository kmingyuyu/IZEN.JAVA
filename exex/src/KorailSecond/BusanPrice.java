package KorailSecond;

public class BusanPrice extends price {

	@Override
	public void priceEndstation(int price) {
		super.setPrice(70000);
		super.priceEndstation(price);
	}

	@Override
	public int priceObstacle() {
		return super.priceObstacle();
	}

	@Override
	public int priceSeat() {
		return super.priceSeat();
	}
     
	
	


	
	
}
