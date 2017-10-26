package easycalculator;

public class Wartosci {

    private int wartosc1;
    private int wartosc2;

    public Wartosci() {}

    public Wartosci(int wartosc1, int wartosc2){
        this.wartosc1 = wartosc1;
        this.wartosc2 = wartosc2;
    }

    public int getWartosc1() {
        return wartosc1;
    }

    public void setWartosc1(int wartosc1) {
        this.wartosc1 = wartosc1;
    }

    public int getWartosc2() {
        return wartosc2;
    }

    public void setWartosc2(int wartosc2) {
        this.wartosc2 = wartosc2;
    }

    public void msg(int wynik, String typ){
        System.out.println("Wynik " + typ + " to " + wynik);
    }
}
