package StringReversePackage;
import java.util.Scanner;
import StringReversePackage.StringReverse;

public class TestStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringReverse sr = new StringReverse();
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Reverse of String is ");
		System.out.println(sr.getReverse(str));
	}

}
