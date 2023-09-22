package conditionalStatements;

public class ChineseZodiac {

	public static void main(String[] args) {
		// Always add the opening/closing curly braces 
		// The opening brace should be at the end of the line that begins the
		// compound statement; the closing brace should begin a line and be
		// indented to the beginning of the compound statement.
		int year = 2022;
		switch (year % 12) {
		case 0: {
			System.out.println("monkey");
		}
			break;
		case 1: {
			System.out.println("rooster");
		}
			break;
		case 2: {
			System.out.println("dog");
		}
			break;
		case 3: {
			System.out.println("pig");
		}
			break;
		case 4: {
			System.out.println("rat");
		}
			break;
		case 5: {
			System.out.println("ox");
		}
			break;
		case 6: {
			System.out.println("tiger");
		}
			break;
		case 7: {
			System.out.println("rabbit");
		}
			break;
		case 8: {
			System.out.println("dragon");
		}
			break;
		case 9: {
			System.out.println("snake");
		}
			break;
		case 10: {
			System.out.println("horse");
		}
			break;
		case 11: {
			System.out.println("sheep");
		}

		}

	}

}
