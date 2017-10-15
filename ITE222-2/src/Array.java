import java.text.DecimalFormat;

public class Array {
	public static void main(String[] args) {
		DecimalFormat myFormatter = new DecimalFormat("###.##");
		double[] bob = {3.5, 2.75, 3.21, 3.8, 3.32};
		double[] tina = {2.5, 2.75, 2.34, 3.09, 3.2, 3.41, 3.21};
		
		double sum_bob = 0;
		double sum_tina = 0;
		
		
		for(int i = 0; i < bob.length; i++) {
			sum_bob += bob[i];
		}
		sum_bob /= bob.length;
		
		for(int i = 0; i < tina.length; i++) {
			sum_tina += tina[i];
		}
		sum_tina /= tina.length;
		
		System.out.println("Bob gpa " + myFormatter.format(sum_bob));
		System.out.println("Tina gpa " + myFormatter.format(sum_tina));
	}
}
