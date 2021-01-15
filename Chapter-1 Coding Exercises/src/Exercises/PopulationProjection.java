/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercises;

/**
 *
 * @author Justin
 */
public class PopulationProjection {

	public static void main(String[] args) {
		double secondsPerYear = 31536000;
		double population = 312032486;
		double births;
		double deaths;
		double immigrants;

		births = secondsPerYear / 7;
		deaths = secondsPerYear / 13;
		immigrants = secondsPerYear / 45;
		population = population + births + immigrants - deaths;

		System.out.println("The population after one year is " + (int) population);
	}
}
