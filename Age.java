import java.util.Scanner;

public class Age{
	public static void main(String[] args){
		System.out.printf("please input age:");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int a = 18, b = 0;
		if(age >= a){
			b = 1;
		}
		else b = 2;
		switch(b){
			case 1:
				System.out.printf("老阿姨好！");
				break;
			case 2:
				System.out.printf("小姐姐，方便加v吗？");
				break;
		}
	}
}