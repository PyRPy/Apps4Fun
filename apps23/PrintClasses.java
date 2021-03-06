package apps23;

public class PrintClasses {

	public static void main(String[] args) {
		// build a user class
		class User {
			
			int score;
			public boolean hasWon() {
				if (score >= 100 ) {
					return true;
				} else {
					return false;
				}
			}
		}
		
		User bob = new User();
		bob.score = 100;
		System.out.println(bob.score);
		System.out.println(bob.hasWon());
		
		// build a number class
		class Number {
			int number;
			public boolean isPositive() {
				if (number > 0) {
					return true;
				} else {
					return false;
				}
			}
		}
		
		Number num = new Number();
		num.number = -8;
		if (num.isPositive()) {
			System.out.println(num.number + " is positive");
		} else {
			System.out.println(num.number + " is not positive");
			
		}

	}

}
