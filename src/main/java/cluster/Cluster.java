package cluster;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by administrator on 09.07.17.
 */
public class Cluster {
    List<SMax> listClusterSMax = new ArrayList<>();
    static int i = 0;

    public Cluster() {
    }

    public Cluster(SMax sMax) {
        listClusterSMax = new ArrayList<>();
        listClusterSMax.add(sMax);
    }

    @Override
    public String toString() {
        i++;
        return "Cluster" + i+" " + listClusterSMax;
    }


}
