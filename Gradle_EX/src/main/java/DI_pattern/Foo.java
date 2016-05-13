package DI_pattern;

public class Foo {
	private Bar bar;
	private Baz baz;
	public void start(){
		System.out.println("초기화 메서드 : start()");
	}
	public void stop(){
		System.out.println("소멸메서드 : stop()");
	}
	public void doBar(){
		Bar bar = getBar();
		bar.doIt();
	}
	
	//lookup method
	public Bar getBar(){
		return null;
	}
	
	public Foo(){}
	public Foo(Bar bar,Baz baz){
		this.bar = bar;
		this.baz = baz;
	}
	Foo(String s1, String s2){
		System.out.println("String, String :: "+s1+ ", " + s2);
	}
	Foo(String s1, int i){
		System.out.println("String, int :: "+s1+ ", " + i);
	}
	public void setBar(Bar bar){
		this.bar = bar;
	}
	public void setBaz(Baz baz) {
		this.baz = baz;
	}
	public void test(){
		System.out.println("Foo 클래스 안에 test() 실행");
	}
}
