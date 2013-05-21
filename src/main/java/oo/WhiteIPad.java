package oo;

public class WhiteIPad implements IPad {

    private IPad iPad;

    public WhiteIPad(IPad iPad) {
        this.iPad = iPad;
    }

    public int getPrice() {
        return iPad.getPrice() + 200;
    }
}
