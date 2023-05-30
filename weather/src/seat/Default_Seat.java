package seat;

public class Default_Seat {
	public String[][] seat = new String[5][9];
	
	public void reference(){
		char row = 'A';

		for(int i=1; i<5; i++){
			System.out.print("\n"+row+"열  ");row++;
			for(int j=1; j<9; j++){
				String seat = (this.seat[i][j].equals("___"))?"◻︎":"◼︎";
				System.out.print((j)+seat+"  ");
			}
		}
	}
}
