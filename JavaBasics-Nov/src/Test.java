
public class Test {
	String greet;
	
	public void test(Test t, int i){
		t.greet="helloworld";
		i=5;
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.greet = "hello";
		int i =2;
		
		System.out.println("befor:"+t.greet+":int:"+i);
		t.test(t, i);
		System.out.println("after:"+t.greet+":int:"+i);
	}

}
