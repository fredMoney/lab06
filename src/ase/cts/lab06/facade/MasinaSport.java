package ase.cts.lab06.facade;

public class MasinaSport implements Automobil {
    String eleron;

    @Override
    public void getDescriere() {
        System.out.println("Masina sport.");
    }
}
