package ase.cts.lab06.proxy;

public class Main {
    public static void main(String[] args) {
        Internet isp = new InternetServiceProvider();
        Internet proxyInternet = new Proxy();

        isp.connectToURL("google.com");
        proxyInternet.connectToURL("google.com");
        System.out.println("-------------------");
        isp.connectToURL("facebook.com");
        proxyInternet.connectToURL("facebook.com");
    }
}
