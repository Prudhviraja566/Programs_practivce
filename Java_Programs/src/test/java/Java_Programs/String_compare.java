package Java_Programs;

public class String_compare
{
      public static void main(String[] args) 
      {
    	  String s = "Hello All Good Morning";
    	  String s3 =  s.toLowerCase();
    	  
    	  String s2 = "abcde";
    	  String s4 ="bcdae";
    	  
    	  String s1 = s.replace(" ", "");
    	 
    	  System.out.println(s1); 
      }
}


class String_reveser
{
	public static void main(String[] args) 
	{
	   String s = "prudhviraj";
	   
	   String rev = "";
	   
	   for(int i = s.length()-1 ; i >= 0 ; i--)
	   {
		   char ch = s.charAt(i);
		   rev += ch;
	   }
	   
	   System.out.println(s);
	   System.out.println(rev);
	}
}


class String_Cap
{
	public static void main(String[] args) {
		
		String s = "my name is prudhvi";
		
		String [] str = s.split(" ");
		
		String finalRe= "";
		
		for(String word : str)
		{
			char [] ch = word.toCharArray();
			
			char ch1 = ch[0];
			
			String exp = String.valueOf(ch1).toUpperCase();		
		   
		    for (int i = 1; i < ch.length; i++) 
		    {
			     exp = exp + ch[i];
			} 
		    finalRe = finalRe + exp + " ";  
		}
		System.out.println(finalRe);
	}
}


class Occurance1
{
	public static void main(String[] args) {
		String str="manoj singh bata";
		str=str.toLowerCase();
		
		int[] freq=new int[str.length()];
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0') {
				freq[i]=count;
			}
		}
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='0' && ch[i]>0) {
				System.out.println(ch[i]+"=="+freq[i]);
			}
		}
		
	}
}