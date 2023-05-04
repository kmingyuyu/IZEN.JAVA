package KorailSecond;

public class GangneungPrice extends price {

	@Override
	public void priceEndstation(int price) {
		super.setPrice(50000);
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
