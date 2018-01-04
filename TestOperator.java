public class TestOperator{
	public static void main(String[] args){
	      /*double d=10%3;
          System.out.println(d);
          int a = 3;
  	      int b = a++;//执行完后，b=3,先给b赋值，再自增；
	      int c = ++a;//执行完后，c=5,先自增，再赋值；
	      int e =++a+b+++c;//6+3+6+3
		  System.out.println(a);
	      System.out.println(b);
	      System.out.println(c);
		  System.out.println(e);*/
		  /*int a = 3*2*2;
		  int b = 3<<2;
		  int c = 6>>2;
		  System.out.println(a);
		  System.out.println(b);
 		  System.out.println(c);*/
		  int m=-15;
	      int n=4;
	      System.out.println(m&n);
	      System.out.println(m|n);
	      System.out.println(~m);
 	      System.out.println(m^n);
//		  0000 1000      1000 1111     
//		  0000 0100      0000 1110
	  /*    boolean c = 1>2&&2>(3/0);
      	      System.out.println(c);
          int m=8;
	      int n=4;
	      System.out.println(m&n);
	      System.out.println(m|n);
	      System.out.println(~m);
 	      System.out.println(m^n);
              int a=3;
	      int b=5;
              boolean str;
              if(a<b){
		str=true;
              }else{
	        str=false;
	      }
              str=(a<b)?true:false;
	      System.out.println(str);*/
	}
}