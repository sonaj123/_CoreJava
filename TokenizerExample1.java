import java.util.StringTokenizer;
class TokenizerExample1
{
	public static void main(String[] args)
	{
		StringTokenizer obj = new StringTokenizer("You are a woman"," ");
		while(obj.hasMoreTokens())
		{
			System.out.println(obj.nextToken());
		}
	}
}