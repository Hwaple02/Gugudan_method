
public class GugudanMain {
	public static void main(String[] args) {
	System.out.println("구구단을 출력합니다");
	for(int i=2; i<10; i++)
	{
		int result[] = gugu_method.cal(i);
		System.out.println("\n" + i + "단을 출력합니다  .");	
		gugu_method.print(result);
	}
}
}
