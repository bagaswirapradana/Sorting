package id.bagaswirapradana.i2p;

import java.util.Comparator;

public class Comporator implements Comparator<Mahasiswa> {
    @Override
    public int compare(Mahasiswa o1, Mahasiswa o2) {
        int compareIpk = Double.compare(o2.getIpk(), o1.getIpk());
        int compareName = o1.getNama().compareTo(o2.getNama());
        int compareNim = o1.getNim().compareTo(o2.getNim());

        if (compareIpk == 0) {
            return compareName;
        } else if (compareName == 0) {
            return compareNim;
        } else {
            return compareIpk;
        }
    }
}
