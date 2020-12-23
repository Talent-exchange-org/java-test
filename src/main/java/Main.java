
public class Main extends Object {
	String a = "10";

	public static void main(String[] args) {
		new Main().aaa();
	}

	/**
	 * Equals를 재정의 할때는 hashcode도 함께 재정의 해주어야 해요.
	 * 참조.
	 * https://velog.io/@sonypark/Java-equals-hascode-%EB%A9%94%EC%84%9C%EB%93%9C%EB%8A%94-%EC%96%B8%EC%A0%9C-%EC%9E%AC%EC%A0%95%EC%9D%98%ED%95%B4%EC%95%BC-%ED%95%A0%EA%B9%8C
	 */

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Main)) {
			throw new IllegalArgumentException();
		}
		return ((Main) obj).a.equals(this.a);
	}

	public void aaa() {
		System.out.println("asdasdasd");
	}
}
