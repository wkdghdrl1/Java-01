
public class Booelean_06 {

	public static void main(String[] args) {
			
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		
		boolean bYes = true;
		
		// && �� �� �̻��� �񱳿������� ��� true�ΰ��� �Ǵ�
		// AND ����
		bYes = num1 == num2 && num3 == num4; // f and f : f
		bYes = num1 == num1 && num3 == num4; // t and f : f
		bYes = num1 == num2 && num3 == num3; // f and t : f
		bYes = num2 == num2 && num3 == num3; // t and t : t
		
		// || �� �� �̻��� �񱳿������� 1���� true�ΰ��� �Ǵ�
		// OR ����
		bYes = num1 == num2 || num3 == num4; // f or f : f
		bYes = num1 == num1 || num3 == num4; // t or f : t
		bYes = num1 == num2 || num3 == num3; // f or t : t
		bYes = num1 == num1 || num3 == num3; // t or t : t
		
		// (false or true) and false >> true and false
		bYes = (num1 == num2 || num3 == num3) && num4 == num3;
		System.out.println(bYes);
	}

}