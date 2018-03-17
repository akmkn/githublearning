package demo4;

public class EqualsExample {
	private int id;
	private String name;

	public EqualsExample(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name= " + name + "]";		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsExample example1 = new EqualsExample (1,"ram");
		EqualsExample example2 = new EqualsExample (1,"ram");
		//to compare two objects having the same value
		System.out.println(example1.equals(example2));
		System.out.println(example1==example2);
		
		String text1 = "Hello";
		String text2 = "Hello";
		System.out.println(text1 == text2);
		
		//with class objects or with strings using equals. if you got same object.
		
	}

}
