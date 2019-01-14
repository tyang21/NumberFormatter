
public class Test {

	public static void main(String[] args) 
	{
		DefaultFormatter d = new DefaultFormatter();
		DecimalFormatter f = new DecimalFormatter();
		int i = 10000000;
		System.out.println(d.format(i));
		System.out.println(f.format(i));
	}

}
