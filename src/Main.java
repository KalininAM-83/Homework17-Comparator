import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 3.5, "Gold", 1999);
        Coin coin2 = new Coin(5, 2.5, "Gold", 1999);
        Coin coin3 = new Coin(10, 2.5, "Gold", 1990);
        Coin coin4 = new Coin(50, 5, "Olov", 1899);
        Coin coin5 = new Coin(5, 10, "Silver", 1869);
        Coin coin6 = new Coin(5, 10, "Bronze", 1869);

        Set<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }

                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                return 1;
            }
        });

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);

        System.out.println("\nСортируем монеты по металлу (от Z до A), по номиналу (от большего к меньшему), по диаметру" +
                "(от меньшего к большему):");
        for (Coin coin : coins) {
            System.out.println(coin);
        }

        Set<Coin> coins1 = new TreeSet<>(new SortByDiameterComparator());
        coins1.add(coin1);
        coins1.add(coin2);
        coins1.add(coin3);
        coins1.add(coin4);
        coins1.add(coin5);
        coins1.add(coin6);

        System.out.println("\nСортируем монеты по диаметру от большего к меньшему:");
        for (Coin coin : coins1) {
            System.out.println(coin);
        }

        Set<Coin> coins2 = new TreeSet<>(new SortByYearComparator());
        coins2.add(coin1);
        coins2.add(coin2);
        coins2.add(coin3);
        coins2.add(coin4);
        coins2.add(coin5);
        coins2.add(coin6);

        System.out.println("\nСортируем монеты по году выпуска от меньшего к большему:");
        for (Coin coin : coins2) {
            System.out.println(coin);
        }

        Set<Coin> coins3 = new TreeSet<>(new SortByMetallComparator());
        coins3.add(coin1);
        coins3.add(coin2);
        coins3.add(coin3);
        coins3.add(coin4);
        coins3.add(coin5);
        coins3.add(coin6);

        System.out.println("\nСортируем монеты по металлу от A до Z:");
        for (Coin coin : coins3) {
            System.out.println(coin);
        }

        Set<Coin> coins4 = new TreeSet<>(new SortByNominalComparator());
        coins4.add(coin1);
        coins4.add(coin2);
        coins4.add(coin3);
        coins4.add(coin4);
        coins4.add(coin5);
        coins4.add(coin6);

        System.out.println("\nСортируем монеты по номиналу от меньшего к большему:");
        for (Coin coin : coins4) {
            System.out.println(coin);
        }
    }
}
