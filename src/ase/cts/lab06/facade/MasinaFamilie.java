package ase.cts.lab06.facade;

public class MasinaFamilie implements Automobil {
    String scaunCopil;

    @Override
    public void getDescriere() {
        System.out.println("Masina de familie.");
    }
}
