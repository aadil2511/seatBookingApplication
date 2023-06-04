package passenger.org;

import java.util.ListIterator;
import java.util.Scanner;

public class travelAgencyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelAgency ta = new TravelAgency();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1:add new passenger");
			System.out.println("2:view all passenger");
			System.out.println("3:remove passengers");
			System.out.println("4:count the number of passengers");
			System.out.println("enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			     case 1:PassengerDetails pd = new PassengerDetails();
			            System.out.println("enter the name contact source dest and seatno");
			            String name = sc.next();
			            String contact = sc.next();
			            String source = sc.next();
			            String dest = sc.next();
			            int seatNo = sc.nextInt();
			            pd.setContact(contact);
			            pd.setDest(dest);
			            pd.setName(name);
			            pd.setSeatNo(seatNo);
			            pd.setSource(source);
			            ta.addNewPassenger(pd);
			    	    break;
			     case 2:ta.getAllPassengers();
			    	    break;
			     case 3:ta.removePassenger();
			    	    break;
			     case 4:int x = ta.getPassengerCount();
			            System.out.println("now total passenger in bus "+ x);
			    	    break;
			    	    
			}
		}while(true);
	}

}
