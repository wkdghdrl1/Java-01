// class나 변수의 이름을 지을 때
// 흔히 사용되는 단어(사전에 있는 단어)를 사용하고자 할 때는 
// 가급적 두 개 이상의 단어를 조합하거나
// 숫자 등을 뒤에 붙여두는 것이 좋다.
// 혹시 모를 이유없는 오류를 막을 수 있다. 
public class Int_01 {

	public static void main(String[] args) {
			
		int num = 100;
		int intNum = 10;
		String strName = "Hong";
		
		boolean bYes = true;
		boolean bNo = false;
		
		intNum = 30 + 40;
		strName = "Lee Mong Young";
		
		bYes = false;
		bNo = true;
		
		// 1. eq(=) 오른쪽에 있는 intNum에 담겨있는 70을 
		//     연산장치로 가져온다.
		// 2. 어딘가에 저장되어 있을 40을
		//     연산장치로 가져온다.
		// 3. 두 값을 덧셈 연산을 수행한다.
		// 4. 덧셈된 결과(110)를
		// 5. =의 왼쪽에 있는 intNum에 저장한다.
		intNum = intNum + 40;
		
		intNum = intNum + 1;
		intNum = intNum + 1;
		intNum = intNum + 1;
		intNum = intNum + 1;
		intNum = intNum + 1;
		intNum = intNum + 1;
		intNum = intNum + 1;
		intNum = intNum + 1;
		
		
		intNum = 1;
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		intNum = intNum + 1;
		System.out.println("2 x " + intNum + " = " + 2 * intNum);
		
	}

}
