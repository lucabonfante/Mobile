package mobile;

/**
 *
 * @author lucabonfante
 */
public class Armadio extends Mobile {

    private int nAnte;

    public Armadio(int nAnte, int dimX_S, int dimY_S, int dimZ_S, int dimX_M, int dimY_M, int dimZ_M) {
        super(dimX_S, dimY_S, dimZ_S, dimX_M, dimY_M, dimZ_M);
        this.nAnte = nAnte;
    }

    @Override
    public String toString() {
        return "Armadio{" + "nAnte=" + nAnte + '}';
    }

    @Override
    public double calcolaIngombro() {
        double ingombro = super.calcolaIngombro();
        return (double) (this.nAnte == 6 ? ingombro * (1.1) : ingombro);
    }
}
