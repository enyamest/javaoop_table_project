package com.enyason.table;

import com.enyason.Wood;

public class Table {

    private TableDimensions tableDimensions;
    private Drawers drawers;
    private Wood wood;


    public Table(Wood wood) {
        this.wood = wood;
        tableDimensions = new TableDimensions(120, 80);
        drawers = Drawers.NONE;
    }

    public Table(Wood wood, int length, int width, Drawers drawers) {
        tableDimensions = new TableDimensions(length, width);
        this.drawers = drawers;
        this.wood = wood;
    }

    public int getArea() {
        return tableDimensions.getArea();
    }

    public TableDimensions getTableDimensions() {
        return tableDimensions;
    }

    public double getPrice() {
        double tablePrice;

        double basePrice;

        if (getArea() <= 9600) {
            basePrice = 42500;
        } else {
            int difference = getArea() - 9600;
            basePrice = (difference * 825) + 42500;
        }

        tablePrice = basePrice + wood.getWoodPrice() + drawers.getPrice();

        return tablePrice;
    }

}
