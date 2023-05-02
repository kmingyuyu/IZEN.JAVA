package Quiz;

public class MainActivity extends Activity {

	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("추가적인 실행내용");
	}

	
	
	
	
}

class ex10 {
	public static void main(String[] args) {
		MainActivity main = new MainActivity();
		
		main.onCreate();
		
	}
	
}
