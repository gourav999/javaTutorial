package StaticVariable;

public class ProgramOfCounterWithoutStaticVariable {

	int count=0;//will get memory each time when the instance is created
	public void increment() {
		count++;
		System.out.println(count);
	}
	
	public static void main (String[]args) {
		ProgramOfCounterWithoutStaticVariable pCWV=new ProgramOfCounterWithoutStaticVariable();
		pCWV.increment();
		
		ProgramOfCounterWithoutStaticVariable pCWV1=new ProgramOfCounterWithoutStaticVariable();
		pCWV1.increment();
		
		ProgramOfCounterWithoutStaticVariable pCWV2=new ProgramOfCounterWithoutStaticVariable();
		pCWV2.increment();
	}
	
}
