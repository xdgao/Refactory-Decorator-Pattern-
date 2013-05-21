package oo;

public class WhiteIPad extends BlackIPad {

    private IPad iPad;

    public WhiteIPad() {
        this.iPad = new BlackIPad();
    }

    public int getPrice() {
        return super.getPrice() + 200;
    }
}
