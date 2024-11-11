public class Client {
    private String name;
    public Comanda[] comanda;
    private int nrComenzi;
    public Client(String name){
        this.name = name;
    }
    public Client(String name, Comanda[] comanda) {
        this.name = name;
        this.comanda = comanda;
    }
    public String getName() {
        return name;
    }
    public void getComanda() {
        for(Comanda c: comanda){
            c.getPreparate();
        }
    }

    public int getTotalComanda() {
        int total = 0;
        for(int i = 0; i < nrComenzi; i++){
            total += comanda[i].getPret();
        }
        return total;
    }

    public void adaugaComanda(Comanda c) {
        if(nrComenzi < comanda.length){
            comanda[nrComenzi++] = c;
        }else{
            System.out.println("Ati depasit numarul de comenzi maxim per persoana!");
        }

    }

}
