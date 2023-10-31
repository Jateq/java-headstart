package uldana;

public class Love {
	private String name;
	private boolean comfort;
	private int age;
	
	public Love() {
		comfort = true;
	}
	public Love(String s) {
		this();
		name = s;
	}
	public Love(int a, String s) {
		this(s);
		age = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		age = a;
	}
}


