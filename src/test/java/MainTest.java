import org.junit.jupiter.api.Test;

public class MainTest {
	int num1 = 1;
	int num2 = num1;
	String str1 = "1"; // 상수로 선언을해서 메모리에 올라가 있는거구요.
	String str2 = "1";

	/**
	 *  call by value = str1 -> 값
	 * 	call by reference = str3 -> 메모리 -> 값
	 */
	@Test
	void name() {
		assert (num1 == num2);
		num1 = 3;
		assert (num1 != num2);

		assert (str1 == str2);
		str1 = "3";
		assert (str1 != str2);

		String str3 = new String("1");	// 객체로 만든거다.
		String str4 = new String("1");

		assert (str3 != str4);

		Main main1 = new Main(); // -> a == 10
		Main main2 = new Main(); // -> a == 10
		assert (main1 != main2);

		boolean bool = "1".equals("1");	// 객체가 아니라 상수이기 때문에.
		assert(bool);

		assert (main1 != main2); // false
		assert (main1.equals(main2)); // 기본적으로 false지만, equals 재정의 해서 true
	}

	@Test
	void normalTest() {
		NormalClass normalClass = new NormalClass();
		assert normalClass.str.equals("hello");
	}

	@Test
	void staticTest() {
		assert StaticClass.staticStr.equals("hello");
	}

	@Test
	void name2() {
		NormalClass normalClass1 = new NormalClass();
		NormalClass normalClass2 = new NormalClass();

		assert(normalClass1.str == normalClass2.str);
		normalClass1.str = "world";
		assert(normalClass1.str != normalClass2.str);

		String str1 = StaticClass.staticStr;
		String str2 = StaticClass.staticStr;

		assert (str1 == str2);
		str1 = "world";
		assert (str1 != str2);
	}

	@Test
	void name3() {
		new Main().aaa();
	}
}
