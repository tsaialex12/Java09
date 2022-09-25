package CCount;

 class CCount {
	private static int cnt =0;
	
	public CCount()
	{
		count();
	}
	public static void count()
	{
		cnt++;
	}
	public static void setZero()
	{
		cnt=0;
	}
	public static void setValue(int n)
	{
		cnt=n;
	}
	public static void show()
	{
		System.out.print("cnt="+ cnt);
	}
}
class test05{
	
	public static void main(String[] args) {	
		
		CCount cnt1 = new CCount();
			CCount cnt2 = new CCount();
			CCount.show();
			
			CCount.setZero();
			System.out.println("using setZero()...");
			CCount.show();
			
			CCount.setValue(10);
			System.out.println("using setZero(10)...");
			CCount.show();
		
	}
}
