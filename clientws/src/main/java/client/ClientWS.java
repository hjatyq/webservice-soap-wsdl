package client;

import proxy.BanqueService;
import proxy.Banquews;
import proxy.Compte;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy=new Banquews().getBanqueServicePort();
        System.out.println(proxy.convertioneEuroToDH(600));
        Compte cp=proxy.getCompte(4);
        System.out.println("************************");
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println(cp.getDateCreation());
        System.out.println(cp.getCode());
        List<Compte> compteliste=proxy.listComptes();
        compteliste.forEach(c->{
            System.out.println("*****************");
            System.out.println(c.getCode());
            System.out.println(c.getDateCreation());
            System.out.println(c.getSolde());
            System.out.println("*****************");

        });
    }

}
