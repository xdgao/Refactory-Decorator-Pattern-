package oo;

public class RedIPad implements IPad {

    private IPad iPad;

    public RedIPad(IPad iPad) {
        this.iPad = iPad;
    }

    public int getPrice() {
        return iPad.getPrice() + 400;
    }
}
