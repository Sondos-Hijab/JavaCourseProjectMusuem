package defaultPackage;
import defaultPackage.GUI_Imp;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

public class TesterClass {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		SeniorVisitor seniorVisitor1=new SeniorVisitor();
		ArrayList <VisitorRecord> seniorVisitor1Record=new ArrayList<VisitorRecord>();
		VisitorRecord record1Svisitor1=new VisitorRecord(Date.valueOf("2021-05-03"),Time.valueOf("10:20:32"));
		VisitorRecord record2Svisitor1=new VisitorRecord(Date.valueOf("2021-06-02"),Time.valueOf("11:40:32"));
		seniorVisitor1Record.add(record1Svisitor1);
		seniorVisitor1Record.add(record2Svisitor1);
		seniorVisitor1.setVisits(seniorVisitor1Record);
		seniorVisitor1.setName("Sondos");
		seniorVisitor1.setId(100);
		seniorVisitor1.setDob(Date.valueOf("2001-09-10"));
		seniorVisitor1.setDiscountRate(0.2);
		seniorVisitor1.setRecord_id(123);
		seniorVisitor1.setTourDay(MuseumWorkingDays.SUNDAY);
		seniorVisitor1.setvId(15);
		seniorVisitor1.setVisitor_Language(Languages.ENGLISH);
		seniorVisitor1.setVisits_count(2);
		
		MultiTimeTicket tSeniotVisitor1=new MultiTimeTicket();
		tSeniotVisitor1.setIssueDate(Date.valueOf("2020-02-05"));
		tSeniotVisitor1.setType(TicketType.DAILY);
		tSeniotVisitor1.setVisitor(seniorVisitor1);
		
		//	System.out.print(seniorVisitor1);
		
		SeniorVisitor seniorVisitor2=new SeniorVisitor();
		ArrayList <VisitorRecord> seniorVisitor2Record=new ArrayList<VisitorRecord>();
		VisitorRecord record1Svisitor2=new VisitorRecord(Date.valueOf("2020-05-03"),Time.valueOf("10:20:32"));
		VisitorRecord record2Svisitor2=new VisitorRecord(Date.valueOf("2005-06-02"),Time.valueOf("11:40:32"));
		seniorVisitor2Record.add(record1Svisitor2);
		seniorVisitor2Record.add(record2Svisitor2);
		seniorVisitor2.setVisits(seniorVisitor2Record);
		seniorVisitor2.setName("Ahmad");
		seniorVisitor2.setId(21);
		seniorVisitor2.setDob(Date.valueOf("1990-09-10"));
		seniorVisitor2.setDiscountRate(0.5);
		seniorVisitor2.setRecord_id(245);
		seniorVisitor2.setTourDay(MuseumWorkingDays.SUNDAY);
		seniorVisitor2.setvId(10);
		seniorVisitor2.setVisitor_Language(Languages.ARABIC);
		seniorVisitor2.setVisits_count(2);
		
		MultiTimeTicket tSeniotVisitor2=new MultiTimeTicket();
		tSeniotVisitor2.setIssueDate(Date.valueOf("2019-02-04"));
		tSeniotVisitor2.setType(TicketType.MONTHLY);
		tSeniotVisitor2.setVisitor(seniorVisitor2);
    //		System.out.println();
	//	System.out.print(seniorVisitor2);
		
		SeniorVisitor seniorVisitor3=new SeniorVisitor();
		ArrayList <VisitorRecord> seniorVisitor3Record=new ArrayList<VisitorRecord>();
		VisitorRecord record1Svisitor3=new VisitorRecord(Date.valueOf("2021-05-03"),Time.valueOf("10:20:32"));
		VisitorRecord record2Svisitor3=new VisitorRecord(Date.valueOf("2021-06-02"),Time.valueOf("11:40:32"));
		seniorVisitor3Record.add(record1Svisitor3);
		seniorVisitor3Record.add(record2Svisitor3);
		seniorVisitor3.setVisits(seniorVisitor3Record);
		seniorVisitor3.setName("Omar");
		seniorVisitor3.setId(145);
		seniorVisitor3.setDob(Date.valueOf("2001-09-02"));
		seniorVisitor3.setDiscountRate(0.3);
		seniorVisitor3.setRecord_id(142);
		seniorVisitor3.setTourDay(MuseumWorkingDays.FRIDAY);
		seniorVisitor3.setvId(41);
		seniorVisitor3.setVisitor_Language(Languages.FRENCH);
		seniorVisitor3.setVisits_count(2);
		
