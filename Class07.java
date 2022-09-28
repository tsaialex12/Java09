class ANS{
    int ans1;
    int ans2;
    void power(int x,int n){
        ans1=x;
        ans2=n;
    }
    void ans(){
        System.out.println(ans1);
        System.out.println(ans2);
    }
}
public class Class07{
    public static void main(String[] args) {
        ANS aa=new ANS();
        aa.ans1=(int)Math.pow(2,5);
        aa.ans2=(int)Math.pow(3,2);
        aa.ans();
    }
}
