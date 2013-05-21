package oo;

public class RedIPad extends BlackIPad {

    private IPad iPad;

    private RedIPad(IPad iPad) {
        this.iPad = iPad;
    }

    public static RedIPad createRedIPad() {
        return new RedIPad(new BlackIPad());
    }

    public int getPrice() {
        return super.getPrice() + 400;
    }
}
