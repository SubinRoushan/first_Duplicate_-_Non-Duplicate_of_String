public class Main
{
	public static void main(String[] args)
	{
		String[] s={"A","B","C","D"};
		//int count=0;
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			
			for(int j=i+1;j<s.length;j++)
			{				
				if(s[i]==s[j])
				{
					System.out.println("1St Dupicate Character  "+str);
					return;
				
				}	
				
				
			}
		}
		System.out.println("Not found");
	}
}