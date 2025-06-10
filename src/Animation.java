
//public class Animation extends MyFrame{
//	public void run() {
//		int x=30;
//		int y=100;
//		while(true)
//		{
//		while(x<=170){
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=5;
//			sleep(0.01);
//			
//		}
//		while(x>=30){
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x-=5;
//			sleep(0.01);
//			
//		}
//		}
//
//}
////5-1
//public class Animation extends MyFrame{
//	public void run() {
//		int x=30;
//		int y=100;
//		while(y>=30){
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			y-=5;
//			sleep(0.01);
//			
//		}
//		while(x<=170){
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=5;
//			sleep(0.01);
//			
//		}
//		}
//
//}
//5-2
public class Animation extends MyFrame {
	public void run() {
		int x = 30;
		int y = 100;
		while (x <= 300 & y <= 300) {
			clear();
			;
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x += 5;
			y += 5;
			sleep(0.01);

		}
		while (x >= 30) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x -= 5;
			sleep(0.01);

		}
		while (x <= 300 & y >= 30) {
			clear();
			setColor(0, 128, 0);
			fillRect(x, y, 10, 100);
			x += 5;
			y -= 5;
			sleep(0.01);

		}

	}
}
//5-3
//public class Animation extends MyFrame{
//	public void run() {
//		int x=30;
//		int y=100;
//		for(int i=1;i<=3;i=i+1)
//		{
//		while(x<=170){
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x+=5;
//			sleep(0.01);
//			
//		}
//		while(x>=30){
//			clear();
//			setColor(0,128,0);
//			fillRect(x,y,10,100);
//			x-=5;
//			sleep(0.01);
//			
//		}
//		}
//     }
//}
