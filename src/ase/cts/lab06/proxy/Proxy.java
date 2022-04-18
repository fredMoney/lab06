package ase.cts.lab06.proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements Internet {
    private Internet isp = new InternetServiceProvider();
    private List<String> blacklist = new ArrayList<>();

    public Proxy() {
        blacklist.add("facebook.com");
        blacklist.add("tiktok.com");
    }

    @Override
    public void connectToURL(String url) {
        if(blacklist.contains(url.toLowerCase())) {
            System.out.println("Acces interzis la " + url + ".");
        } else {
            isp.connectToURL(url);
        }
    }
}
