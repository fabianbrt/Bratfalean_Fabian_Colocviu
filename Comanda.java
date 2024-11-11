public class Comanda {
    private String statusLivrare;
    private Preparate preparat;
    private int id;
    private static int nextId = 1;
    Comanda(Preparate preparat, String statusLivrare) {
        this.id+= nextId;
        this.statusLivrare = statusLivrare;
        this.preparat = preparat;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getStatusLivrare() {
        return statusLivrare;
    }

    public double getPret(){
        return preparat.getPret();
    }

    public void getPreparate() {
        System.out.print("Comanda " + "#" + id + ": ");
        System.out.println(preparat.nume + " (" + preparat.getTip() + ")");
    }


}
