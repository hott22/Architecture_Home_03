package home4;

import java.util.Collection;
import java.util.Date;

public class Main {
    /**
     * ����������� ��������� � ���������� ������� "������� ������ ������� �� ������� � ��� ���".
     *
     * 5,6,7,8,10 - ��������������, ������������ �������.
     *
     * 1.  �����������.
     * 2.  �����������.
     * 3.  ���������.
     * 4.  ���������� ����������� � ���������� ������.
     * 5.  ���������� ����������.
     * 6.  ����������� ������������.
     * 7.  ������� ����������.
     * 8.  ����������� ��������� ��������� ��������� ������� UML 2.0. ����� ��� �������.
     */
    public static void main(String[] args) {
        Core core = new Core(); //Backend

        MobileApp mobileApp = new MobileApp(core.getCustomerProvider(), core.getTicketProvider()); //Forntend
        mobileApp.searchTicket(new Date());
        Collection<Ticket> tickets = mobileApp.getTickets();
        mobileApp.buyTicket("1000000000001111");
        mobileApp.buyTicket("1000000000001111");
        mobileApp.buyTicket("1000000000001111");

        //System.out.println(core.getDatabase().getTickets());
        //core.getBusStation().checkTicket("q0");
        core.getBusStation().checkTicket("q3");
        core.getBusStation().checkTicket("q1");
        core.getBusStation().checkTicket("q2");
        core.getBusStation().checkTicket("q0");
        core.getBusStation().checkTicket("q4");
    }
}
