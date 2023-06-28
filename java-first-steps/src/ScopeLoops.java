
public class ScopeLoops {

	public static void main(String[] args) {
		int count = 1;
		int resultset = 0;

		while (count <= 10) {
			resultset = resultset + count;
			System.out.println(count);
			count++;
		}
		System.out.print(resultset);
		
	}

}
