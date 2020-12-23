class StaticClass {
	String nonStaticStr = "world";
	static String staticStr = "hello";
	static final String aa = "aa";	// 상수

	public StaticClass() {
	}

	public StaticClass(String nonStaticStr) {
		this.nonStaticStr = nonStaticStr;
	}

	public static String staticFuc() {
		return staticStr;
	}

	public String nonStaticFuc() {
		return nonStaticStr;
	}

	static class InnerClass {

	}
}
