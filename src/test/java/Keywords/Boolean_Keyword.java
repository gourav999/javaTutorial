//Note: By default boolean value will be false.
package Keywords;

public class Boolean_Keyword {
	boolean x;
	public void validationValues(){
	{
		if (x) {
			System.out.println("value is true");
		}
		if (!x) {
			System.out.println("value is false");
		}
	}}
	public static void main(String[] args) { 
		Boolean_Keyword BK=new Boolean_Keyword();
		BK.validationValues();
		
	}
}
