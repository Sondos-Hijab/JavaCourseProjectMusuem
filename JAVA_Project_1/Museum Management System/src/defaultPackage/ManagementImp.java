package defaultPackage;
import javax.swing.*;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.sql.Date;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
public class ManagementImp extends JFrame implements ActionListener,ItemListener{
	//north part
	private JButton  listGuide;
	String tokens[];
	String sguides="";
	Languages langVis;
	RegularVisitor rv;
	SeniorVisitor sv;
	MuseumSystem ms;
	MultiTimeTicket mtt;
	MuseumWorkingDays expecDay;
	Guide chosenGuide;
	ArrayList<Guide> availableGuidesArray=new ArrayList<Guide>();
	Subscription sub=new Subscription();
	TicketType tt;
	ArrayList <MuseumWorkingDays>workingDaysGuide;
	Guide g;
	private JPanel Buttons;
	private JButton guideButton;
	private JButton visitorButton;
	private JButton managementButton;
	private FlowLayout flowLayout;
	private JPanel northPanel;
	private JLabel[] labels;
	private GridLayout gridLayout;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel allPanel;
	//center part
	private JLabel visitorName;
	private JLabel visitorID;
	private JLabel visitorDOB;
	private JTextField nameText;
	private JTextField  IDText;
	private JTextField DOBText;
	private JRadioButton regular;
	private JRadioButton senior;
	private ButtonGroup group = new ButtonGroup();
	private JButton addVisitor;
	private JPanel visTickGuiPanel1;
	private JPanel visTickGuiPanel2;
	private JPanel visTickGuiPanel3;
	private JPanel visitorPanel;
	private GridLayout gridLayoutVisitor;
	
	
	private JLabel guideName;
	private JLabel guideID;
	private JLabel guideDOB;
	private JLabel workingDays;
	private JTextField nameTextg;
	private JTextField  IDTextg;
	private JTextField DOBTextg;
	private JCheckBox sun;
	private JCheckBox mon;
	private JCheckBox tue;
	private JCheckBox wed;
	private JCheckBox thu;
	private JCheckBox fri;
	private JCheckBox sat;
	private JButton addGuide;
	private GridLayout gridlayoutGuide;
	private JPanel guidePanel;
	private JPanel daysPanel;

	
	private JLabel visitorNum;
	private JLabel visitDay;
	private JLabel ticketType;
	private JLabel bookTour;
	private JTextField visNumText;
	private JTextField visitDayText;
	private JRadioButton daily;
	private JRadioButton monthly;
	private JRadioButton yearly;
	private ButtonGroup dmy=new ButtonGroup();
	private JCheckBox yes;
	private JLabel Language;
	private JComboBox languages;
	private String languagesStrings[] = { "Arabic", "English", "French"};
	private String guidesString[] = {"list of available guides"};
	private JLabel avaiGuides;
	private JComboBox availableGuides;
	private JButton issueTicket;
	private GridLayout tickGridLayout;
	private JPanel tickPanel;
	private JPanel typePanel;
	private JPanel tourPanel;
	private JButton clearGuides;
	
	private JPanel textAreaPanel;
	private JTextArea textArea;
	private Box box=Box.createHorizontalBox();
	
