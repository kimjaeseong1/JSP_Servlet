package simple;

public class SimpleBeans {
    private String name;
    private String value;

    // 액션태그로 자바빈즈를 사용하기 위함
    // 무조건 선언되어야 함
    public SimpleBeans() {
    }

    public SimpleBeans(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SimpleBeans{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
