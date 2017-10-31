package logic.home.model;

public class PrimitiveTypeSample {

	public void typeSize() {
		System.out.println();
		System.out.println("byte 자료형 크기 : " + Byte.SIZE / 8 + "byte");
		System.out.println("short 자료형 크기 : " + Short.SIZE / 8 + "byte");
		System.out.println("int 자료형 크기 : " + Integer.SIZE / 8 + "byte");
		System.out.println("long 자료형 크기 : " + Long.SIZE / 8 + "byte");
		System.out.println("float 자료형 크기 : " + Float.SIZE / 8 + "byte");
		System.out.println("double 자료형 크기 : " + Double.SIZE / 8 + "byte");
		System.out.println("char 자료형 크기 : " + Character.SIZE / 8 + "byte");
		System.out.println();

	}

	public void minMaxValue() {
		//래퍼 클래스 (Wrapper Class)
		System.out.println();
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE + " byte 최대값 : " +Byte.MAX_VALUE);
		System.out.println("short 최소값 : " + Short.MIN_VALUE + " short 최대값 : " +Short.MAX_VALUE);
		System.out.println("int 최소값 : " + Integer.MIN_VALUE + " int 최대값 : " +Integer.MAX_VALUE);
		System.out.println("long 최소값 : " + Long.MIN_VALUE + " long 최대값 : " +Long.MAX_VALUE);
		System.out.println("float 최소값 : " + Float.MIN_VALUE + " float 최대값 : " +Float.MAX_VALUE);
		System.out.println("double 최소값 : " + Double.MIN_VALUE + " double 최대값 : " +Double.MAX_VALUE);
		System.out.println("char 최소값 : " + Character.MIN_VALUE + " char 최대값 : " +Character.MAX_VALUE);
		System.out.println();
	}

	public void bitSize() {
		System.out.println();
		System.out.println("byte 자료형 크기 : " + Byte.SIZE  + "개");
		System.out.println("short 자료형 크기 : " + Short.SIZE  + "개");
		System.out.println("int 자료형 크기 : " + Integer.SIZE  + "개");
		System.out.println("long 자료형 크기 : " + Long.SIZE + "개");
		System.out.println("float 자료형 크기 : " + Float.SIZE + "개");
		System.out.println("double 자료형 크기 : " + Double.SIZE  + "개");
		System.out.println("char 자료형 크기 : " + Character.SIZE  + "개");
		System.out.println();
		
	}
}
