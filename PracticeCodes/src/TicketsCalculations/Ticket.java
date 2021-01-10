package TicketsCalculations;

public class Ticket{
    
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public int getTicketid(){
        return ticketid;
    }
    public void setTicketId(int ticketid){
        this.ticketid=ticketid;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public static int getAvailableTickets(){
        return availableTickets;
    }
      
    public  static boolean setAvaiableTickets(int count) {
    	  if(count>0){
    		    availableTickets = count ;
    		    }
    		    if(count<=0){
    		        return true;
    		    }
    	return false;	    
    }

    public int calculateTicketCost(int no_of_tickets) {
    if (no_of_tickets > availableTickets) return -1;
    availableTickets -= no_of_tickets;
    setAvaiableTickets(availableTickets);
    return price * no_of_tickets;
  }
}