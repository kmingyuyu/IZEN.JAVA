package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldintarray = {1,2,3};
		int[] newintarray = new int[5];
		
//		배열복사
        for(int i=0; i<oldintarray.length; i++) {
        	newintarray[i] = oldintarray[i];
        	
//        	System.out.println(oldintarray[i]);
        }
        for(int i=0; i<newintarray.length; i++) {
        	
        	System.out.println(newintarray[i]);
        }
        
	}

}
