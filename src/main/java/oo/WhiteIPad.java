package oo;

public class WhiteIPad extends BlackIPad {

    private IPad iPad;

    public WhiteIPad(IPad iPad) {
        this.iPad = iPad;
    }

    public int getPrice() {
        return iPad.getPrice() + 200;
    }
}
