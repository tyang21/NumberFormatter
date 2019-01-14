
public class BaseTwoFormatter 
{
	public String format(int p)
	{
		String s = "";
		while(p/2 != 0)
		{
			s += p%2;
			p = p/2;
		}
		s += p%2;
		String c = "";
		{
			for(int i = 1; i < s.length() + 1; i++)
			{
				c += s.charAt(s.length()-i);
			}
		}
		return c;
	}
}
