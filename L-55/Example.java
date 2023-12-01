import java.applet.Applet;
import java.awt.*;
	/*<applet code="Example" width="300" height="220">
		<param name="name" value="Chandra Mohan Nagar"/>
	</applet>
	*/
public class Example extends Applet{
	private String defaultMessage="Hello";
	public void paint(Graphics g){
		String s1=getParameter("name");
		if(s1==null){
			s1=defaultMessage;
		}
		g.drawString(s1,30,30);
		
	}
}
