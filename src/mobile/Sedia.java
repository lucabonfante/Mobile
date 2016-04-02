package mobile;

/**
 *
 * @author lucabonfante
 */
public class Sedia extends Mobile {

    boolean braccioli;

    public Sedia(boolean braccioli, int dimX_S, int dimY_S, int dimZ_S, int dimX_M, int dimY_M, int dimZ_M) {
        super(dimX_S, dimY_S, dimZ_S, dimX_M, dimY_M, dimZ_M);
        this.braccioli = braccioli;
    }

    @Override
    public String toString() {
        return "Sedia{" + "braccioli=" + braccioli + '}';
    }

    @Override
    public double calcolaIngombro() {
        double ingombro = super.calcolaIngombro();
        return (double) (this.braccioli == true ? ingombro * (1.2) : ingombro);
    }
}
