package apps23;

public class NumberShapes {

	public static void main(String[] args) {
		class Number {
			int number;
			int x = 1;
			int triangularNumber = 1;
			
			public boolean isTriangular() {
				
				
				while (triangularNumber < number) {
					
					x++;
					triangularNumber = triangularNumber + x;
					
				}
				
				if (triangularNumber == number) {
					return true;
				} else {
					return false;
				}
				
			}
			
			public boolean isSquare() {
				
				double squareRoot = Math.sqrt(number);
				if (squareRoot == Math.floor(squareRoot)) {
					return true;
				} else {
					return false;
				}
			}
		}

			Number myNumber = new Number();
			myNumber.number = 25;
			System.out.println(myNumber.isTriangular());
			System.out.println(myNumber.isSquare());
	}

}
