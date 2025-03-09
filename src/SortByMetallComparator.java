import java.util.Comparator;

public class SortByMetallComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        if (!o1.getMetalName().equals(o2.getMetalName())) {
            return o1.getMetalName().compareTo(o2.getMetalName());
        }
        return 1;
    }
}
