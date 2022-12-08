package home4;

import java.util.Collection;
import java.util.Date;

public class Main {
    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     *
     * 5,6,7,8,10 - необязательные, опциональные задания.
     *
     * 1.  Предусловия.
     * 2.  Постусловия.
     * 3.  Инвариант.
     * 4.  Определить абстрактные и конкретные классы.
     * 5.  Определить интерфейсы.
     * 6.  Реализовать наследование.
     * 7.  Выявить компоненты.
     * 8.  Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.
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
