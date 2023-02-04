import java.util.scanner;
class arthemeticoperations
{
	public static void main(string args[])
	{
		int a,b;
		scanner sc=new scanner(system.in);
		a=sc.nextint();
		b=sc.nextint();
		
		system.out.println(a+b);
		system.out.println(a-b);
		system.out.println(a*b);
		system.out.println(a/b);

		sc.close();
	}
}