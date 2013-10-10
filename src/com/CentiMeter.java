package com;

public class CentiMeter extends Length {
    public CentiMeter(int value) {
        super(value, "Centimeter");
    }

    @Override
    public Length add(Length length) {
        return new CentiMeter(this.getValue() + length.getValue());
    }

    @Override
    public Length subtract(Length length) {
        return new CentiMeter(this.getValue() - length.getValue());
    }

    @Override
    public Meter toMeter() {
        return new Meter(this.getValue()/100);
    }
}
