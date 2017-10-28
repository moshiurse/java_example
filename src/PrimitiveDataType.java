	/**
	 * @author Moshiur Rahman
	 * @Date 14-10-2017
	 * @Topic Java Primitive Data Type
	 */
public class PrimitiveDataType {


	public static void main(String[] args) {
		
		//Integer Types
		byte low = 2;
		short speed = 32767;
		int midint = 567890922;
		long length = 939873458;
		long max= speed*length;
		
		System.out.println("byte value : "+low);
		System.out.println("short value : "+speed);
		System.out.println("int value : "+midint);
		System.out.println("long value : "+length);
		System.out.println("long* short value : "+max);
		
		//Floating point types
		double pi, r, a;
		r = 10.8; 
		pi = 3.1416;
		a = pi * r * r;
		System.out.println("Double-- Area of circle is " + a);
		
		//Char Type
		char ch1, ch2;
		ch1 = 65; // code for X
		ch2 = 'B';
		System.out.print("ch1 and ch2: ");
		System.out.println(ch1 + " " + ch2);
		
		//Boolean Types
		
		boolean b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		
	}

}
