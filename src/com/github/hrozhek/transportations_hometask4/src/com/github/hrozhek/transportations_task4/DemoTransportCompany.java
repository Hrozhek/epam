package com.github.hrozhek.transportations_task4;

import java.util.Date;

public class DemoTransportCompany {
    public static void main(String[] args) {

        Storage storage = new Storage(9);

        Cargo apple = new Cargo();
        apple.setName("Apple");
        storage.add(apple);

        Cargo orange = new Cargo();
        orange.setName("Orange");
        storage.add(orange);

        Cargo macBook = new Cargo();
        macBook.setName("MacBook");
        storage.add(macBook);

        Carrier pdp = new Carrier();
        pdp.setName("PDP");
        storage.add(pdp);

        Carrier defex = new Carrier();
        defex.setName("DefEx");
        storage.add(defex);

        Carrier minipigExpress = new Carrier();
        minipigExpress.setName("MinipigExpress");
        storage.add(minipigExpress);

        Transportation transportation1 = new Transportation();
        transportation1.setBillTo("Ivan ivanich");
        transportation1.setCargo(orange);
        transportation1.setCarrier(pdp);
        storage.add(transportation1);

        Transportation transportation2 = new Transportation();
        transportation2.setBillTo("mr President the 2nd");
        transportation2.setCargo(macBook);
        transportation2.setCarrier(minipigExpress);
        transportation2.setDescription("Little gift for new president");
        transportation2.setDate(new Date(108,4,7));
        storage.add(transportation2);

        Transportation transportation3 = new Transportation();
        transportation3.setBillTo("Ivan ivanich");
        transportation3.setCargo(apple);
        transportation3.setCarrier(defex);
        transportation3.setDate(new Date());
        storage.add(transportation3);


        storage.printAllCargo();
        storage.printAllCarriers();
        storage.printAllTransportations();

    }
}
