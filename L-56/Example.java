import java.util.*;
import java.awt.*;
import java.applet.Applet;
/*<applet width="200" height="100" code="Example"></applet>*/
public class Example extends Applet implements Runnable{
	Thread t,t1;
	public void start(){
		t=new Thread(this);
		t.start();
	}
	public void run(){
		t1=Thread.currentThread();
	
	while(t1==t){
			repaint();
		try{
			t1.sleep(1000);
		}
		catch(InterruptedException a){}
		}
	}
	public void paint(Graphics g){
		Calendar cal=new GregorianCalendar();
		String hour=String.valueOf(cal.get(Calendar.HOUR));
		String minute=String.valueOf(cal.get(Calendar.MINUTE));
		String second=String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(hour+":"+minute+":"+second,20,30);
	}
	
	
}