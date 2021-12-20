// recursion -  calling function again and again
import java.util.*;
public class ManeuveringCave
{
    static int maneuvering_cave(int m, int n)
    {
        if (m == 1 || n == 1)
            return 1;
            
        return maneuvering_cave(m - 1, n) + maneuvering_cave(m, n - 1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
		System.out.println(maneuvering_cave(m, n));
	}
}
