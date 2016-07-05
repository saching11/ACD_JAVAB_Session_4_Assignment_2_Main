package StringReversePackage;

public class StringReverse {
	private String strRev = "";
	public String getReverse(String str) {
		for(int i=str.length()-1; i>=0; i--) {
			strRev = strRev+str.charAt(i);
		}
		return strRev;
	}
}
