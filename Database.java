package home4;

import java.util.ArrayList;
import java.util.Collection;

public class Database {
    private static int counter;
    private final Collection<Ticket> tickets = new ArrayList<>();
    private final Collection<Customer> customers = new ArrayList<>();

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    public double getTicketAmount(){
        return 45;
    }

    /**
     * �������� ������������� ������ �� ������� ������
     * @return
     */
    public int createTicketOrder(int clientId){
        return ++counter;
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }
}
