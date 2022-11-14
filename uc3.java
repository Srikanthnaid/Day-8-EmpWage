
public class uc3 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 4;
	public static final int EMP_RAT_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;

	public static void main(String[] args) {

		uc3 empWage = new uc3();
		double a = empWage.empAttendance();
		empWage.empDailyWages(a);
	}

	public double empAttendance() {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present full-time");
		} else if (empCheck == IS_PART_TIME) {
			System.out.println("Employee is Present part-time");
		} else {
			System.out.println("Employee is Absent");
		}
		return empCheck;
	}

	public void empDailyWages(double empCheck) {
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;

		empWage = empHrs * EMP_RAT_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}

}
