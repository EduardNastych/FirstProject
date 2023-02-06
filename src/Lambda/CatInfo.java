package Lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class CatInfo {
    public static ArrayList<Cat> createThreeCats(Supplier<Cat> catSupplier) {
        ArrayList<Cat> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(catSupplier.get());
        }
        return list;
    }

    public static void changeCat(Cat cat, Consumer<Cat> catConsumer) {
        catConsumer.accept(cat);
    }

    public static void main(String[] args) {
        ArrayList<Cat> cats = createThreeCats(() -> new Cat("grey", 3, 4.5));
        System.out.println("There are " + cats);

        changeCat(cats.get(0), cat -> {
            cat.color = "red";
            cat.age = 1;
            cat.weight = 1.2;
            System.out.println("New cat: " + cat);
        });
        System.out.println("There are " + cats);
    }
}
