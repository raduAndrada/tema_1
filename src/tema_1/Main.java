package tema_1;

import java.time.Duration;
import java.time.Instant;

public class Main {
	private static final int k = 150 * 1000;
	private static final int ITERATIONS = 999999999;
	
	public static void main (String[] args) {
		Instant start_1 = Instant.now();
		int kth_1 = findKthPrimeNum_1();
		Instant end_1 = Instant.now();
		System.out.println("The k-th prime number");
		System.out.println("Method 1 took: " + Duration.between(start_1, end_1).toNanos() + " nanoseconds");
		System.out.println("Found number is: " + kth_1);
		
		Instant start_2 = Instant.now();
		int kth_2 = findKthPrimeNum_2();
		Instant end_2 = Instant.now();
		System.out.println("Method 2 took: " + Duration.between(start_2, end_2).toNanos() + " nanoseconds" );
		System.out.println("Found number is: " + kth_2);
		
		System.out.println("PI computations");
		start_1 = Instant.now();
		final Double pi_1 = computePi_1();
		end_1 = Instant.now();
		System.out.println("Method 1 took: " + Duration.between(start_1, end_1).toNanos() + " nanoseconds");
		System.out.println("PI value is: " + pi_1);
		
		start_2 = Instant.now();
		final Double pi_2 = computePi_2();
		end_2 = Instant.now();
		System.out.println("Method 2 took: " + Duration.between(start_2, end_2).toNanos() + " nanoseconds");
		System.out.println("PI value is: " + pi_2);
	}
	
	private static int findKthPrimeNum_1 () {
		int j = 0;
		int i = 2;
		for (; j <= k; ) {
			if (MathUtility.isPrime(i)) {
				j++;
			}
			if (i == 2 ) {
				i++;
			} else {
				i +=2;
			}
		}
		return i;
	}
	
	private static int findKthPrimeNum_2 () {
		final int arrSize = k * 100;
		final int []numArray = MathUtility.generateArray(arrSize);
		int kth = 0;
		int j = 0;
		while (j < numArray.length - 1) {
			if (MathUtility.isPrime(numArray[j])) {
				kth ++;
			}
			
			if (kth == k) {
				break;
			}
			j ++;
		}
		return numArray[j];
	}
	
	private static Double computePi_1() {
		return MathUtility.computePi_1(ITERATIONS);
	}
	
	private static Double computePi_2() {
		return MathUtility.computePi_2(ITERATIONS);
	}
}
