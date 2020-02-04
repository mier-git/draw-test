import java.util.Scanner;

public class DrawTheCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DrawTheCharacter drawProg = new DrawTheCharacter();
		String output, character;
		int outputInt, num, con;
		
		System.out.println("Welcome to Drawing!!! ");
		do {
			System.out.println("Continue to Draw? (1 to Continue/ 0 to Stop) ");
			con = input.nextInt();
			
			if (con != 0) {
				do {
					System.out.println("Enter a character [O, X, Y, Z]: ");
					character = input.next();
					output = drawProg.inputCharacter(character);
					if (!output.contentEquals("true")) {
						System.out.println(output);
					}
				} while (!output.contentEquals("true"));
				
				do {
					System.out.println("Enter a non negative odd integer: ");
					num = input.nextInt();
					outputInt = drawProg.inputNumber(num);
					if (outputInt == 0) {
						System.out.println("Should not be negative or even number.");
					}
				} while (outputInt != 1);
				
				drawProg.identifyForm(character, num);
			} else {
				System.out.println("Thanks for trying! ");
			}
		} while(con != 0);

		
		
	}
	
	public void identifyForm(String str_val, int in_num) {
		DrawTheCharacter drawProg = new DrawTheCharacter();
		String uppercase = str_val.toUpperCase();
		if (uppercase.contentEquals("O")) {
			drawProg.drawOw(in_num);
		} else if (uppercase.contentEquals("X")) {
			drawProg.drawX(in_num);
		} else if (uppercase.contentEquals("Y")) {
			drawProg.drawY(in_num);
		} else if (uppercase.contentEquals("Z")) {
			drawProg.drawZ(in_num);
		}
	}
	
	public void drawZ(int value) {
		int index = 0;
		
		do {
			for (int i = 0; i < value; i++) {
				if (index == 0 || index == (value - 1)) {
					System.out.print("*");
				} else {
					if (i == (value - 1) - index) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
			index += 1;
		} while (index < value);
	}
	
	public void drawY(int value) {
		int index = 0;
		int division = value/2;
		boolean bol = false;
		
		do {
			for (int i = 0; i < value; i++) {
				if (index == 0) {
					if (i == 0 || i == (value - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (index == division && i == division) {
						bol = true;
						System.out.print("*");
					} else if ((i == index || i == (value - 1) - index) && bol == false) {
						System.out.print("*");
					} else if (bol == true && i == division) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println(" ");
			index += 1;
		} while (index < value);
	}
	
	public void drawX(int value) {
		int index = 0;
		int division = value/2;
		
		do {
			for (int i = 0; i < value; i++) {
				if (index == 0 || index == (value - 1)) {
					if (i == 0 || i == (value - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (index == division && i == division) {
						System.out.print("*");
					} else {
						if (i == index || i == (value -1) - index) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
				}
			}
			System.out.println(" ");
			index += 1;
		} while (index < value);
	}
	
	public void drawOw(int value) {
		int index = 0;
		
		do {
			for (int i = 0; i < value; i++) {
				if (index == 0 || index == (value - 1)) {
					System.out.print("*");
				} else {
					if (i == 0 || i == (value - 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
			index += 1;
		} while (index < value);
	}

	public String inputCharacter(String value) {
		String uppercase = value.toUpperCase();
		if (uppercase.contentEquals("O") || uppercase.contentEquals("X") || uppercase.contentEquals("Y") || uppercase.contentEquals("Z")) {
			return "true";
		} else {
			return "Should input character O, X, Y, Z.";
		}
	}
	
	public int inputNumber(int value) {
		if (value%2 != 0 && value >= 3) {
			return 1;
		} else {
			return 0;
		}
	}
}
