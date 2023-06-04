package passenger.org;
import java.util.*;

public class TravelAgency {
	Stack<PassengerDetails> s = new Stack<PassengerDetails>();
	private static int seatNo;
	
	public TravelAgency() {
		seatNo = 0;
	}
	public void addNewPassenger(PassengerDetails p) {
		++seatNo;
		p.setSeatNo(seatNo);
		s.push(p);
	}
	public void getAllPassengers() {
		ListIterator<PassengerDetails> li = s.listIterator(s.size());
		while(li.hasPrevious()) {
        	Object p = li.previous();
        	PassengerDetails obj = (PassengerDetails)p;
        	System.out.println(obj.getSeatNo()+" "+obj.getContact()+" "+obj.getDest()+" "+obj.getName()+" "+obj.getSource());;
        }
	}
	public void removePassenger() {
		boolean b = s.isEmpty();
		if(b) {
			System.out.println("no passenger remain");
		}else {
			s.pop();
		}
	}
	public int getPassengerCount() {
		return s.size();
	}
}
