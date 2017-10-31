package initBlockTest;

public class InitTest {
	private byte bnum= 1;
	private short snum=10;
	private int inum=100;
	private long lnum=100000;
	private float fnum=0.01f;
	private double dnum=0.0000001;
	private boolean isTrue=true;
	private char ch=97;
	private String str="안녕하세요";
	
	{
		bnum = 2;
		snum = 20;
		inum =200;
		lnum=200000;
		fnum=0.02f;
		dnum=0.0000002;
		isTrue =false;
		ch = 98;
		str = "메롱";
	}
	
	public InitTest() {
		
	}
	public InitTest(byte changeBnum, short changeSnum, int changeInum, long changeLnum,
			float changeFnum,double changeDnum,boolean changeIsTrue, char changeCh,String changeStr) {
		bnum = changeBnum;
		snum = changeSnum;
		inum =changeInum;
		lnum=changeLnum;
		fnum=changeFnum;
		dnum=changeDnum;
		isTrue =changeIsTrue;
		ch = changeCh;
		str = changeStr;
	}
	
	public void printMethod() {
		System.out.println(bnum);
		System.out.println(snum);
		System.out.println(inum);
		System.out.println(lnum);
		System.out.println(fnum);
		System.out.println(dnum);
		System.out.println(isTrue);
		System.out.println(ch);
		System.out.println(str);
	}
	
}
