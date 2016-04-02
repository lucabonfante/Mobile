package mobile;

/**
 *
 * @author lucabonfante
 */
public abstract class Mobile {

    private int dimX_S;
    private int dimY_S;
    private int dimZ_S;
    private int dimX_M;
    private int dimY_M;
    private int dimZ_M;

    public Mobile(int dimX_S, int dimY_S, int dimZ_S, int dimX_M, int dimY_M, int dimZ_M) {
        this.dimX_S = dimX_S;
        this.dimY_S = dimY_S;
        this.dimZ_S = dimZ_S;
        this.dimX_M = dimX_M;
        this.dimY_M = dimY_M;
        this.dimZ_M = dimZ_M;
    }

    @Override
    public String toString() {
        return "Mobile{" + "dimX_S=" + dimX_S + ", dimY_S=" + dimY_S + ", dimZ_S=" + dimZ_S + ", dimX_M=" + dimX_M + ", dimY_M=" + dimY_M + ", dimZ_M=" + dimZ_M + '}';
    }

    public double calcolaIngombro() {
        double ingombro = 0.0;
        ingombro = (double) this.dimX_S * this.dimY_S * this.dimZ_S;
        return ingombro;
    }

}
