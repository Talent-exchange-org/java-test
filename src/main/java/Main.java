
public class 	Main extends Object {
	String a = "10";

	public static void main(String[] args) {
		System.out.println("11");
		new Main().aaa();
	}

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
