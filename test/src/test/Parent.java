package test;

public class Parent {

	private String testConstructorStr = "";
	
	public Parent() {
		// TODO Auto-generated constructor stub
		testConstructorStr = "I am a variable in the parent constructor";
	}

	protected void testParent() {
		System.out.println("I am a parent method which has the "
				+ "following variable from constructor:" + testConstructorStr);
	}

}
