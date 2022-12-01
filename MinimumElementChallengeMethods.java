import java.util.Scanner;

public class MinimumElementChallengeMethods {

	private int minValue;
	private int temp;
	private int num;
	int[] arrayNum = new int[5];
	public Scanner sc=new Scanner(System.in);
	
	
	public int[] readIntegers(int count) {
		System.out.println("Please type "+count+" Integers: ");
		for(int i=0;i<count;i++) {
			this.num=sc.nextInt();
			this.arrayNum[i]=num;
		}
		return arrayNum;
	}
	
	public int findMin(int[] array) {
		temp=arrayNum[0];
		for(int i=0;i<arrayNum.length;i++) {
			if(temp>arrayNum[i]) {
				temp=arrayNum[i];
			}
			
		}
		this.minValue=temp;
		
		return minValue;
		
	}
	
}
