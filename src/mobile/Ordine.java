package mobile;

import java.util.ArrayList;

/**
 *
 * @author lucabonfante
 */
public class Ordine {

    private ArrayList<Mobile> listaMobili = new ArrayList<>();
    private String nome;
    private String cognome;

    public Ordine(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }
    

    @Override
    public String toString() {
        return "Ordine{" + "listaMobili=" + listaMobili + ", nome=" + nome + ", cognome=" + cognome + '}';
    }

    public ArrayList<Mobile> getListaMobili() {
        return listaMobili;
    }

    public void addOrdine(Mobile mobile) {
        this.listaMobili.add(mobile);
    }

    public double calcolaIngombroScatole() {
        double ingombro = 0.0;
        for (Mobile m : this.listaMobili) {
            if (m instanceof Sedia)     // calcola ingombro sedie
                ingombro += m.calcolaIngombro();
            //ingombro += m.calcolaIngombro();  calcola ingombro totale
        }
        return (double) ingombro;
    }

    public static void main(String[] args) {
        Ordine ordine1 = new Ordine("Mario", "Rossi");
        Sedia sedia1 = new Sedia(true, 50, 50, 50, 80, 50, 20);
        Armadio armadio1 = new Armadio(6, 50, 50, 50, 80, 50, 20);
        Tavolo tavolo1 = new Tavolo("Rotondo", 50, 50, 50, 80, 50, 20);

        ordine1.addOrdine(sedia1);
        ordine1.addOrdine(armadio1);
        ordine1.addOrdine(tavolo1);

        System.out.println("Le scatole occupano: " + ordine1.calcolaIngombroScatole() + " mq");
        System.out.println(ordine1.toString());
        
    }

}
