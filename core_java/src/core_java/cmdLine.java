package core_java;

public class cmdLine {
	public static void main(String args[]) {
		/*for(String arg:args)
		{
			System.out.println(arg);
		}
		*/
		int sum=0;
		for(String arg:args)
		{
			sum+=Integer.parseInt(arg);
		}
		System.out.println(sum);

	}
	

}
