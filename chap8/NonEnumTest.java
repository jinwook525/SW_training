package chap8;

//class Status{
//	public static final int READY = 1;
//	public static final int SEND = 2;
//	public static final int COMPLETE = 3;
//	public static final int CLOSE = 4;
enum Status{
	READY,SEND,COMPLETE,CLOSE
}
public class NonEnumTest {
	public static void main(String[] args) {
		Status work = null;
//		int work = 0;
		int n = 2;
		
		switch(n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work= Status.SEND;
			break;
		case 3:
			work=Status.COMPLETE;
			break;
		case 4:
			work=Status.CLOSE;
			break;
		}
		System.out.println("현재 작업 상태 :"+work);
	}
}
