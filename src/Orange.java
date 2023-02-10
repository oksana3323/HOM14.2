public class Orange  extends Fruits {
    String color;
    String grade;
    Banana banana;

    public Orange(int gram, String taste, String color, String grade, Banana banana) {
        super(gram, taste);
        this.color = color;
        this.grade = grade;
        this.banana = banana;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", grade='" + grade + '\'' +
                ", banana=" + banana +
                ", gram=" + gram +
                ", taste='" + taste + '\'' +
                '}';
    }
}



