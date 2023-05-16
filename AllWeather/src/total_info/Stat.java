package total_info;


public class Stat {
   private int height ; // 키
   private int weight ; // 몸무게
   private int age ; // 나이
   
   
   public Stat(int height , int weight , int age ) {
	   this.height = height;
	   this.weight = weight;
	   this.age = age;
   }
   
   
// get/set

public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}

   
   
   
   
}
