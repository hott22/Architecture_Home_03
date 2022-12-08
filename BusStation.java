package home4;

public class BusStation {
    TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider) {
        this.ticketProvider = ticketProvider;
    }

    public void checkTicket(String qrcode){
        try {
            if (ticketProvider.checkTicket(qrcode)){
                System.out.println("Проходите");
            }
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }




    //TODO: 1. Доработать приложение (BusStation)
    //TODO: 2. Опишите контракты для любого модуля, например, TicketProvider.
}
