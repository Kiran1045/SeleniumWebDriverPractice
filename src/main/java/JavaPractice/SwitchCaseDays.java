package JavaPractice;

public class SwitchCaseDays {

	public static void main(String[] args) {
		int weekday=1;
		switch (weekday) {
		case 1:System.out.println("Day is sunday");
		break;
		case 2:System.out.println("Day is MONDAY");
		break;
		case 3:System.out.println("Day is Tuesday");
		break;
		case 4:System.out.println("Day is Wednesday");
		break;
		case 5:System.out.println("Day is Thursday");
		break;
		case 6:System.out.println("Day is Friday");
		break;
		case 7:System.out.println("Day is Saturday");
		break;
		default:System.out.println("invalid dAY");
			break;
		}
	}

}
