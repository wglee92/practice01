package practice01;

public class Prob5 {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		while( num++ < 1000 ) {
			String s = String.valueOf( num );
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9') {
					System.out.print(num + " ");
					break;
				}
			}
			for (int j=0; j<s.length(); j++) {
			if (s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9')
				count++;	
			}
			
			for ( int k=0; k<count; k++) {
				System.out.print("짝");
			}
			for (int i=0; i<s.length(); i++) {
				if (s.charAt(i) == '3' || s.charAt(i) == '6' || s.charAt(i) == '9') {
					System.out.println();
					break;
				}
			}
			count = 0;

		}
	}
}

