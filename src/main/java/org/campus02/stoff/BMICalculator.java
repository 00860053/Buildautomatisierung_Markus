package org.campus02.stoff;

public class BMICalculator {
	private double weightInKg;
	private double heightInMeters;

	public BMICalculator(double weightInKg, double heightInMeters) {
		this.weightInKg = weightInKg;
		this.heightInMeters = heightInMeters;
	}

	public double getWeightInKg() {
		return weightInKg;
	}

	public double getHeightInMeters() {
		return heightInMeters;
	}

	public double calculateBMI() {
		return weightInKg / (heightInMeters * heightInMeters);
	}

	public String result() {
		double bmi = calculateBMI();

		if (bmi < 18.5) {
			return "underweight";
		} else if (bmi < 25) {
			return "normal";
		} else if (bmi < 30) {
			return "overweight";
		} else {
			return "obese";
		}
	}
}
