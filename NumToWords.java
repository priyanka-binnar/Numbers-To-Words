package s.jsp.com;
import java.lang.String;
import java.util.Scanner;
public class NumToWords {

	
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		int n=sc.nextInt();;
		numtoWords(n/10000000, "Crore");
		numtoWords((n/100000)%100," Lacs");
		
		numtoWords((n/1000)%100," thousand");
		numtoWords((n/100)%10," hundred");
		numtoWords(n%100," ");
		
	}
	 
	 public static void numtoWords(int n, String s) {
		 String ones[]= {"", "One", "Two"," Three", "Four", "Five"," Six"," Seven"," Eight", "Nine",
				 " Ten"," Eleven", "Twelve", "Thirteen", "Fourteen"," Fifteen"," Sixteen", 
				 "Seventeen"," Eighteen"," Nineteen"};
		 
		 String tens[]= {"","Ten", "Twenty", "Thirty"," Fourty"," Fifty",
				 " Sixty","Seventy","Eighty","Ninety" };
	 
	 
	 if(n==0) {
		 return ;
	 }
	 
	 if(n<20) {
		 System.out.print(ones[n]+" ");
		 
	 }else {
		 System.out.print(tens[n/10]+" "+ones[n%10]+" ");
	 }
	 System.out.print(s+" ");
	 }
	 
	 
}
