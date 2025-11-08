package models;

public class OutsorcedEmployee extends Employee {

    Double additionalCharge;

    public OutsorcedEmployee() {
        super();
    }

    public OutsorcedEmployee(String name, int hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge * 1.1;
    }

    @Override
    public String toString() {
        return name + " - $ " + String.format("%.2f", payment());
    }
}