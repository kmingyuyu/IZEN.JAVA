package singletone.print;

public class User {
    private String name;
    
    public User(String name) {
    	this.name = name ;
    }
    
    
//   사용자가 프린트를 사용해서 출력하는 메소드
    public void print() {
    	Printer printer = Printer.getPrinter();
    	printer.print(this.name + "프린트 사용중:" + printer.toString() + "."); 
    }
    
    
}
