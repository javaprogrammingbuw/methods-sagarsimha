import java.util.Scanner;


public class Prime {

	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.

	public static void main(String[] args) {

		System.out.println("Please enter a POSITIVE integer number");
		Scanner scan = new Scanner(System.in);
		int number_ = scan.nextInt();
		if(isPrime(number_)){
			System.out.println("The number is Prime");
		}
		else{
			System.out.println("The number is NOT Prime");
		}
		System.out.println("The smaller of the first-doublette from (including) "+ number_ + " is " + findDoublette(number_)) ;
	}

		// A prime is a number that has only two factors, 1 and the number itself
	public static boolean isPrime(int number){

		if((number ==1) || (number ==2)){
			return true;
		}
		else{
			if(!checkprime(number) || number==0){
				return false;
			}
			else{
				return true;	
			}
		}
	}

	public static boolean checkprime(int n){
		boolean isprime_=true;
		for(int i=2; i<n; i++){
			if(n%i == 0){
				isprime_ = false;
			}
		}
		return isprime_;

	}

	public static int findDoublette(int number){
		for(int i=number; i<=Integer.MAX_VALUE-2; i++){
			if(isPrime(i)){
				if( isPrime(i+2) ){
					return i;
				}
			}
		}
		return 0;			

	}

	
}
