import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        return 1;
    }
}
