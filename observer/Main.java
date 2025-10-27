package observer;

public class Main {

    public static void main(String[] args) {
        Guerrero guerreroAzteca = new Guerrero("Tlacloc");
        Guerrero guerreroGriego = new Guerrero("Hercules");
        Mago magoElemental = new Mago("Merlin");
        Mago magoElectrico = new Mago("Alakazam");

    Vigilante vigilante = new Vigilante("Virgilio");

    vigilante.subscribe(guerreroAzteca);
    vigilante.subscribe(guerreroGriego);
    vigilante.subscribe(magoElemental);
    vigilante.subscribe(magoElectrico);
    vigilante.activado();
}
}