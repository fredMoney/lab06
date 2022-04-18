package ase.cts.lab06.proxy;

public class InternetServiceProvider implements Internet {
    @Override
    public void connectToURL(String url) {
        System.out.println("Conectat cu succes la " + url + ".");
    }
}
