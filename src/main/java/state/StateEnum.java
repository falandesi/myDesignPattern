package state;

public enum StateEnum {

    GENERATE(1, "GENERATE"),
    PROCESSING(2, "PROCESSING"),
    APPLY_END_CASE(3, "APPLY_END_CASE"),
    END_CASE(4, "END_CASE");

    private int key;
    private String value;

    private StateEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
}
