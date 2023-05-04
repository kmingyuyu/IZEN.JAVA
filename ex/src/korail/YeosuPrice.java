package korail;

public class YeosuPrice extends price {

	public YeosuPrice(int price) {
		
		priceEndstation(35000);
		priceAdult();
		priceSeat();
	}

	@Override
	public void priceEndstation(int price) {
		super.priceEndstation(price);
	}

	@Override
	public int priceAdult() {
		return super.priceAdult();
	}

	@Override
	public int priceSeat() {
		return super.priceSeat();
	}
	
	
	
	

}
