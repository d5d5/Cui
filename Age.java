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
				System.out.printf("�ϰ��̺ã�");
				break;
			case 2:
				System.out.printf("С��㣬�����v��");
				break;
		}
	}
}