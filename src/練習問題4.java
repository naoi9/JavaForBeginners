
//4-1
//public class 練習問題4 extends MyFrame{
//	public void run() {
//		setColor(0,128,0);
//		for(int x=30 ; x<=170 ; x+=20){
//			System.out.println(x);
//			fillRect(x,80+x,10,100);
//		}
//	}
//	
//
//}

//4-2
//public class 練習問題4 extends MyFrame{
//	public void run() {
//		setColor(0,128,0);
//		for(int x=30 ; x<=170 ; x+=20){
//			System.out.println(x);
//			fillRect(80+x,80,10,10+x);
//		}
//	}
//	
//
//}
//4-3
public class 練習問題4 extends MyFrame{
	public void run() {
		int y = 0;
		for(int x=30 ; x<=170 ; x+=20){
			System.out.println(x);
			setColor(0+y,0+y,0+y);
			fillRect(x,80,10,100);
			y = y + 25;
		}
	}
	

}