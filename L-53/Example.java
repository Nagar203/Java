import java.applet.Applet;
import java.awt.*;
public class Example extends Applet{
	Label l1,l2;
	Button b;
	TextField f1,f2;
	public void init(){
		l1=new Label("First Number");
		l2=new Label("Second Number");
		f1=new TextField();
		f2=new TextField();
		b=new Button("Add");
		setLayout(null);
		l1.setBounds(20,30,100,20);
		l2.setBounds(20,70,100,20);
		f1.setBounds(170,30,100,20);
		f2.setBounds(170,70,100,20);
		b.setBounds(120,140,60,40);
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(b);
	}
}
