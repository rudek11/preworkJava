package pl.coderslab.ckontrolaprzeplywu;

public class Main05 {

	public static void main(String[] args) {
int resultFor = 0;
int resultWhile = 0;
		for (int i = 0; i <= 10; i++) {
			resultFor += i; // = resultFor + i

		}
		System.out.println(resultFor);
		int y = 0;
		int z = 10;
		while (y<=z){
			resultWhile += y;
			y++;
		}
		System.out.println(resultWhile);
	}

}
