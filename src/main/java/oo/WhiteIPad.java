package oo;

public class WhiteIPad extends BlackIPad {

    private IPad iPad;

    private WhiteIPad() {
        this.iPad = new BlackIPad();
    }

    public static WhiteIPad createWhiteIPad() {
        return new WhiteIPad();
    }

    public int getPrice() {
        return super.getPrice() + 200;
    }
}
