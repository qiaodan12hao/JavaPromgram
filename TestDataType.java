public class TestDataType{
    public static void main(String[] args){
	int a=10;
 	byte b=20;
        int a2=010;
	int a3=0xf;
        System.out.println(a);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(Integer.toBinaryString(a));//1010
        System.out.println(Integer.toOctalString(a));//1010
        System.out.println(Integer.toHexString(a));//1010
	long a7=3100000100l;
    }

}