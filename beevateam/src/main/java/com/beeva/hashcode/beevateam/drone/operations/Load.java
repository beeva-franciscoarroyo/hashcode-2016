package com.beeva.hashcode.beevateam.drone.operations;


public class Load  implements Operation{

    int drone;

    String tag = "L";

    int warehouse;

    int productType;

    int numItems;

    public Load(int drone, int warehouse, int productType, int numItems) {
        this.drone = drone;
        this.warehouse = warehouse;
        this.productType = productType;
        this.numItems = numItems;
    }

    public int getDrone() {
        return drone;
    }

    public void setDrone(int drone) {
        this.drone = drone;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(int warehouse) {
        this.warehouse = warehouse;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    @Override
    public String getOperation() {
        return new StringBuilder()
                .append(drone).append(" ")
                .append(tag).append(" ")
                .append(warehouse).append(" ")
                .append(productType).append(" ")
                .append(numItems).toString();
    }

    public static void main(String args[]) {
        Load load = new Load(0, 1, 2, 3);

        System.out.println(load.getOperation());
    }
}
