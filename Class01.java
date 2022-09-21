package homework;

 class test {
	int width;
	int height;
	
	public test(int w ,int h) {
		width=w;height=h;
		
	}
	
	public test() {
		this(10,8);
	}
	public void show() {
		System.out.print("=1"+width);
		System.out.print("=8"+height);
	}
	
	

}
class CRectangle{
	
	public static void main(String[] args) {	
		
		test width1 = new test();
			width1.show();
		test width2 = new test();
			width2.show();
	}
}
