package Task5;
class TransportSystem {
 void ticketPrice() {
     System.out.println("Ticket price varies depending on the type of transport.");
 }
}
class Bus extends Transport {

 void ticketPrice() {
     System.out.println("Bus ticket price: ₹50");
 }
}

class Train extends Transport {
 
 void ticketPrice() {
     System.out.println("Train ticket price: ₹150");
 }
}
public class TransportSystem {
 public static void main(String[] args) {
    
     Transport t = new Transport();
     Transport b = new Bus();
     Transport tr = new Train();

     // Method calls
     t.ticketPrice();
     b.ticketPrice();
     tr.ticketPrice();
 }
}

