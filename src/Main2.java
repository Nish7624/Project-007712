
public class Main2 {
	
	public static void main(String[] args) {
		
		String s = "Nishant Chendulkar";
		String [] a = s.split(" ");
		
		String r = "";
		String t = " ";
		
		for (int i = 0 ; i < a.length ; i++)
		{
			String q = a[i];
			for (int j = q.length()-1 ; j >= 0 ; j--)
			{
				r = r + q.charAt(j);
			}
			r = r.concat(t);
		}
		System.out.println(r);
	}

}
