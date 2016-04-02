package mobile;

/**
 *
 * @author lucabonfante
 */
public class Tavolo extends Mobile {

    private String forma;

    public Tavolo(String forma, int dimX_S, int dimY_S, int dimZ_S, int dimX_M, int dimY_M, int dimZ_M) {
        super(dimX_S, dimY_S, dimZ_S, dimX_M, dimY_M, dimZ_M);
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Tavolo{" + "forma=" + forma + '}';
    }

    @Override
    public double calcolaIngombro() {
        double ingombro = super.calcolaIngombro();
        return ingombro;
    }
}
