public class Cui{
	public static void main(String[] args){
		int i = 5;
		for (int j = 1; j <= i; j++){
			int z = (2*j) - 1;
			int x = 0;
			while(x != (i-j))
			{
				System.out.println(" ");
				x++;
			}
			while(z != 0){
				System.out.println("$");
				z--;
			}
			System.out.println("\n");
		}
	}
}