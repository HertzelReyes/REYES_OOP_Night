
package ReyesHertzel;


public class Hertz {

    
    private String first;
    private String second;
    private int age;
    private boolean minor;

    public Hertz() {
    }

    public Hertz(String first, String second, int age, boolean minor) {
        this.first = first;
        this.second = second;
        this.age = age;
        this.minor = age < 18;
    }

    public void setSt1(String st1) {
        this.first = st1;
    }

    public void setSt2(String st2) {
        this.second = st2;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMinor(boolean minor) {
        this.minor = minor;
    }

    public String getSt1() {
        return first;
    }

    public String getSt2() {
        return second;
    }

    public int getAge() {
        return age;
    }

    public boolean isMinor() {
        return minor;
    }

    public void increaseAge() {
        age++;
        minor = age < 18;
    }

    public String toString() {
        String status = minor ? "minor" : "adult";
        return second + ", " + first + " - " + age + " - " + status;
    }
}
