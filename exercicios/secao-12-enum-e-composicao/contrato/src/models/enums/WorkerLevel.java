package models.enums;

public enum WorkerLevel {
    JUNIOR("JUNIOR", 1),
    MID_LEVEL("MID_LEVEL", 2),
    SENIOR("SENIOR", 3);

    private String description;
    private int value;

    WorkerLevel(String description, int value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }
}