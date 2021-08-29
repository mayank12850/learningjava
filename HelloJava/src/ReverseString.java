
public class ReverseString 
{
	public static void main(String[] args) {
		String s="abcd";
		StringBuilder sb=new StringBuilder();
		for(int i=s.length()-1;i>=0;i--)
		{
			Character c=s.charAt(i);
			sb.append(c);			
		}
		System.out.println(sb.toString());
	}
}