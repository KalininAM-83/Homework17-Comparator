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
        Coin coin7 = new Coin(50, 10, "Bronze", 1969);
        Coin coin8 = new Coin(50, 10, "Silver", 1709);

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

                return o1.getYear() - o2.getYear();
            }
        });

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
        coins.add(coin7);
        coins.add(coin8);

        System.out.println("\nСортируем монеты по металлу (от Z до A), по номиналу (от большего к меньшему), по диаметру" +
                "(от меньшего к большему):");
        for (Coin coin : coins) {
            System.out.println(coin);
        }

        Set<Coin> coins1 = new TreeSet<>(new SortByComparator());
        coins1.add(coin1);
        coins1.add(coin2);
        coins1.add(coin3);
        coins1.add(coin4);
        coins1.add(coin5);
        coins1.add(coin6);
        coins1.add(coin7);
        coins1.add(coin8);

        System.out.println("\nСортируем монеты по диаметру (от большего к меньшему), году (от меньшего к большему), " +
                "металлу (по алфавиту от A до Z), по номиналу (от меньшего к большему):");
        for (Coin coin : coins1) {
            System.out.println(coin);
        }
    }
}
