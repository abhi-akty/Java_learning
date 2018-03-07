class Test
{
	public static void main(String s[])
	{
		int sum[]=new int[s.length];
		for(int i=0; i<(s.length); i++)
		{
			sum[i]=Integer.parseInt(s[i]);
		}
		for(int i=0; i<(sum.length); i++)
		{
			System.out.println("No. of even entities are : "+sum[i]);
		//System.out.println("No. of odd entities are : "+odd);			
		}
	}
}