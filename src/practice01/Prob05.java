package practice01;

public class Prob05 {

	public static void main(String[] args) {

		for(int i = 1; i <= 99; i++) {
			int dec = 1;
			int num = 1;
			
			if(i >= 10) {
				dec = i / 10;
				num = (i % 10) == 0? 1: (i % 10);
			} else {
				num = i;
			}
			
			if( (dec % 3) == 0 && (num % 3) == 0 ){
				System.out.println(i + " 짝짝");
			} else if( (num % 3) == 0 || (dec % 3) == 0 ) {
				System.out.println(i + " 짝");
			}
			
		}
	}

}
