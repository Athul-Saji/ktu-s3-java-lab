/*****************************************************************
 * Author        :        Athul Saji
 * Date          :        29/11/2021
 * Version       :        1.0
 * Description   :        Palindrom 
 * 
 ****************************************************************/
import java.util.Scanner;
public class Experiment 1 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String str,rev="";int i;
		System.out.println("Enter string");
		str=in.next();
		System.out.println("The entered string is: "+str);
		int l=str.length();
		for( i=l-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("The string is palindrome");
		}
		else
			System.out.println("The string is not a palindrome ");
	}
}
