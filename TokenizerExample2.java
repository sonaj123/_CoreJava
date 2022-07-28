import java.util.StringTokenizer;
class TokenizerExample2
{
	public static void main(String[] args)
	{
		StringTokenizer obj = new StringTokenizer("Tomorrow is Monday"," ");
		while(obj.hasMoreTokens())
		{
			System.out.println(obj.nextToken());
		}
	}
}