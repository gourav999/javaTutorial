package StaticVariable;

public class ProgramOfCounterWithStaticVariable {
static int count=0;//will get memory only once and retain its value

	ProgramOfCounterWithStaticVariable(){
		count++;
		System.out.println(count);
	}

public static void main (String[]args) {
	ProgramOfCounterWithStaticVariable PV=new ProgramOfCounterWithStaticVariable();
	ProgramOfCounterWithStaticVariable PV1=new ProgramOfCounterWithStaticVariable();
	ProgramOfCounterWithStaticVariable PV2=new ProgramOfCounterWithStaticVariable();
	
}
	
}
