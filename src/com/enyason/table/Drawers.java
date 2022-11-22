package com.enyason.table;

public enum Drawers {
    NONE(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6);

    int value;

    Drawers(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    double getPrice() {
        if (value == 0) return 0;
        else return 2500 + ((value - 1) * 2000);
    }
}
