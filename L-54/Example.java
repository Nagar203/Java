import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Example extends Applet{
	Label l1,l2,l3;
	Button b;
	TextField f1,f2;
	public void init(){
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label();
		f1=new TextField();
		f2=new TextField();
		b=new Button("Add");
		setLayout(null);
		l1.setBounds(20,30,100,20);
		l2.setBounds(20,70,100,20);
		f1.setBounds(170,30,100,20);
		f2.setBounds(170,70,100,20);
		b.setBounds(120,140,60,30);
		l3.setBounds(20,200,100,20);
		add(l1);
		add(f1);
		add(l2);
		add(f2);
		add(b);
		add(l3);
		b.addActionListener(new MyEvent());
	}
	public class MyEvent implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int a,b,s;
			a=Integer.parseInt(f1.getText());
			b=Integer.parseInt(f2.getText());
			s=a+b;
			l3.setText("Sum is "+s);
		}
	}
}
