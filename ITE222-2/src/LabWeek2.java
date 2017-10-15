import java.util.*;
import java.text.DecimalFormat;

public class LabWeek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat myFormatter = new DecimalFormat("###.##");
		Scanner lab2 = new Scanner(System.in);
		int day = 0, above = 0;
		double[] temp = new double[20]; 
		double ag = 0.0;
		
		System.out.print("How many day's temperatures? ");
		day = lab2.nextInt();
		
		for(int i = 1; i <= day; i++) {
			System.out.print("Day's " + i + "'s temp: ");
			temp[i] = lab2.nextDouble();
			ag += temp[i];
		}
		ag/=day;	
		System.out.println("Average temp = " + myFormatter.format(ag));
		
		for(int j = 1; j <= day; j++) {
		if(temp[j] > ag) {
			above++;
		}
		}
		System.out.println("Therem are " + above + " days above average");
	}

}
