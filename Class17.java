package test;

class Namecard{
	private String name;
	private String address;
	private Phone data;
	/*constructor*/
	public Namecard(String na,String add,String s1,String s2) {
		name = na;
		address = add;
		data = new Phone(s1,s2) ;
		
	}
	class Phone{    /*  (a) */
		private String company;
		private String cell;
		private Phone(String s1,String s2) {       /*  (b) */
			company = s1; cell = s2;	
			}
		}
		/* show()*/
	public void show() {
		System.out.println("好友姓名"+this.name);
		System.out.println("好友地址"+this.address);
		System.out.println("公司電話"+data.company);
		System.out.println("手機號碼"+data.cell);
		}
	}



public class homework17 {

	public static void main(String[] args) {
		Namecard first = new Namecard("Andy","123City","2345-678","0922-300-112");
		
		first.show();
	}

}
