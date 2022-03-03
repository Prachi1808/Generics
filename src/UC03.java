
public class UC03
{
	

	public static Integer findMax(Integer Apple, Integer Peach, Integer Banana) 
	 {
		        Integer max = Apple;
		        if (Peach.compareTo(max) > 0) {
		            max = Peach;
		        }
		        if (Banana.compareTo(max) > 0) {
		            max = Banana;
		        }
		        System.out.printf("Max values of %s %s %s is %s \n", Apple, Peach,Banana, max);
		        return max;
	 }
}