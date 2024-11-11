class Preparate extends Produs {
    private String tipPreparat;

    public Preparate() {
        super();
        this.tipPreparat = "Nespecificat";
    }

    public Preparate(String nume, double pret, String tipPreparat) {
        super(nume, pret);
        this.tipPreparat = tipPreparat;
    }

    @Override
    public String getTip() {
        return tipPreparat;
    }

    @Override
    public String toString() {
        return "Preparate{" + "nume='" + nume + '\'' + ", pret=" + pret + ", tip='" + tipPreparat + '\'' + '}';
    }
}

