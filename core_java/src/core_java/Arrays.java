package core_java;

public class Arrays {
	public static void main(String args[]) {
		int sort[]= {3,5,2,1,4};
		for(int i=0;i<sort.length;i++)
		{
			for(int j=i+1;j<sort.length;j++)
			{
				int temp=0;
				if(sort[i]>sort[j])
				{
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
				}
			}
			System.out.println(sort[i]);
		}
	}

}
