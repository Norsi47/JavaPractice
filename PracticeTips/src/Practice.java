import java.util.Objects;

public class Practice {

        private final String year;
        private final int day;

    public Practice(String year, int day) {
        this.year = year;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Practice{" +
                "year='" + year + '\'' +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Practice practice = (Practice) o;
        return day == practice.day && Objects.equals(year, practice.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, day);
    }

    public String getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }
}
