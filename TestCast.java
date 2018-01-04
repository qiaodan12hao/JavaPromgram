//测试自动转型和强制转型
public class TestCast{
	public static void main(String[] args){
	     byte b=123;
             char c=128;
             System.out.println(b);
             System.out.println(c);
             int i=15;
             char c1=(char)i;
             System.out.println(c1);
             int i1=2;
	     long l1=3;
	     int i2=(int)(i1+l1);
	     System.out.println(i2);
	     int money = 1000000000;
             int year =20;
	     long total=(long)money*year;
  	     System.out.println(total);
	     long times = 70L*60*24*365;
	     System.out.println(times);
	}
}