		MultiTimeTicket tSeniotVisitor3=new MultiTimeTicket();
		tSeniotVisitor3.setIssueDate(Date.valueOf("2020-02-05"));
		tSeniotVisitor3.setType(TicketType.YEARLY);
		tSeniotVisitor3.setVisitor(seniorVisitor3);
		
		////////////////////
		
		ArrayList <VisitorRecord> regularVisitor1Record=new ArrayList<VisitorRecord>();
		VisitorRecord record1Rvisitor1=new VisitorRecord(Date.valueOf("2021-05-03"),Time.valueOf("11:20:32"));
		VisitorRecord record2Rvisitor1=new VisitorRecord(Date.valueOf("2021-06-02"),Time.valueOf("06:50:32"));
		regularVisitor1Record.add(record1Rvisitor1);
		regularVisitor1Record.add(record2Rvisitor1);
		RegularVisitor regularVisitor1=new RegularVisitor();
		regularVisitor1.setVisits(seniorVisitor1Record);
		regularVisitor1.setName("Aseel");
		regularVisitor1.setId(101);
		regularVisitor1.setDob(Date.valueOf("2000-06-26"));
		regularVisitor1.setRecord_id(321);
		regularVisitor1.setTourDay(MuseumWorkingDays.MONDAY);
		regularVisitor1.setvId(14);
		regularVisitor1.setVisitor_Language(Languages.ARABIC);
		regularVisitor1.setVisits_count(2);
		
		MultiTimeTicket tRegularVisitor1=new MultiTimeTicket();
		tRegularVisitor1.setIssueDate(Date.valueOf("2021-12-10"));
		tRegularVisitor1.setType(TicketType.YEARLY);
		tRegularVisitor1.setVisitor(regularVisitor1);
	//	System.out.println("\n");
	//	System.out.print(regularVisitor1);

		
		ArrayList <VisitorRecord> regularVisitor2Record=new ArrayList<VisitorRecord>();
		VisitorRecord record1Rvisitor2=new VisitorRecord(Date.valueOf("2021-06-03"),Time.valueOf("03:20:32"));
		VisitorRecord record2Rvisitor2=new VisitorRecord(Date.valueOf("2021-10-02"),Time.valueOf("06:20:32"));
		regularVisitor2Record.add(record1Rvisitor2);
		regularVisitor2Record.add(record2Rvisitor2);
		RegularVisitor regularVisitor2=new RegularVisitor();
		regularVisitor2.setVisits(seniorVisitor2Record);
		regularVisitor2.setName("Ameed");
		regularVisitor2.setId(1010);
		regularVisitor2.setDob(Date.valueOf("2000-06-20"));
		regularVisitor2.setRecord_id(324);
		regularVisitor2.setTourDay(MuseumWorkingDays.WEDNESDAY);
		regularVisitor2.setvId(52);
		regularVisitor2.setVisitor_Language(Languages.ENGLISH);
		regularVisitor2.setVisits_count(2);
		
		MultiTimeTicket tRegularVisitor2=new MultiTimeTicket();
		tRegularVisitor2.setIssueDate(Date.valueOf("2021-12-10"));
		tRegularVisitor2.setType(TicketType.MONTHLY);
		tRegularVisitor2.setVisitor(regularVisitor2);
	//	System.out.println("\n");
	//	System.out.print(regularVisitor2);
		
		
		
		seniorVisitor1.setIssueDate(Date.valueOf("2021-03-22"));
	//	System.out.println();
	//	seniorVisitor1.BookTour();
	//	System.out.println();
		regularVisitor1.setIssueDate(Date.valueOf("2021-03-20"));
	//	regularVisitor1.BookTour();
	//	System.out.println();
		seniorVisitor2.setIssueDate(Date.valueOf("2021-03-22"));
	//	System.out.println();
	//	seniorVisitor2.BookTour();
	//	System.out.println();
		regularVisitor2.setIssueDate(Date.valueOf("2021-03-20"));
	//	regularVisitor2.BookTour();
		
		
		
