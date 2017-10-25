package cluster;

import file.Main;
import file.Medd;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by administrator on 09.07.17.
 */
public class Main2 {
    private static final int M = 739;
    private static final int N = 117;
    static List<SMax> smax = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Main.main();
        //simmatrix(Array.geo, 14, 14);
        simmatrix(Main.MyArrayInt, 739, 117);
/*
        for (SMax s : smax) {
            System.out.println(s.toStr() + " ");
        }*/
        //  System.out.println();


        List<Cluster> cluster = addingCluster(smax);

        for (Cluster c : cluster) {
            System.out.println(c.toString());
        }

        for (Medd e : Main.list
                ) {
            int pos;

            pos = e.getPosition();
            pos -= 2;
            System.out.println(e.getName() + " " + pos);
        }

    }

    private static List<Cluster> addingCluster(List<SMax> maxList) {

        List<Cluster> clusters = new ArrayList<>();
        List<Integer> alreadyAdded = new ArrayList<>();


        clusters.add(new Cluster(maxList.get(0)));
        int clusterNumber = 0;
        for (int i = 1; i < smax.size(); i++) {
            if (clusterNumber != smax.get(i).getIndexi()) {
                clusterNumber++;
                clusters.add(new Cluster());
            }
            if (!alreadyAdded.contains(smax.get(i).getIndexj())) {
                clusters.get(clusterNumber).listClusterSMax.add(smax.get(i));
                alreadyAdded.add(smax.get(i).getIndexj());
            }
        }

        List<Cluster> fullClusters = new ArrayList<>();
        for (Cluster cluster : clusters) {
            if (cluster.listClusterSMax.size() != 0) {
                fullClusters.add(cluster);
            }
        }

        return fullClusters;
    }


    private static int[][] simmatrix(int[][] matrix, int M, int N) {
        int matrix2[][] = matrix;
        int[][] s = new int[M][M];

        //step 1 Computation of similarity among the elements:
        //  Вычисление сходства между элементами:
        for (int i = 0; i < M; i++) {
            for (int k = i + 1; k < M; k++) {
                int sum = 0;
                for (int j = 0; j < N; j++) {

                    if (matrix2[i][j] == matrix2[k][j]) {
                        sum += 1;
                    } else {
                        sum += 0;
                    }
                }

                s[i][k] = sum;
            }
        }

        //symmetric matrix
        for (int i = 0; i < M; i++) {
            for (int j = i; j < M; j++) {
                s[j][i] = s[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            int max = s[i][0];
            int indexj = 0;
            for (int j = 0; j < M; j++) {

                if (s[i][j] >= max) {
                    max = s[i][j];
                    indexj = j;
                }
            }
            for (int j = 0; j < M; j++) {
                if (max == s[i][j]) {
                    indexj = j;
                    smax.add(new SMax(i, indexj, max));
                }
                if (j == i) {
                    smax.add(new SMax(i, j, s[i][j]));
                }
            }

        }

        //print sim array S[M][M]
        System.out.println();
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(s[i][j]);

            }
            System.out.println();
        }
        return matrix2;
    }
}