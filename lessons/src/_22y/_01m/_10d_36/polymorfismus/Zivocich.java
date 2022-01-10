package _22y._01m._10d_36.polymorfismus;

public abstract class Zivocich {
    String typ;

    public Zivocich(String typ) {
        this.typ = typ;
    }

    public void vypisInfo() {
        System.out.print(typ + ", ");
        vypisDelku();
    }
    public abstract void vypisDelku();
}
