public class CharAt {

	static int hashCode(String  name) {
		int base=2;
		int hash = 0;
		for (int i = 0; i < name.length(); i++) {
			hash = (hash * base) + name.charAt(i);
		}

		hash = Math.abs(hash);
		hash %= 10;
		return hash;
	}

	public static void main(String[] args) {
		String name = "Walter E. Smith";
		int hash = hashCode(name);
		System.out.println(hash);
		// System.out.println((int) name.charAt(0));
		// System.out.println((int) name.charAt(1));
		// System.out.println((int) name.charAt(2));
		// System.out.println((int) name.charAt(3));
		// System.out.println((int) name.charAt(4));
		// System.out.println((int) name.charAt(5));

		// for (int i=0; i<name.length(); i++)
		// 	System.out.println((int) name.charAt(i));

		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(hashCode(name));

	}
}