		Guide g1=new Guide();
		g1.setName("Sama");
		g1.setId(389);
		g1.setDob(Date.valueOf("2015-05-26"));
		g1.setEmployment_id(114);
		g1.setHireDate(Date.valueOf("2020-09-14"));
		g1.setToursPerDay(3);
		ArrayList <MuseumWorkingDays> g1Days=new ArrayList<MuseumWorkingDays>();
		ArrayList <Languages> g1Languages= new ArrayList<Languages>();
		MuseumWorkingDays day1guide1=MuseumWorkingDays.MONDAY;
		MuseumWorkingDays day2guide1=MuseumWorkingDays.SUNDAY;
		MuseumWorkingDays day3guide1=MuseumWorkingDays.WEDNESDAY;
		g1Days.add(day1guide1);
		g1Days.add(day2guide1);
		g1Days.add(day3guide1);
		Languages lang1guide1= Languages.ENGLISH;
		Languages lang2guide1=Languages.ARABIC;
		g1Languages.add(lang1guide1);
		g1Languages.add(lang2guide1);
		g1.setWorkingdays(g1Days);
		g1.setLanguage(g1Languages);
		g1.setToursPerWeek(6);
	//	System.out.println(g1);
		
		Guide g2=new Guide();
		g2.setName("Alex");
		g2.setId(3844);
		g2.setDob(Date.valueOf("2016-05-26"));
		g2.setEmployment_id(1144);
		g2.setHireDate(Date.valueOf("1999-09-14"));
		g2.setToursPerDay(2);
		ArrayList <MuseumWorkingDays> g2Days=new ArrayList<MuseumWorkingDays>();
		ArrayList <Languages> g2Languages= new ArrayList<Languages>();
		MuseumWorkingDays day1guide2=MuseumWorkingDays.TUESDAY;
		MuseumWorkingDays day2guide2=MuseumWorkingDays.SUNDAY;
		g2Days.add(day1guide2);
		g2Days.add(day2guide2);
		Languages lang1guide2= Languages.ENGLISH;
		Languages lang2guide2=Languages.ARABIC;
		Languages lang3guide2=Languages.FRENCH;
		g2Languages.add(lang1guide2);
		g2Languages.add(lang2guide2);
		g2Languages.add(lang3guide2);
		g2.setWorkingdays(g2Days);
		g2.setLanguage(g2Languages);
		g2.setToursPerWeek(4);
	//	System.out.println(g2);
		Guide g3=new Guide();
		g3.setName("Samer");
		g3.setId(52);
		g3.setDob(Date.valueOf("1999-04-03"));
		g3.setEmployment_id(1144);
		g3.setHireDate(Date.valueOf("2000-01-04"));
		g3.setToursPerDay(2);
		ArrayList <MuseumWorkingDays> g3Days=new ArrayList<MuseumWorkingDays>();
		ArrayList <Languages> g3Languages= new ArrayList<Languages>();
		MuseumWorkingDays day1guide3=MuseumWorkingDays.FRIDAY;
		MuseumWorkingDays day2guide3=MuseumWorkingDays.THURSDAY;
		MuseumWorkingDays day3guide3=MuseumWorkingDays.SUNDAY;
		g3Days.add(day1guide3);
		g3Days.add(day2guide3);
		g3Days.add(day3guide3);
		Languages lang1guide3= Languages.ENGLISH;
		Languages lang2guide3=Languages.ARABIC;
		Languages lang3guide3=Languages.FRENCH;
		g3Languages.add(lang1guide3);
		g3Languages.add(lang2guide3);
		g3Languages.add(lang3guide3);
		g3.setWorkingdays(g3Days);
		g3.setLanguage(g3Languages);
		g3.setToursPerWeek(4);
		
		Receptionist r1=new Receptionist();
		r1.setName("Mostafa");
		r1.setId(521);
		r1.setDob(Date.valueOf("1998-02-26"));
		r1.setEmployment_id(124);
		r1.setHireDate(Date.valueOf("2021-08-02"));
	//	System.out.println();
	//	System.out.println(r1);
		r1.addGuide(g1);
		r1.addGuide(g2);
		r1.addGuide(g3);
	//	OneTimeTicket t1=r1.issueOneTimeTicket(seniorVisitor1, seniorVisitor1.getIssueDate());
	//	Subscription sub1= r1.registerSubs(seniorVisitor1, t1);
	//	System.out.println(sub1);
	//	MultiTimeTicket t2=r1.issueMultiTimeTicket(seniorVisitor2, seniorVisitor2.getIssueDate());
	//	r1.ediSubs(sub1, seniorVisitor2, t2, g2);
	//	System.out.println(sub1);
	//	sub1=r1.deleteSub(sub1);
	//	System.out.println(sub1);
		
