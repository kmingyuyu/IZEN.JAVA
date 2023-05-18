package movie_info;

import java.util.ArrayList;

public class DayInfo {
	private int ticketingDay; //예매 할수 있는 요일
	private int[] ticketingTime; //예매 할수 있는 요일
	
	private ArrayList<DefaultInfo> defaultInfoList = new ArrayList<> ();
	
	public DayInfo (int ticketingDay , int[] ticketingTime) {
		this.ticketingDay = ticketingDay; 
		this.ticketingTime = ticketingTime; 
	}
	
	public void getDefaultInfoList (DefaultInfo defaultInfo) {
		defaultInfoList.add(defaultInfo);
	}
	

	public int getTicketingDay() {
		return ticketingDay;
	}

	public void setTicketingDay(int ticketingDay) {
		this.ticketingDay = ticketingDay;
	}

	public int[] getTicketingTime() {
		return ticketingTime;
	}

	public void setTicketingTime(int[] ticketingTime) {
		this.ticketingTime = ticketingTime;
	}

	public ArrayList<DefaultInfo> getDefaultInfoList() {
		return defaultInfoList;
	}

	public void setDefaultInfoList(ArrayList<DefaultInfo> defaultInfoList) {
		this.defaultInfoList = defaultInfoList;
	}
	
	
	
	
	
	
	
}



