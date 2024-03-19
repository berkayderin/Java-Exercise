package org.example;

import java.util.ArrayList;

/*
 * GENERİC: FARKLI TİPLERLE ÇALIŞMAMIZI SAĞLAYAN CLASSTIR.
 * TİP GÜVENLİ ÇALIŞMAK İÇİN GENERİC KULLANIRIZ.
 * */


public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("istanbul");
        sehirler.add("ankara");
        sehirler.add("izmir");

        MyList<Customer> sehirler2 = new MyList<Customer>();
        sehirler2.add(new Customer());
        sehirler2.add(new Customer());
    }
}