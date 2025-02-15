interface SafetyRegulation {
    public int getMaxItemsPermitted();
}

abstract class Item implements SafetyRegulation {
}

class Duck extends Item {
    private static final int MaxItemsPermitted = 5;
    public int getMaxItemsPermitted() {
        return MaxItemsPermitted;
    }
}

class Swan extends Item {
    private static final int MaxItemsPermitted = 2;
    public int getMaxItemsPermitted() {
        return MaxItemsPermitted;
    }
}

class Flamingo extends Item {
    private static final int MaxItemsPermitted = 3;
    public int getMaxItemsPermitted() {
        return MaxItemsPermitted;
    }
}

class Dog extends Item {
    private static final int MaxItemsPermitted = 20;
    public int getMaxItemsPermitted() {
        return MaxItemsPermitted;
    }
}

class Cat extends Item {
    private static final int MaxItemsPermitted = 20;
    public int getMaxItemsPermitted() {
        return MaxItemsPermitted;
    }
}

class AnimalFactory<T extends Item & SafetyRegulation> {
    private int unitsProduced;

    AnimalFactory () {
        this.unitsProduced = 0;
    }

    public T continueProduction(T item) {

        if (unitsProduced < item.getMaxItemsPermitted()) {
            this.unitsProduced += 1;
            return item;
        }
        else {
            return null;
        }
    }

    public int getCount() {
        return this.unitsProduced;
    }

    public static void main(String[] args) {
        AnimalFactory<Duck> AF_D = new AnimalFactory<>();
        while(AF_D.continueProduction(new Duck()) != null);
        System.out.println("Total Ducks produced: " + AF_D.getCount());

        AnimalFactory<Swan> AF_S = new AnimalFactory<>();
        while(AF_S.continueProduction(new Swan()) != null);
        System.out.println("Total Swans produced: " + AF_S.getCount());

        AnimalFactory<Flamingo> AF_F = new AnimalFactory<>();
        while(AF_F.continueProduction(new Flamingo()) != null);
        System.out.println("Total Flamingos produced: " + AF_F.getCount());

        AnimalFactory<Dog> AF_G = new AnimalFactory<>();
        while(AF_G.continueProduction(new Dog()) != null);
        System.out.println("Total Dogs produced: " + AF_G.getCount());

        AnimalFactory<Cat> AF_C = new AnimalFactory<>();
        while(AF_C.continueProduction(new Cat()) != null);
        System.out.println("Total Cats produced: " + AF_C.getCount());

    }
}