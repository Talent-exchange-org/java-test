import org.junit.jupiter.api.Test;

public class StaticTest {

	@Test
	void name() {
		StaticClass clazz = new StaticClass();	// heap area에 주소값으로 생성
		StaticClass clazz2 = new StaticClass();
		System.out.println(clazz.nonStaticStr);

		assert clazz.nonStaticFuc().equals("world");
		clazz.nonStaticStr = "world2";
		assert clazz.nonStaticFuc().equals("world2");
		assert clazz2.nonStaticFuc().equals("world");

		System.out.println(StaticClass.staticStr); // 자바 실행시 static area에 존재
		assert StaticClass.staticFuc().equals("hello");
		StaticClass.staticStr = "hello2";
		assert StaticClass.staticFuc().equals("hello2");
	}
}
