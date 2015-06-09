package problem001;
import shared.MathFunctions;

public class Solution {

	public static void main(String[] args) {
		
		int[] divisors = { 3, 5 };
		int limit = 1000;
		
		int total = 0;
		for(int value : MathFunctions.getDivisibleNumbers(divisors, limit)){
			total += value;
		}
		
		//some fancy footwork to give a nicer result string
		String divisorsString = "";
		for(int j=0; j<divisors.length; j++){
			divisorsString += divisors[j];
			if(divisors.length != j+1){
				divisorsString += " or ";
			}
		}
		
		//we now have our answer, nicely printed out
		System.out.println("The sum of all natural numbers less than " + limit + " divisible by " + divisorsString + " is " + total + ".");
	}
}
