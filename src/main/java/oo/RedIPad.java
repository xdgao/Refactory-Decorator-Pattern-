package oo;

public class RedIPad extends BlackIPad {

    private IPad iPad;

    public RedIPad() {
        this.iPad = new BlackIPad();
    }

    public int getPrice() {
        return super.getPrice() + 400;
    }
}
