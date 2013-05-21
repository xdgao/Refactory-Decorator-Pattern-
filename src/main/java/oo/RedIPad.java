package oo;

public class RedIPad extends BlackIPad {

    private IPad iPad;

    public RedIPad(IPad iPad) {
        this.iPad = iPad;
    }

    public int getPrice() {
        return super.getPrice() + 400;
    }
}
