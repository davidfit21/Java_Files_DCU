// Comparable and Comparator -> ordering and sorting objects
// its either final or static, not both !

class Value {

    final int value;

    public Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "" + value;
    }

    private static boolean SORT_LOWER = true;
}