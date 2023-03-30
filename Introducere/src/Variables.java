
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		String course = "Testing";
		char letter ='A';
		double dec = 5.9;
		boolean test = true;
		
		if (dec >= 0) {
		System.out.println( "This is my first " + course + " course!");
		}
		else {
		System.out.println(letter);	
		}
		
		//Arrays-
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 9;
		
		int[] arr2 = {1, 2, 3};
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}

}
