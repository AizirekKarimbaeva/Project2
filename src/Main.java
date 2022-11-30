import dairy.DairyProduct;
import dairy.Kefir;
import dairy.Milk;
import dairy.Yogurt;
import meat.Fish;
import meat.Meat;
import meat.MeatProduct;
import meat.Sausage;
import shop.Product;
import wheat.Bread;
import wheat.Flour;
import wheat.Pasta;
import wheat.WheatProduct;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<WheatProduct> wheat = new ArrayList<>();
        wheat.add(new Bread("White bread", 1, "Bread Plant Ms", LocalDate.of(2021, 10, 01)));
        wheat.add(new Flour("Rye flour", 2, "Makfa", LocalDate.of(2023, 05, 05)));
        wheat.add(new Pasta("Spaghetti", 3, "Nur", LocalDate.of(2022, 11, 10)));

        List<MeatProduct> meats = new ArrayList<>();
        meats.add(new Fish("Trout", 4, "Fish world", LocalDate.of(2020, 11, 29)));
        meats.add(new Meat("Lamb meat", 5, "Al-Mag", LocalDate.of(2022, 11, 29)));
        meats.add(new Sausage("Doctor's sausage", 6, "Toiboss", LocalDate.of(2022, 11, 9)));

        ArrayList<DairyProduct> dairy = new ArrayList<>();
        dairy.add(new Kefir("Natural kefir", 1, "Milka", LocalDate.of(2022, 12, 30)));
        dairy.add(new Milk("Fresh milk", 1, "Prostokvashino", LocalDate.of(2002, 07, 03)));
        dairy.add(new Yogurt("Fruit yogurt", 1, "Chudo", LocalDate.of(2022, 05, 30)));
        List<Product> market = new ArrayList<>();
        List<Product> magazin = new ArrayList<>();
        magazin.addAll(wheat);
        magazin.addAll(meats);
        magazin.addAll(dairy);

        addProduct(dairy, market);
        addProduct(wheat, market);
        addProduct(meats, market);

        checkEveryDay(market);
        login(magazin);
    }
    public static void addProduct(List<? extends Product> newProducts, List<Product> products) {
        for (int i = 0; i < newProducts.size(); i++) {
            if (newProducts.get(i).getCompanyProduction().equals("Nur") ||
                    newProducts.get(i).getCompanyProduction().equals("Toiboss") ||
                    newProducts.get(i).getCompanyProduction().equals("Milka")) {
                if (newProducts.get(i).getDate().isAfter(LocalDate.now())) {
                    products.add(newProducts.get(i));
                } else {
                    System.out.println("Overdue");
                }
            } else {
                System.out.println("Not allowed");
            }
        }
        System.out.println(products);
    }

    public static void checkEveryDay(List<Product> products) {
        List<Product> sale = new ArrayList<>();
        for (Product product : products) {
            if (product.getDate().isBefore(LocalDate.now())) {
                products.remove(product);
            } else if (product.getDate().isBefore(LocalDate.now().plusDays(7))) {
                sale.add(product);
                products.remove(product);
            }
        }
    }

    static void login(List<Product> products) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Magazin", 1234);

        while (true) {
            for (Map.Entry<String, Integer> hashmap : map.entrySet()) {
                Scanner scanner = new Scanner(System.in);
                String login = scanner.nextLine();
                int parol = scanner.nextInt();
                if (login.equals(hashmap.getKey()) && parol == hashmap.getValue()) {
                    System.out.println(products);
                    break;
                } else {
                    System.out.println("one more time");
                }
            }
        }
    }
}















