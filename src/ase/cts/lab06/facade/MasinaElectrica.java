package ase.cts.lab06.facade;

public class MasinaElectrica implements Automobil {
    String incarcator;

    @Override
    public void getDescriere() {
        System.out.println("Masina electrica.");
    }
}