		//////////////////////////////////menu///////////////////////////////////
		
		
		ArrayList<SeniorVisitor> seniorVisitors=new ArrayList<SeniorVisitor> ();
		ArrayList<Subscription> subscriptions=new ArrayList<Subscription>();
		seniorVisitors.add(seniorVisitor1);
		seniorVisitors.add(seniorVisitor2);
		seniorVisitors.add(seniorVisitor3);
		ArrayList<RegularVisitor> regularVisitors=new ArrayList<RegularVisitor>();
		regularVisitors.add(regularVisitor1);
		regularVisitors.add(regularVisitor2);
		int x;
		MuseumSystem museumOne=new MuseumSystem("Art Museum");
		museumOne.addGuide(g1);
		museumOne.addGuide(g2);
		museumOne.addGuide(g3);
		museumOne.addVisitor(seniorVisitor1);
		museumOne.getSeniorVisitors().add(seniorVisitor1);
		museumOne.addVisitor(seniorVisitor2);
		museumOne.getSeniorVisitors().add(seniorVisitor2);
		museumOne.addVisitor(seniorVisitor3);
		museumOne.getSeniorVisitors().add(seniorVisitor3);
		museumOne.addVisitor(regularVisitor1);
		museumOne.getRegularVisitors().add(regularVisitor1);
		museumOne.addVisitor(regularVisitor2);
		museumOne.getRegularVisitors().add(regularVisitor2);
		museumOne.allMultiTimeTickets.add(tSeniotVisitor1);
		museumOne.allMultiTimeTickets.add(tSeniotVisitor3);
		museumOne.allMultiTimeTickets.add(tSeniotVisitor2);
		museumOne.allMultiTimeTickets.add(tRegularVisitor1);
		museumOne.allMultiTimeTickets.add(tRegularVisitor2);
		
