import java.util.Scanner;
import java.util.Arrays;

public class PrimeNumbers {
	private int numberOfPrimes;
	private int[] primes;
	private static Scanner input = new Scanner(System.in);
	
	//constructor
		public PrimeNumbers() {
			super();
		}
		
	
		public int getNumberOfPrimes() {
			return numberOfPrimes;
		}
	
	
		public int[] getPrimes() {
			return primes;
		}

	//methods----------------------
	
	//gets number from user and stores it into numberOfPrime
	public void getNumberFromUser(){
		System.out.println("enter a value");
		this.numberOfPrimes = input.nextInt();
		this.primes = new int[numberOfPrimes];
	}
	
	
	public void printPrimes(){
		for(int i =0; i< primes.length;i++){
			System.out.println("number " + i + " is Prime");
		}
	}
	
	public void generatePrime(){
		for (int i=2;i<primes.length;i++){
			if(primes.length%i==0){
				System.out.println(i + " is not a prime Number");
			}else{
				System.out.println(i + " is a prime number");
			}
		}
	}
	
}
