package _3grouping.grouping;

class Calculator {
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Parameter divider should not be 0");
		}
		return Math.round(a / b);
	}
	
	public long sqrt(int a) {
		if (a < 0) {
			throw new IllegalArgumentException("Parameter should be positive or 0");
		}
		return Math.round(Math.sqrt(a));
	}
}