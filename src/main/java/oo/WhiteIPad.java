package oo;

public class WhiteIPad extends BlackIPad {

    private IPad iPad;

    private WhiteIPad(IPad iPad) {
        this.iPad = iPad;
    }

    public static WhiteIPad createWhiteIPad() {
        return new WhiteIPad(new BlackIPad());
    }

    public int getPrice() {
        return super.getPrice() + 200;
    }
}
