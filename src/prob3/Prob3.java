package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		char[] ret=new char[str.length()];
		for(int i=0;i<str.length();i++){
			ret[i]=str.charAt(str.length()-i-1);
		}
				
		return ret;
	}
	
	public static void printCharArray(char[] array){
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println("");
			
	}
}
