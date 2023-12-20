package u10_Recursion;

public class NoLoops {
	
	
	public static void main(String[] args) {
		loop(5,-1,1);
		
	
		
	}
	
	public static int factorial(int n) {
		if(1 >= n) {
			return 1;
		}
		
		return n + factorial(n -1);
	}
	
	/**Simple for loop replacement*/
	public static void loopDown(int i) {//stop
		if(0 >= i) {//start
			return;
		}
		
		System.out.println(i + ": loop");
		
		loopDown(i - 1);//step	
	}
	
	
	/** loop replacement */
	public static void loop(int start, int stop, int step) {
		
		System.out.println(start + ": loop");
		
		if(start == stop) {//halting condition
			return;
		}
		
		if(start <= stop) {
			loop(start + step,stop,step);//recurse
		}
		else {
			loop(start - step,stop,step);//recurse
		}
	}

}
