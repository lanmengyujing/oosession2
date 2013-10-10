package com;

public abstract class Length {
    private int value;
    private String unit;

    public Length(int value, String unit) {
        this.value = value;
        this.setUnit(unit);
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (value != length.value) return false;

        return true;
    }

    public abstract Length add(Length length) ;

    public abstract Length subtract(Length length);

    public abstract Meter toMeter();

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
