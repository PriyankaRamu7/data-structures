package hackerearth.coding;

public class example {

	public static void main(String[] args) {
		String s = "123" ;
		char find = '1';
		long count = s.chars().filter(p -> p==(int)find).count();
		System.out.println(count);
	}
	
}
