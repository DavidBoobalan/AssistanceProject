package phase1;

public class Constructor {
	static int i;
	Constructor(){
		i=30;
		theNum();
	}

	public static void main(String[] args) {
		System.out.println("this is in main:"+i);

	}
	public static void theNum() {
		i++;
		System.out.println("this is in theNum:"+i);
	}

}
