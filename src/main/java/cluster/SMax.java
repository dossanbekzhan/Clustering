package cluster;

import file.Main;

/**
 * Created by administrator on 09.07.17.
 */
public class SMax {
    int indexi;
    int indexj;
    int value;

    public SMax(int indexi, int indexj, int value) {
        this.indexi = indexi;
        this.indexj = indexj;
        this.value = value;
    }


    public SMax(int indexi, int value) {
        this.indexi = indexi;
        this.value = value;
    }

    public SMax(int indexi) {
        this.indexi = indexi;
    }

    public int getIndexi() {
        return indexi;
    }


    public int getIndexj() {
        return indexj;
    }


    public int getValue() {
        return value;
    }


    @Override
    public String toString() {

        return "" + getIndexj() + " ["+getValue() +"]" ;

    }


    public String toStr() {
        return "[" + getIndexi() + "][" + getIndexj() + "]=" + getValue() + " ";
    }

}
