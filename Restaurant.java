public class Restaurant {
    public static void main(String[] args) {
        Produs[] preparat = new Produs[4];
        preparat[0] = new Preparate("Paste carbonara", 25.0, "Paste");
        preparat[1] = new Preparate("Pizza Canibale", 30.0, "Pizza");
        preparat[2] = new Preparate("Cheesecake", 20.0, "Desert");
        preparat[3] = new Preparate("Limonada", 15.0, "Racoritoare");

        Client client1 = new Client("Pop Mihai");
        Client client2 = new Client("Popescu Mihaela");

        Comanda c1 = new Comanda((Preparate) preparat[1], "In asteptare");
        Comanda c2 = new Comanda((Preparate) preparat[2], "In asteptare");
        Comanda c3 = new Comanda((Preparate) preparat[3], "Livrat");
        Comanda c4 = new Comanda((Preparate) preparat[0], "In livrare");

        client1.comanda = new Comanda[5];
        client2.comanda = new Comanda[5];

        client1.adaugaComanda(c1);
        client1.adaugaComanda(c2);
        client2.adaugaComanda(c4);
        client2.adaugaComanda(c3);

        System.out.println("Toate preparatele din restaurant: ");
        for(Produs i: preparat){
            System.out.println(i.getNume() + "=> " + i.getTip());
        }

        Comanda[] comenzi = {c1, c2, c3, c4};
        for(Comanda c: comenzi){
            if(!c.getStatusLivrare().equals("Livrat")){
                c.getPreparate();
            }
        }

        System.out.println("Suma total platita de fiecare client este: ");
        Client[] clients = {client1, client2};
        for(Client c: clients){
            System.out.println(c.getName() + ": " + c.getTotalComanda());
        }


    }
}
