package com;

public class Meter extends Length{
    public Meter(int value) {
        super(value, "Meter");
    }

    public Length add(Length length) {
        Meter meter = length.toMeter();
        return new Meter(this.getValue() + meter.getValue());
    }

    @Override
    public Length subtract(Length length) {
        Meter meter = length.toMeter();
        return new Meter(this.getValue() - meter.getValue());
    }

    @Override
    public Meter toMeter() {
        return this;
    }

}
