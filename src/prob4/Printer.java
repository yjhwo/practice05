package prob4;

public class Printer {
	
	public Printer() { }
	
	// 나
//	public void println(Object obj){
//		System.out.println(obj.toString());
//	}
	
	// 선생님 -2
	public <T> void println(T t){
		System.out.println(t);
	}
	
	// 개수가 정해지지 않을 때
	public void printObjects( Object...objects){
		for(Object object : objects){
			System.out.print(object+" ");
		}
	}
	
// 선생님  오버로딩
//	public void println(int value){
//		System.out.println(value);
//	}
//	public void println(boolean value){
//		System.out.println(value);
//	}
//	public void println(double value){
//		System.out.println(value);
//	}
//	public void println(String value){
//		System.out.println(value);
//	}
}
