import java.util.Scanner;

public class gugu_method {
	public static int[] cal(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++)
		{
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
		
		for(int i=2; i<10; i++)
		{
			int result[] = cal(i);
			System.out.println("\n" + i + "단을 출력합니다  .");	
			print(result);
		}

	}
	
}
