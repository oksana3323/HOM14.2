public class Apple extends Orange {
String color;
String grade;
Banana banana;

    public Apple(int gram, String taste, String color, String grade, Banana banana, String color1, String grade1, Banana banana1) {
        super(gram, taste, color, grade, banana);
        this.color = color1;
        this.grade = grade1;
        this.banana = banana1;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getGrade() {
        return grade;
    }

    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public Banana getBanana() {
        return banana;
    }

    @Override
    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", grade='" + grade + '\'' +
                ", banana=" + banana +
                ", gram=" + gram +
                ", taste='" + taste + '\'' +
                '}';
    }
}
