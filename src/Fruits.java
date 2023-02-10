public class Fruits {

    int gram;
    String taste;

    public void setGram(int gram) {
        this.gram = gram;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public int getGram() {
        return gram;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "gram=" + gram +
                ", taste='" + taste + '\'' +
                '}';
    }

    public Fruits(int gram, String taste) {
        this.gram = gram;
        this.taste = taste;





    }
}