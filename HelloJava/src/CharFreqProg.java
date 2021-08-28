
public class CharFreqProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mayank";
		Integer[] charFreqArr=new Integer[256];
		for (int i=0;i<256;i++)
		{
			charFreqArr[i]=0;
		}
		for(int index=0;index<s1.length();index++)
		{
			char ch=s1.charAt(index);
			int i=ch;
			charFreqArr[i]+=1;
		}
		for (int i=0;i<256;i++)
		{
			if(charFreqArr[i]!=0)
			{
				System.out.println((char)i + ":" +charFreqArr[i]);
			}
		}
	}

}
