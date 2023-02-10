public class Banana {
String vitamin;

    public Banana(String vitamin) {
        this.vitamin = vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    public String getVitamin() {
        return vitamin;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "vitamin='" + vitamin + '\'' +
                '}';
    }
}
