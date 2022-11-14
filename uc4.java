
public class uc4 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	static int empHrs = 0;
	static int empWage = 0;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		uc4 empwage = new uc4();
		int attendance = uc4.empAttendance();
		uc4.empDailyWage(attendance);
	}

	private static int empAttendance() {
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck) {
		case IS_FULL_TIME:
			System.out.println("Employee present  IS_FULL_TIME:");
			break;
		case IS_PART_TIME:
			System.out.println("Employee present IS_PART_TIME: ");
			break;
		default:
			System.out.println("Employee is abscent: ");
		}
		return empCheck;
	}

	private static void empDailyWage(int empCheck) {
		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}

}
