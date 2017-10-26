package easycalculator;

public class Mnozenie extends Wartosci {

    private int a;
    private int b;

    public Mnozenie(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int mnozenieLiczb(){
        return a*b;
    }

    public String typ(){
        return "Mnozenie";
    }
}
