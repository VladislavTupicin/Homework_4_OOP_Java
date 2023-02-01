package Father;

public class Family<T, V> {
    T f1;
    V f2;

    Family(T o1, V o2) {
        f1 = o1;
        f2 = o2;
    }

    void showTypes() {
        System.out.println("Тип Т это: " + f1.getClass().getName());
        System.out.println("Тип V это: " + f2.getClass().getName());
    }

    T getF1() {
        return f1;
    }

    V getF2() {
        return f2;
    }
}

class SimpFamily {
    public static void main(String[] args) {
        Family<Integer, String> Father;
        Father = new Family<>(54, "Андрей");

        Father.showTypes();

        System.out.println();

        int years1 = Father.getF1();
        System.out.println("Возраст: " + years1);

        String name1 = Father.getF2();
        System.out.println("Имя: " + name1);


        System.out.println();


        Family<Integer, String> Mother;
        Mother = new Family<>(45, "Женя");

        Mother.showTypes();

        System.out.println();
        
        int years2 = Mother.getF1();
        System.out.println("Возраст: " + years2);

        String name2 = Mother.getF2();
        System.out.println("Имя: " + name2);
    }
}
