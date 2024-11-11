abstract class Produs {
    protected String nume;
    protected double pret;

    public Produs() {
        this.nume = "Produs generic";
        this.pret = 0.0;
    }

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public abstract String getTip();
}