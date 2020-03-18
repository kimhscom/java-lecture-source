package happy.com;

public class Static_Main {

	public static void main(String[] args) {
		//TODO 1. Static메소드에서 satatic 메소드를 연결
		print();
		//TODO 2.  static메소드에서 non static 메소드 연결
		//              메모리에 미리 할당되어 있는 static은
		//              어느시점에 메모리에 할당 되는지 모르는 맴버는 연결 불가
		//              그래서 new 해주면 가능
//		make();
		
		/*Static_Main sm = new Static_Main();
		sm.make();
		sm.print();*/
		
	}
		public void make() {
			
		}
		
		public static void print() {
			
		}
		

	}
