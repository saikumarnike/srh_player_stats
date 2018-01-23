import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Team" width=700 height=700>
<param name="img" value="srh.png">
<param name="yuvi" value="yuvi.png">
<param name="warner" value="warner.png">
<param name="dhawan" value="dhawan.png">
<param name="henry" value="henry.jpg">
<param name="ben" value="ben.png">
<param name="ojha" value="ojha.png">
<param name="hooda" value="hooda.png">
<param name="bipul" value="bipul.jpg">
<param name="bhuvi" value="bhuvi.jpg">
<param name="nehra" value="nehra.png">
<param name="rashid" value="rashid.jpg">
</applet>*/
public class Team extends Applet implements ActionListener
{
	String country,role,hs,bf;
	TextField t1,t2,t3,t4,t5;
	Label l1,l2,l3,l4,l5;
	Button search;
	Image img,yuvi,warner,dhawan,henry,ben,ojha,hooda,bipul,bhuvi,nehra,rashid;
	public void init()
	{
		l1=new Label("ENTER A SRH PLAYER:");
		l2=new Label("COUNTRY:");
		l3=new Label("ROLE:");
		l4=new Label("HIGHEST SCORE:");
		l5=new Label("BEST BOWLING:");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		t4=new TextField(10);
		t5=new TextField(10);
		search=new Button("SEARCH");
		search.addActionListener(this);
		add(l1);
		add(t1);
		add(search);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		l1.setBounds(300,300,160,35);
		t1.setBounds(600,300,200,35);
		l2.setBounds(300,300,160,35);
		
		t2.setBounds(600,300,200,35);
		l3.setBounds(300,300,160,35);
		t3.setBounds(600,300,160,35);
		l4.setBounds(300,300,160,35);
		t4.setBounds(600,300,200,35);
		l5.setBounds(300,300,160,35);
		t5.setBounds(600,300,200,35);
		search.setBounds(300,400,500,50);
		l1.setBackground(Color.orange);
		l2.setBackground(Color.red);
		l3.setBackground(Color.green);
		l4.setBackground(Color.pink);
		l5.setBackground(Color.magenta);
		search.setBackground(Color.yellow);
		setBackground(Color.cyan);
			img=getImage(getDocumentBase(),getParameter("img"));
			yuvi=getImage(getDocumentBase(),getParameter("yuvi"));
			warner=getImage(getDocumentBase(),getParameter("warner"));
			henry=getImage(getDocumentBase(),getParameter("henry"));
			ben=getImage(getDocumentBase(),getParameter("ben"));
			hooda=getImage(getDocumentBase(),getParameter("hooda"));
			ojha=getImage(getDocumentBase(),getParameter("ojha"));
			bhuvi=getImage(getDocumentBase(),getParameter("bhuvi"));
			bipul=getImage(getDocumentBase(),getParameter("bipul"));
			nehra=getImage(getDocumentBase(),getParameter("nehra"));
			rashid=getImage(getDocumentBase(),getParameter("rashid"));
			dhawan=getImage(getDocumentBase(),getParameter("dhawan"));
	}
	public void paint(Graphics g)
	{
		
		g.drawImage(img,150,200,this);
		
		if((t1.getText()).equals("yuvraj singh"))
			g.drawImage(yuvi,800,200,this);
		else if((t1.getText()).equals("david warner"))
			g.drawImage(warner,800,200,this);
		else if((t1.getText()).equals("moises henriques"))
			g.drawImage(henry,800,200,this);
		else if((t1.getText()).equals("ben cutting"))
			g.drawImage(ben,800,200,this);
		else if((t1.getText()).equals("deepak hooda"))
			g.drawImage(hooda,800,200,this);
		else if((t1.getText()).equals("naman ojha"))
			g.drawImage(ojha,800,200,this);
		else if((t1.getText()).equals("bipul sharma"))
			g.drawImage(bipul,800,200,this);
		else if((t1.getText()).equals("shikhar dhawan"))
			g.drawImage(dhawan,800,200,this);
		else if((t1.getText()).equals("rashid khan"))
			g.drawImage(rashid,800,200,this);
		else if((t1.getText()).equals("ashish nehra"))
			g.drawImage(nehra,800,200,this);
		else if((t1.getText()).equals("bhuvneshwar kumar"))
			g.drawImage(bhuvi,800,200,this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		//yuvrajsingh
		if((t1.getText()).equals("yuvraj singh")||(t1.getText()).equals("YUVRAJ SINGH"))
		{
			country="INDIA";
			role="ALL ROUNDER";
			hs="83";
			bf="29/4";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//warner
		else if((t1.getText()).equals("david warner")||(t1.getText()).equals("DAVID WARNER"))
		{
			country="AUSTRALIA";
			role="BATSMAN";
			hs="109";
			bf="-";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//ojha
		else if((t1.getText()).equals("naman ojha")||(t1.getText()).equals("NAMAN OJHA"))
		{
			country="INDIA";
			role="WICKETKEEPER-BATSMAN";
			hs="94";
			bf="-";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//henriques
		else if((t1.getText()).equals("moises henriques")||(t1.getText()).equals("MOISES HENRIQUES"))
		{
			country="AUSTRALIA";
			role="ALLROUNDER";
			hs="74";
			bf="16/3";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//cutting
		else if((t1.getText()).equals("ben cutting")||(t1.getText()).equals("BEN CUTTING"))
		{
			country="AUSTRALIA";
			role="ALLROUNDER";
			hs="39";
			bf="20/2";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//hooda
		else if((t1.getText()).equals("deepak hooda")||(t1.getText()).equals("DEEPAK HOODA"))
		{
			country="INDIA";
			role="BATSMAN";
			hs="54";
			bf="16/2";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//bhuvi
		else if((t1.getText()).equals("bhuvneshwar kumar")||(t1.getText()).equals("BHUVNESHWAR KUMAR"))
		{
			country="INDIA";
			role="BOWLER";
			hs="24";
			bf="14/4";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//nehra
		else if((t1.getText()).equals("ashish nehra")||(t1.getText()).equals("ASHISH NEHRA"))
		{
			country="INDIA";
			role="BOWLER";
			hs="22";
			bf="10/4";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//rashid
		else if((t1.getText()).equals("rashid khan")||(t1.getText()).equals("RASHID KHAN"))
		{
			country="AFGHANISTAN";
			role="BOWLER";
			hs="2";
			bf="19/3";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//dhawan
		else if((t1.getText()).equals("SHIKHAR DHAWAN")||(t1.getText()).equals("shikhar dhawan"))
		{
			country="INDIA";
			role="BATSMAN";
			hs="95";
			bf="7/1";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//bipul
		else if((t1.getText()).equals("BIPUL SHARMA")||(t1.getText()).equals("bipul sharma"))
		{
			country="INDIA";
			role="ALL-ROUNDER";
			hs="35";
			bf="13/2";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//fizz
		else if((t1.getText()).equals("MUSTAFIZUR RAHMAN")||(t1.getText()).equals("mustafizur rahman"))
		{
			country="BANGLADESH";
			role="BOWLER";
			hs="6";
			bf="16/3";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//nabi
		else if((t1.getText()).equals("MOHAMMAD NABI")||(t1.getText()).equals("mohammad nabi"))
		{
			country="AFGHANISTAN";
			role="ALL-ROUNDER";
			hs="-";
			bf="0/0";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//kane
		else if((t1.getText()).equals("KANE WILLIAMSON")||(t1.getText()).equals("kane williamson"))
		{
			country="NEW ZEALAND";
			role="BATSMAN";
			hs="50";
			bf="7/0";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//sran
		else if((t1.getText()).equals("BARINDER SRAN")||(t1.getText()).equals("barinder sran"))
		{
			country="INDIA";
			role="BOWLER";
			hs="2";
			bf="28/3";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		//mithun
		else if((t1.getText()).equals("ABHIMANYU MITHUN")||(t1.getText()).equals("abhimanyu mithun"))
		{
			country="INDIA";
			role="BOWLER";
			hs="11";
			bf="37/2";
			t2.setText(country);
			t3.setText(role);
			t4.setText(hs);
			t5.setText(bf);
		}
		else
		{
			t1.setText("check the name");
			t2.setText("-");
			t3.setText("-");
			t4.setText("-");
			t5.setText("-");
		}
		
	}
}