	//end of center part
	public ManagementImp(MuseumSystem m) {
		super("Museum System Management");
		//north part
		northPanel=new JPanel();
		northPanel.setLayout(new BorderLayout());
		allPanel=new JPanel();
		allPanel.setLayout(new BorderLayout());
		ms=m;
		Buttons=new JPanel();
		flowLayout=new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		Buttons.setLayout(flowLayout);
		guideButton=new JButton("Guide Information");
		Buttons.add(guideButton);
		visitorButton=new JButton("Visitor Information");
		Buttons.add(visitorButton);
		managementButton=new JButton("Management");
		Buttons.add(managementButton);
		northPanel.add(Buttons,BorderLayout.NORTH); 
		panel2=new JPanel();
		gridLayout=new GridLayout(3,1);
		panel2.setLayout(gridLayout);
		labels= new JLabel[3];
		labels[0]=new JLabel("Museum Name: "+m.getName());
		Font font1 = new Font("SansSerif", Font.BOLD, 18);
		labels[0].setFont(font1);
		panel2.add(labels[0]);
		labels[1]=new JLabel("Address: [ Nablus- An Najah National University ]");
		panel2.add(labels[1]);
		String line=new String("Museum Working Days: [  ");
		for(MuseumWorkingDays d: MuseumWorkingDays.values()) {
			line+=d+"   ";
		}
		line+=" ]";
		labels[2]=new JLabel(line);
		panel2.add(labels[2]);
		panel3= new JPanel();
		panel3.setLayout(new BorderLayout());
		panel3.add(panel2,BorderLayout.NORTH);
		northPanel.add(panel3,BorderLayout.WEST);
		
		visitorButton.addActionListener(this);
		managementButton.addActionListener(this);
		guideButton.addActionListener(this);
		
		northPanel.add(panel3);
		add(northPanel,BorderLayout.NORTH);
		//center part
		
		//visitor part
		visTickGuiPanel1=new JPanel();
		visTickGuiPanel1.setLayout(new BorderLayout());
		gridLayoutVisitor=new GridLayout(5,2);
		visitorPanel=new JPanel();
		visitorPanel.setLayout(gridLayoutVisitor);
		visitorName=new JLabel("Visitor's Name");
		nameText=new JTextField();
		visitorPanel.add(visitorName);
		visitorPanel.add(nameText);
		visitorID=new JLabel("Visitor's Id");
		IDText=new JTextField();
		visitorPanel.add(visitorID);
		visitorPanel.add(IDText);
		visitorDOB=new JLabel("Visitor's Date Of Birth");
		DOBText=new JTextField();
		visitorPanel.add(visitorDOB);
		visitorPanel.add(DOBText);
		
		regular=new JRadioButton("Regular Visitor");
		regular.addItemListener(this);
		senior=new JRadioButton("Senior Visitor");
		senior.addItemListener(this);
		visitorPanel.add(regular);
		visitorPanel.add(senior);
		group.add(regular);
		group.add(senior);
		
		addVisitor=new JButton("Add Visitor");
		addVisitor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				boolean b=true;
				if(regular.isSelected()) {
					for(Visitor v:ms.getArrayListVisitor()) {
						if(Integer.parseInt(IDText.getText())==v.getId()) {
							textArea.setText("the id is used before");
							b=false;
						}
					}
				if(b) {
				rv=new RegularVisitor();
				rv.setId(Integer.parseInt(IDText.getText()));
				rv.setName(nameText.getText());
				Date d= Date.valueOf(DOBText.getText());
				rv.setDob(d);
				ms.arrayListVisitor.add(rv);
				ms.getRegularVisitors().add(rv);
				textArea.setText("Visitor:"+ rv.getName()+" is added successfully"+"\nRegular Visitor\nInfo about the visitor: ID-->"+rv.getId()+"........Date of birth:"+rv.getDob());
					}
				}
				else if(senior.isSelected()) {
					for(Visitor v:ms.getArrayListVisitor()) {
					if(Integer.parseInt(IDText.getText())==v.getId()) { 
						textArea.setText("the id is used before");
						b=false;
					}
					}
					if(b) {
						sv=new SeniorVisitor();
						sv.setId(Integer.parseInt(IDText.getText()));
						sv.setName(nameText.getText());
						Date d= Date.valueOf(DOBText.getText());
						sv.setDob(d);
						ms.arrayListVisitor.add(sv);
						ms.getSeniorVisitors().add(sv);
						textArea.setText("Visitor:"+ sv.getName()+" is added successfully"+"\nSenior Visitor\nInfo about the visitor: ID-->"+sv.getId()+"........Date of birth:"+sv.getDob());
					}
				}
					}	
			}	
				);
		visitorPanel.add(addVisitor);
		visTickGuiPanel1.add(visitorPanel,BorderLayout.NORTH);
		//guide part
		gridlayoutGuide=new GridLayout(5,2);
		guidePanel=new JPanel();
		guidePanel.setLayout(gridlayoutGuide);
		guideName=new JLabel("Guide's Name");
		nameTextg=new JTextField();
		guidePanel.add(guideName);
		guidePanel.add(nameTextg);
		guideID=new JLabel("Guide's Id");
		IDTextg=new JTextField();
		guidePanel.add(guideID);
		guidePanel.add(IDTextg);
		guideDOB=new JLabel("Guide's Date Of Birth");
		DOBTextg=new JTextField();
		guidePanel.add(guideDOB);
		guidePanel.add(DOBTextg);
		daysPanel=new JPanel();
		daysPanel.setLayout(new FlowLayout());
		workingDays=new JLabel("Working Days");
		sun=new JCheckBox("Sun");
		mon=new JCheckBox("Mon");
		tue=new JCheckBox("Tue");
		wed=new JCheckBox("Wed");
		thu=new JCheckBox("Thu");
		fri=new JCheckBox("Fri");
		sat=new JCheckBox("Sat");
		
		sun.addItemListener(this);
		mon.addItemListener(this);
		tue.addItemListener(this);
		wed.addItemListener(this);
		thu.addItemListener(this);
		fri.addItemListener(this);
		sat.addItemListener(this);
		
		daysPanel.add(sun);
		daysPanel.add(mon);
		daysPanel.add(tue);
		daysPanel.add(wed);
		daysPanel.add(thu);
		daysPanel.add(fri);
		daysPanel.add(sat);
		
		guidePanel.add(workingDays);
		guidePanel.add(daysPanel);
		
		addGuide=new JButton("Add Guide");
		Font font=new Font("SansSerif",Font.BOLD,14);
		guideDOB.setFont(font);
		workingDays.setFont(font);
		addGuide.setFont(font);
		
		guidePanel.add(addGuide);
		visTickGuiPanel2=new JPanel();
		visTickGuiPanel2.setLayout(new BorderLayout());
		visTickGuiPanel2.add(guidePanel,BorderLayout.NORTH);
		
		addGuide.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						workingDaysGuide=new ArrayList<MuseumWorkingDays>();
						if(sun.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.SUNDAY);
						}
						if(mon.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.MONDAY);
						}
						if(tue.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.TUESDAY);
						}
						if(wed.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.WEDNESDAY);
						}
						if(thu.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.THURSDAY);
						}
						if(fri.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.FRIDAY);
						}
						if(sat.isSelected()) {
							workingDaysGuide.add(MuseumWorkingDays.SATURDAY);
						}
						boolean b=true;
							for(Guide g:ms.getArrayListGuide()) {
								if(Integer.parseInt(IDTextg.getText())==g.getId()) {
									textArea.setText("the id is used before");
									b=false;
								}
							}
						if(b) {
						g=new Guide();
						g.setId(Integer.parseInt(IDTextg.getText()));
						g.setName(nameTextg.getText());
						Date d= Date.valueOf(DOBTextg.getText());
						g.setDob(d);
						g.setWorkingdays(workingDaysGuide);
						ms.arrayListGuide.add(g);
						String s= new String("Guide:"+ g.getName()+" is added successfully"+"\nGuide\nInfo about the Guide: ID-->"+g.getId()+"........Date of birth:"+g.getDob()+" Working Days:[   ");
						for(MuseumWorkingDays day: workingDaysGuide) {
							s+=day.toString()+"   ";
						}
						s+="]";
						textArea.setText(s);
							}
					
				}
				}
				
				
				);
		
		//issueTicket
		tickPanel=new JPanel();
		typePanel=new JPanel();
		tourPanel=new JPanel();
		tickGridLayout=new GridLayout(5,2);
		tickPanel.setLayout(tickGridLayout);
		typePanel.setLayout(new FlowLayout());
		tourPanel.setLayout(new FlowLayout());
		visitorNum=new JLabel("Visitor's Number");
		tickPanel.add(visitorNum);
		visNumText=new JTextField();
		tickPanel.add(visNumText);
		visitDay=new JLabel("Expected Visit Day");
		
		
		
		
		
		
		tickPanel.add(visitDay);
		visitDayText=new JTextField();
		tickPanel.add(visitDayText);
		ticketType=new JLabel("Ticket's Type/ Subscription");
		tickPanel.add(ticketType);
		daily=new JRadioButton("Daily");
		monthly=new JRadioButton("Monthly");
		yearly=new JRadioButton("Yearly");
		typePanel.add(daily);
		typePanel.add(monthly);
		typePanel.add(yearly);
		
		dmy.add(daily);
		dmy.add(monthly);
		dmy.add(yearly);
		
		daily.addItemListener(this);
		monthly.addItemListener(this);
		yearly.addItemListener(this);
		
		tickPanel.add(typePanel);
		
		bookTour=new JLabel("Book a tour for this visit?");
		tickPanel.add(bookTour);
		yes=new JCheckBox("yes");
		tourPanel.add(yes);
		yes.addItemListener(this);
		Language=new JLabel("Language");
		tourPanel.add(Language);
		languages = new JComboBox( languagesStrings);
		languages.addItemListener(this);
		tourPanel.add(new JScrollPane(languages));
		avaiGuides=new JLabel("Available Guides");
		tourPanel.add(avaiGuides);
		availableGuides=new JComboBox(guidesString);
		availableGuides.addItemListener(this);
		tourPanel.add(availableGuides);
		listGuide=new JButton("list available guides");
		tourPanel.add(listGuide);
		clearGuides=new JButton("clear Guides to issue new ticket");
		tourPanel.add(clearGuides);
		listGuide.addActionListener(new ActionListener() {
			int i=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(visitDayText.getText().equalsIgnoreCase("sunday"))
					expecDay=MuseumWorkingDays.SUNDAY;
				else if (visitDayText.getText().equalsIgnoreCase("monday"))
					expecDay=MuseumWorkingDays.MONDAY;
				else if (visitDayText.getText().equalsIgnoreCase("tuesday"))
					expecDay=MuseumWorkingDays.TUESDAY;
				else if (visitDayText.getText().equalsIgnoreCase("wednesday"))
					expecDay=MuseumWorkingDays.WEDNESDAY;
				else if (visitDayText.getText().equalsIgnoreCase("thursday"))
					expecDay=MuseumWorkingDays.THURSDAY;
				else if (visitDayText.getText().equalsIgnoreCase("friday"))
					expecDay=MuseumWorkingDays.FRIDAY;
				else if (visitDayText.getText().equalsIgnoreCase("saturday"))
					expecDay=MuseumWorkingDays.SATURDAY;
				
				for(Guide g: ms.getArrayListGuide()) {
					for(MuseumWorkingDays d: g.getWorkingdays()) {
						for(Languages l: g.getLanguage()) {
							if(d==expecDay&&l==langVis)
								{sguides+=g.getName()+" "; availableGuides.addItem(g.getName());}
						}
					}

				}

			}
			
		}
				);
		clearGuides.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(Guide g: ms.getArrayListGuide()) {
					for(MuseumWorkingDays d: g.getWorkingdays()) {
						for(Languages l: g.getLanguage()) {
							if(d==expecDay&&l==langVis)
								{sguides+=g.getName()+" "; availableGuides.removeItem(g.getName());}
						}
			}
				
		}
			}
		}
				);
		
		tickPanel.add(tourPanel);
		issueTicket=new JButton("Issue Ticket");
		tickPanel.add(issueTicket);
		///////////////////////////////////////////////////
		issueTicket.addActionListener(new ActionListener() {
			boolean isDone;
			@Override
			public void actionPerformed(ActionEvent arg0) {
				for(Visitor v: ms.getArrayListVisitor()) {
					isDone=false;
					if(v.getvId()==Integer.parseInt(visNumText.getText()))
					{
						sub=new Subscription();
						v.setTourDay(expecDay);
						sub.setV(v);
						mtt=new MultiTimeTicket(tt);
						mtt.setVisitor(v);
						sub.setT(mtt);
						if(yes.isSelected()) {
							sub.setG(chosenGuide);
						}
						if(yes.isSelected()) {
							textArea.setText("Ticket Information:\n"+"Visitor's Name: "+v.getName()+"\nVisit's day: "+visitDayText.getText()+"\nwith a tour? yes [Guide's name: "+chosenGuide.getName()+" ,Language :"+langVis.toString()+"]\nprice: "+mtt.getPrice());
						}
						else {
							textArea.setText("Ticket Information:\n"+"Visitor's Name: "+v.getName()+"\nVisit's day: "+visitDayText.getText()+"\nwith a tour? no"+"\nprice: "+mtt.getPrice());
						}
						isDone=true;
						break;
					}
				}
				if(isDone==false)
				textArea.setText("no user found");
			}
				
				
				
		}
				);
		////////////////////////////////////////////////
		visTickGuiPanel2.add(tickPanel,BorderLayout.CENTER);
		
		allPanel.add(visTickGuiPanel1,BorderLayout.NORTH);
		allPanel.add(visTickGuiPanel2,BorderLayout.CENTER);
		add(allPanel,BorderLayout.CENTER);
		
		textAreaPanel=new JPanel();
		textArea = new JTextArea( 15, 60 ); 
		box.add( new JScrollPane( textArea ) );
		textAreaPanel.add(box);
		add(textAreaPanel,BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==visitorButton) {
			VisitorImp vis=new VisitorImp(ms);
			vis.setSize(2000,850);
			vis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			vis.setVisible(true);
			
		}
		else if(e.getSource()==managementButton) {
			ManagementImp manage=new ManagementImp(ms);
			manage.setSize(2000,850);
			manage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			manage.setVisible(true);
			
		}
		else if(e.getSource()==guideButton) {
			GuideImp g=new GuideImp(ms);
			g.setSize(2000,850);
			g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			g.setVisible(true);
			
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==languages) {
			if(languages.getSelectedItem()=="Arabic") langVis=Languages.ARABIC;
			else if (languages.getSelectedItem()=="English") langVis=Languages.ENGLISH;
			else if(languages.getSelectedItem()=="French") langVis=Languages.FRENCH;
		}
	if(daily.isSelected())
		tt=TicketType.DAILY;
	else if(monthly.isSelected())
		tt=TicketType.MONTHLY;
	else if(yearly.isSelected())
		tt=TicketType.YEARLY;
	
	
	if(e.getSource()==availableGuides) {
				for(Guide g : ms.getArrayListGuide())
					if(availableGuides.getSelectedItem().equals(g.getName()))
						chosenGuide=g;
		
	}
	}
	

}
