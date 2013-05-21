package oo;

public class RedIPad extends BlackIPad {

    private IPad iPad;

    private RedIPad() {
        this.iPad = new BlackIPad();
    }

    public static RedIPad createRedIPad() {
        return new RedIPad();
    }

    public int getPrice() {
        return super.getPrice() + 400;
    }
}
