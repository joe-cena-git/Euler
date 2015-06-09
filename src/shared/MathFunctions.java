package shared;

import java.util.ArrayList;

public class MathFunctions {

	/**
	 * Get an array of any number up to the "limit" that is divisible by any of the "divisors".
	 * A number will end up in the result if it is divisible by even just one of the divisors.
	 * 
	 * @param divisors The numbers a result may be divisible by.
	 * @param limit The maximum number to check for divisibility.
	 * @return An array of integers that are divisible by any of the divisors.
	 */
	public static ArrayList<Integer> getDivisibleNumbers(int[] divisors, int limit){
		
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i < limit; i++){
			for(int n = 0; n < divisors.length; n++){
				if(i % divisors[n] == 0){
					result.add(i);
					break; //stop checking for divisibility by the other divisors, one is all it takes
				}
			}
		}
		return result;
	}
}
