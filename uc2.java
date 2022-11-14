
public class uc2 {
	public static int IS_FULL_TIME = 1;
	public static final int EMP_RATE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;

	public static void main(String[] args) {
		uc2 empWage = new uc2();
		double a = uc2.empAttandance();
		empWage.empDailyWages(a);
	}

	private static double empAttandance() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present: ");
		} else {
			System.out.println("Employee is abscent: ");
		}
		return empCheck;
	}

	private void empDailyWages(double empCheck) {
		if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("" + empWage);
		}
	}

}
