package easycalculator;

public class Main {
    public static void main(String[] args){
        Wartosci wartosci = new Wartosci();
        wartosci.setWartosc1(10);
        wartosci.setWartosc2(2);

        Mnozenie mnozenie = new Mnozenie(10, 2);

        wartosci.msg(mnozenie.mnozenieLiczb(), mnozenie.typ());
    }
}
