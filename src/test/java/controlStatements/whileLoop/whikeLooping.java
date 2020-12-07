package controlStatements.whileLoop;

public class whikeLooping {

	public void forLoopingExpampleOfArray() {
		int ar[] = { 10, 20, 30, 40 };

		int i = 0;
		while (i < ar.length) {
			System.out.println(ar[i]);
			i++;
		}
		
		//From above while loop i's value is increasing
		while(i<=10) {
			System.out.println(i);
			i++;
		}

	}

	public static void main(String[] args) {

		whikeLooping c = new whikeLooping();
		c.forLoopingExpampleOfArray();

	}

}
