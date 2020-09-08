package tema_1;

public class MathUtility {
 public static boolean isPrime(final int num) {
	  boolean flag = false;
      for(int i = 2; i <= num/2; ++i)
      {
          // condition for nonprime number
          if(num % i == 0)
          {
              flag = true;
              break;
          }
      }

	 return flag;
 }
 
 public static int[] generateArray (final int size) {
	 int [] numArray = new int [size + 1];
	 int j = 2;
	 for (int i = 0; i <= size; i++) {
		 numArray[i] = j;
		 if (j ==2) {
			 j++;
		 } else {
			 j += 2;
		 }
	 }
	 return numArray;
 }
 
 public static Double computePi_1(final int iterations ) {
	 Double pi = 0.0;
	 for(double i= 1; i<iterations; i++) {
		 pi += Math.pow(-1,i + 1)/((2*i) - 1);
	 }
	 return pi * 4;
 }
 
 public static Double computePi_2(final int iterations ) {
	  double pi = 0;
      double y = 1;

      for(int x=1; x < iterations; x+=2) {
         pi = pi + (y/x);
         y = -y;   
      }
      return 4 * pi;
   }
 
}
