
public class DefaultFormatter implements NumberFormatter
{
	public String format(int p)
	{
		Integer a = new Integer(p);
		String s = a.toString();
		String b = "";
		for(int i = 1; i < s.length() + 1; i++)
		{
			 b += s.charAt(s.length()-i);
			 if(i % 3 == 0  && i != s.length())
			 {
				 b += ",";
			 }
		}
		String c = "";
		{
			for(int i = 1; i < b.length() + 1; i++)
			{
				c += b.charAt(b.length()-i);
			}
		}
		return c;
		
	}
}
