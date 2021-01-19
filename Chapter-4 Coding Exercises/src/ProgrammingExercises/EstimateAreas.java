/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author Justin
 */
public class EstimateAreas {

	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		final double RADIUS = 6371.01;

		double charlotteX = 35.2270869;
		double charlotteY = -80.8431267;
		double atlantaX = 33.7489954;
		double atlantaY = -84.3879824;
		double savannahX = 32.0835407;
		double savannahY = -81.0998342;
		double orlandoX = 28.5383355;
		double orlandoY = -81.3792365;

		double CToSDistance = RADIUS * Math.acos(Math.sin(charlotteX) * Math.sin(savannahX)
				+ Math.cos(charlotteX) * Math.cos(savannahX) * Math.cos(charlotteY - savannahY));
		double AToSdistance = RADIUS * Math.acos(Math.sin(atlantaX) * Math.sin(savannahX)
				+ Math.cos(atlantaX) * Math.cos(savannahX) * Math.cos(savannahY - atlantaY));
		double AToCdistance = RADIUS * Math.acos(Math.sin(atlantaX) * Math.sin(charlotteX)
				+ Math.cos(atlantaX) * Math.cos(charlotteX) * Math.cos(atlantaY - charlotteY));
		double OToSdistance = RADIUS * Math.acos(Math.sin(orlandoX) * Math.sin(savannahX)
				+ Math.cos(orlandoX) * Math.cos(savannahX) * Math.cos(orlandoY - savannahY));
		double AToOdistance = RADIUS * Math.acos(Math.sin(atlantaX) * Math.sin(orlandoX)
				+ Math.cos(atlantaX) * Math.cos(orlandoX) * Math.cos(atlantaY - orlandoY));

		double s1 = (CToSDistance + AToSdistance + AToCdistance) / 2;
		double area1 = Math.sqrt(s1 * (s1 - CToSDistance) * (s1 - AToSdistance) * (s1 - AToCdistance));

		double s2 = (AToSdistance + OToSdistance + AToOdistance) / 2;
		double area2 = Math.sqrt(s2 * (s2 - AToSdistance) * (s2 - OToSdistance) * (s2 - AToOdistance));

		double area = area1 + area2;

		System.out.printf("The area between Atlanta, GA; Orlando, FL; Savannah, GA; and Charlotte, NC is %.3f km", area);
	}
}