		GUI_Imp imp1=new GUI_Imp(museumOne);
		imp1.setSize(2000,850);
		imp1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imp1.setVisible(true);
		
		
	/*	boolean Zexit=true;
		while(Zexit) {
			//System.out.println("Museum Management System");
			String k="1)Register a guide\n2)Register a Senior visitor\n3)Register a Regular visitor\n4)Print Avialable guides\n5)Print All Guides\n6)Print all visitors\n7)issue ticket for senior visitor\n8)issue ticket for regular visitor\n9)register subscription\n10)edit subscription\n11)delete subscription\n12)exit\n";
			System.out.print(k);
			x=s.nextInt();
			if(x==1) {
				Guide g=new Guide();
				int y;
				boolean c=true;
				while(c){
				System.out.println("\n1)Enter guide’s name:\n2)Enter guide’s date of birth:\n3)Enter guide’s id number:\n"
						+ "4)Specify guide’s working days: 1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY\n" + 
						"5)Specify guide’s number of tours/day:\n6)Specify guide’s spoken languages: 1)Arabic 2)english 3)french\n"+
						"7)Enter guide’s Employement id:\n"+"8)Enter guide’s hire date:\n9)print guide\n10)add the guide to the museum system\n11)stop\n");
				ArrayList <MuseumWorkingDays> workdays=new ArrayList<MuseumWorkingDays>();
				ArrayList <Languages> spokenLang=new ArrayList<Languages>();
				int dayNum;
			    int numd;
			    int langNum;
			    int numl;
				y=s.nextInt();
				switch(y) {
				case 1:{
					System.out.println("Enter guide’s name:");
					g.setName(s.next());
					break;
				}
				case 2:{
					System.out.println("Enter guide’s date of birth:");
					g.setDob(Date.valueOf(s.next()));
					break;
				}
				case 3:{
					System.out.println("Enter guide’s id number:");
					g.setId(s.nextInt());
					break;
				}
				case 4:{
					System.out.println("Specify guide’s working days: 1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY\nenter the number of the days you want to specify then choose the number next to each day:");
					dayNum=s.nextInt();
					for(int i=0;i<dayNum;i++) {
						numd=s.nextInt();
						if(numd==1) workdays.add(MuseumWorkingDays.SUNDAY);
						else if (numd==2) workdays.add(MuseumWorkingDays.TUESDAY);
						else if (numd==3) workdays.add(MuseumWorkingDays.MONDAY);
						else if(numd==4) workdays.add(MuseumWorkingDays.WEDNESDAY);
					}
					g.setWorkingdays(workdays);
					break;
				}
				case 5:{
					System.out.println("Specify guide’s number of tours/day:");
					g.setToursPerDay(s.nextInt());
					break;
				}
				case 6:{
					System.out.println("Specify guide’s spoken languages: 1)Arabic 2)english 3)french\nenter the number of the spoken languages then enter the number next to each language you wanna specify:");
					langNum=s.nextInt();
					for(int i=0;i<langNum;i++) {
						numl=s.nextInt();
						if(numl==1) spokenLang.add(Languages.ARABIC);
						else if (numl==2) spokenLang.add(Languages.ENGLISH);
						else if (numl==3) spokenLang.add(Languages.FRENCH);
					}
					g.setLanguage(spokenLang);
					break;
				}
				case 7:{
					System.out.println("Enter guide’s Employement id:");
					g.setEmployment_id(s.nextInt());
					break;
				}
				case 8:{
					System.out.println("Enter guide’s Hire date:");
					g.setHireDate(Date.valueOf(s.next()));
					break;
				}
				case 9:{
					System.out.println(g);
					break;
				}
				case 11:{
					c=false;
					break;
				}
				case 10:{
					museumOne.addGuide(g);
					r1.addGuide(g);
					break;
				}

				}
				
			}
			}
			else if(x==2) {
				Boolean boolCH=true;
				ArrayList <VisitorRecord> vr=new ArrayList<VisitorRecord>();
				int z;
				int numday;
				int numlan;
				SeniorVisitor v1=new SeniorVisitor();
				
				while(boolCH) {
				String stringSvisitor="\n1)Enter Senior Visitor's name: \n2)Enter Senior Visitor's id: \n3)Enter Senior Visitor's Date of Birth:\n"+
				"4)Enter Senior Visitor's recordId:\n5)Enter Senior Visitor's prefered tour day: 1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY\n"+
				"6)Enter Senior Visitor's prefered Language: 1)Arabic 2)English 3)French\n"+
				"7)set discount rate for this visitor:\n8)set issueDate:\n9)Enter visits count for this visitor:\n"+
				"10)set Visitor Record\n11)Enter Vid\n12)Book Tour\n13)print senior visitor\n14)add the visitor to the museum system\n15)Stop\n";
				System.out.println(stringSvisitor);
				z=s.nextInt();
				switch(z) {
				case 1:{
					System.out.println("Enter Senior Visitor's name: ");
					v1.setName(s.next());
					break;
				}
				case 2:{
					System.out.println("Enter Senior Visitor's id: ");
					v1.setId(s.nextInt());
					break;
				}
				case 3:{
					System.out.println("Enter Senior Visitor's Date of Birth: ");
					v1.setDob(Date.valueOf(s.next()));
					break;
				}
				case 4:{
					System.out.println("Enter Senior Visitor's recordId: ");
					v1.setRecord_id(s.nextInt());
					break;
				}
				case 5:{
					System.out.println("Enter Senior Visitor's prefered tour day: 1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY");
					numday=s.nextInt();
					if(numday==1) v1.setTourDay(MuseumWorkingDays.SUNDAY);
					else if (numday==2)  v1.setTourDay(MuseumWorkingDays.TUESDAY);
					else if (numday==3)  v1.setTourDay(MuseumWorkingDays.MONDAY);
					else if(numday==4)  v1.setTourDay(MuseumWorkingDays.WEDNESDAY);
					break;
				}
				case 6:{
					System.out.println("Enter Senior Visitor's prefered Language: 1)Arabic 2)English 3)French");
					numlan=s.nextInt();
					if(numlan==1) v1.setVisitor_Language(Languages.ARABIC);
					else if(numlan==2) v1.setVisitor_Language(Languages.ENGLISH);
					else if(numlan==3) v1.setVisitor_Language(Languages.FRENCH);
					break;
				}
				case 7:{
					System.out.println("set discount rate for this visitor:");
					v1.setDiscountRate(s.nextDouble());
					break;
				}
				case 8:{
					System.out.println("set issueDate: ");
					v1.setIssueDate(Date.valueOf(s.next()));
					break;
				}
				case 9:{
					System.out.println("Enter visits count for this visitor:");
					v1.setVisits_count(s.nextInt());
					break;
				}
				case 10:{
					System.out.println("Visitor Record:");
					for(int i=0;i<v1.getVisits_count();i++) {
						VisitorRecord vr1=new VisitorRecord();
						System.out.print(i+1+")");
						System.out.println("Enter the date of the record:");
						vr1.setEnteringDate(Date.valueOf(s.next()));
						System.out.println("Enter the time of the record:");
						vr1.setEnteringTime(Time.valueOf(s.next()));
						vr.add(vr1);
					}		
					v1.setVisits(vr);
					break;
				}
				case 11:{
					System.out.println("Enter Vid");
					v1.setvId(s.nextInt());
					break;
				}
				case 12:{
					System.out.println("BookTour");
					v1.BookTour();
					break;
				}
				case 13:{
					System.out.print(v1);
					break;
				}
				case 15:{
					boolCH=false;
					break;
				}
				case 14:{
					museumOne.addVisitor(v1);
					seniorVisitors.add(v1);
					break;
				}
			}
				}
			}
			else if(x==3) {
				Boolean boolCH=true;
				ArrayList <VisitorRecord> vr=new ArrayList<VisitorRecord>();
				int z;
				int numday;
				int numlan;
				RegularVisitor v1=new RegularVisitor();
				
				while(boolCH) {
				String stringSvisitor="\n1)Enter Regular Visitor's name: \n2)Enter Regular Visitor's id: \n3)Enter Regular Visitor's Date of Birth:\n"+
				"4)Enter Regular Visitor's recordId:\n5)Enter Regular Visitor's prefered tour day: 1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY\n"+
				"6)Enter Regular Visitor's prefered Language: 1)Arabic 2)English 3)French\n"+
				"7)set issueDate:\n8)Enter visits count for this visitor:\n"+
				"9)set Visitor Record\n10)Enter Vid\n11)Book Tour\n12)print Regular visitor\n13)add the visitor to the museum system\n14)Stop\n";
				System.out.println(stringSvisitor);
				z=s.nextInt();
				switch(z) {
				case 1:{
					System.out.println("Enter Regular Visitor's name: ");
					v1.setName(s.next());
					break;
				}
				case 2:{
					System.out.println("Enter Regular Visitor's id: ");
					v1.setId(s.nextInt());
					break;
				}
				case 3:{
					System.out.println("Enter Regular Visitor's Date of Birth: ");
					v1.setDob(Date.valueOf(s.next()));
					break;
				}
				case 4:{
					System.out.println("Enter Regular Visitor's recordId: ");
					v1.setRecord_id(s.nextInt());
					break;
				}
				case 5:{
					System.out.println("Enter Regular Visitor's prefered tour day: 1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY");
					numday=s.nextInt();
					if(numday==1) v1.setTourDay(MuseumWorkingDays.SUNDAY);
					else if (numday==2)  v1.setTourDay(MuseumWorkingDays.TUESDAY);
					else if (numday==3)  v1.setTourDay(MuseumWorkingDays.MONDAY);
					else if(numday==4)  v1.setTourDay(MuseumWorkingDays.WEDNESDAY);
					break;
				}
				case 6:{
					System.out.println("Enter Regular Visitor's prefered Language: 1)Arabic 2)English 3)French");
					numlan=s.nextInt();
					if(numlan==1) v1.setVisitor_Language(Languages.ARABIC);
					else if(numlan==2) v1.setVisitor_Language(Languages.ENGLISH);
					else if(numlan==3) v1.setVisitor_Language(Languages.FRENCH);
					break;
				}
				case 7:{
					System.out.println("set issueDate: ");
					v1.setIssueDate(Date.valueOf(s.next()));
					break;
				}
				case 8:{
					System.out.println("Enter visits count for this visitor:");
					v1.setVisits_count(s.nextInt());
					break;
				}
				case 9:{
					System.out.println("Visitor Record:");
					for(int i=0;i<v1.getVisits_count();i++) {
						VisitorRecord vr1=new VisitorRecord();
						System.out.print(i+1+")");
						System.out.println("Enter the date of the record:");
						vr1.setEnteringDate(Date.valueOf(s.next()));
						System.out.println("Enter the time of the record:");
						vr1.setEnteringTime(Time.valueOf(s.next()));
						vr.add(vr1);
					}		
					v1.setVisits(vr);
					break;
				}
				case 10:{
					System.out.println("Enter Vid");
					v1.setvId(s.nextInt());
					break;
				}
				case 11:{
					System.out.println("BookTour");
					v1.BookTour();
					break;
				}
				case 12:{
					System.out.print(v1);
					break;
				}
				case 14:{
					boolCH=false;
					break;
				}
				case 13:{
					museumOne.addVisitor(v1);
					regularVisitors.add(v1);
					break;
				}
			}
				}
			}
			else if(x==4) {
				int dd;
				System.out.println("What's the day that you want to look for?1)SUNDAY, 2)TUESDAY, 3)MONDAY , 4)WEDNESDAY");
				ArrayList <Guide> availableGuides = new ArrayList<Guide>();
				dd=s.nextInt();
				if(dd==1)        availableGuides=museumOne.getAvailableGuides(MuseumWorkingDays.SUNDAY);
				else if (dd==2)  availableGuides=museumOne.getAvailableGuides(MuseumWorkingDays.TUESDAY);
				else if (dd==3)  availableGuides=museumOne.getAvailableGuides(MuseumWorkingDays.MONDAY);
				else if(dd==4)   availableGuides=museumOne.getAvailableGuides(MuseumWorkingDays.WEDNESDAY);
							
				for(Guide guide:availableGuides) {
					System.out.println(guide);
				}
				
			}
			else if(x==5) {
				for(Guide guide: museumOne.getArrayListGuide())
					System.out.print(guide+"\n\n");
			}
			else if(x==6) {
				for(Visitor visitor: museumOne.getArrayListVisitor())
					System.out.print(visitor +"\n\n");
			}
			else if(x==7) {
				int id;
				int oneOrMulti;
				System.out.println("Enter the Senior visitor's id who you want to issue a ticket for:");
				id=s.nextInt();
				SeniorVisitor v=null;
				for(SeniorVisitor visitor:seniorVisitors) {
					if(visitor.getId()==id) v=visitor;
				}
				if(v==null) System.out.println("there is no such visitor who has this id");
				else {
				System.out.println("Enter the issue date for the ticket:");
				Date issueDateTicket=Date.valueOf(s.next());
				System.out.println("do you want a multi time or one time ticket? 1)multi time  2)one time\n");
				oneOrMulti=s.nextInt();
				if(oneOrMulti==1) {
				Ticket t=r1.issueMultiTimeTicket(v,issueDateTicket );
				t.setPrice(t.getPrice()*(1-v.getDiscountRate()));
				System.out.println(v.getName()+" id= "+v.getId()+"(issue ticket )"+ t);}
				else if(oneOrMulti==2) {
					Ticket t=r1.issueOneTimeTicket(v,issueDateTicket );
					t.setPrice(t.getPrice()*(1-v.getDiscountRate()));
					System.out.println(v.getName()+" id= "+v.getId()+"(issue ticket )"+ t);
				}
			}
		}
			else if(x==8) {
				int id;
				int oneOrMulti;
				System.out.println("Enter the regular visitor's id who you want to issue a ticket for:");
				id=s.nextInt();
				RegularVisitor v=null;
				for(RegularVisitor visitor:regularVisitors) {
					if(visitor.getId()==id) v=visitor;
				}
				if(v==null) System.out.println("there is no such visitor who has this id");
				else {
				System.out.println("Enter the issue date for the ticket:");
				Date issueDateTicket=Date.valueOf(s.next());
				System.out.println("do you want a multi time or one time ticket? 1)multi time  2)one time");
				oneOrMulti=s.nextInt();
				if(oneOrMulti==1) {
				Ticket t=r1.issueMultiTimeTicket(v,issueDateTicket );
				System.out.println(v.getName()+" id= "+v.getId()+"(issue ticket )"+ t);}
				else if(oneOrMulti==2) {
					Ticket t=r1.issueOneTimeTicket(v,issueDateTicket );
					System.out.println(v.getName()+" id= "+v.getId()+"(issue ticket )"+ t);
				}
			}
		}
			else if(x==9) {
				int id;
				Ticket t=null;
				Visitor visitor=null;
				System.out.println("Register subscription: enter the id for the visitor you want to register");
				id=s.nextInt();
				for(Visitor v: museumOne.getArrayListVisitor()) {
					if(id==v.getId()) visitor=v;
				}
				if(visitor == null) {
					System.out.println("there is no such visitor who has this id");
				}
				else {
					int oneOrMulti;
					System.out.println("you need to issue a ticket");
					System.out.println("Enter the issue date for the ticket:");
					Date issueDateTicket=Date.valueOf(s.next());
					System.out.println("do you want a multi time or one time ticket? 1)multi time  2)one time");
					oneOrMulti=s.nextInt();
					if(oneOrMulti==1) {
					t=r1.issueMultiTimeTicket(visitor,issueDateTicket );}
					else if(oneOrMulti==2) {
					t=r1.issueOneTimeTicket(visitor,issueDateTicket );
					}
					Subscription sub=r1.registerSubs(visitor, t);
					System.out.println(sub);
					subscriptions.add(sub);
				}
			}
			else if(x==10) {
				Guide guide=null;
				Visitor visitor=null;
				Ticket t;
				int d;
				System.out.println("edit subscription");
				Subscription subs=null;
				int i=0;
				System.out.println("here are all subscriptions:");
				for(Subscription sub: subscriptions) {
					System.out.println(++i +")"+sub);
				}
				System.out.println("Choose a subscription to edit:");
				d=s.nextInt();
				for(int j=1;j<=subscriptions.size();j++) {
					if(d==j) subs=subscriptions.get(j-1);
				}
				if(subs==null) {
					System.out.println("there is no subscription");
				}
				else {
					int id;
					System.out.println("do you want to change the visitor for this subscription 1)yes 2)no");
					if(s.nextInt()==1) {
						System.out.println("enter the id for the visitor you want to register -edit-");
						id=s.nextInt();
						for(Visitor v: museumOne.getArrayListVisitor()) {
							if(id==v.getId()) {visitor=v; subs.getT().setVisitor(visitor);}
						}
						if(visitor == null) {
							System.out.println("there is no such visitor who has this id");
						}
						subs=r1.ediSubs(subs, visitor, subs.getT(), subs.getG());
						System.out.println(subs);
					}
					  {
							System.out.println("do you want to change the issue date? 1)yes 2)no");
							if(s.nextInt()==1) {
								System.out.println("enetr the new issue date:");
							subs.getT().setIssueDate(Date.valueOf(s.next()));
							t=subs.getT();
							r1.ediSubs(subs, subs.getV(), t, subs.getG());
							System.out.println(subs);
							}
							 {
								int z=0;
								int chosenNum;
								System.out.println("do you want to change the guide: 1)yes 2)no");
								if(s.nextInt()==1) {
									System.out.println("here are all avaialble guides:");
									for(Guide guideG:museumOne.getAvailableGuides(subs.getV().getTourDay()))
										System.out.println(++z+") "+guideG);
									System.out.println("choose one of them");
									chosenNum=s.nextInt();
									for(int l=0;l<museumOne.getAvailableGuides(subs.getV().getTourDay()).size();l++)
										if(chosenNum==l+1) guide= museumOne.getAvailableGuides(subs.getV().getTourDay()).get(l);
									subs=r1.ediSubs(subs, subs.getV(), subs.getT(), guide);
									System.out.println(subs);
								
								}
							}
						}
				}

			}
			else if(x==11) {
				int d;
				System.out.println("delete subscription");
				Subscription subs=null;
				int i=0;
				System.out.println("here are all subscriptions:");
				for(Subscription sub: subscriptions) {
					System.out.println(++i +")"+sub);
				}
				System.out.println("Choose a subscription to delete:");
				d=s.nextInt();
				for(int j=1;j<=subscriptions.size();j++) {
					if(d==j) {subs=subscriptions.get(j-1); subscriptions.remove(j-1);}
				}
				subs=r1.deleteSub(subs);
				System.out.println("the subscription that you chose is :"+subs+" now");
			}
			else if(x==12) {
				Zexit=false;
				System.exit(0);
			}
	}*/
		
	}

		}
