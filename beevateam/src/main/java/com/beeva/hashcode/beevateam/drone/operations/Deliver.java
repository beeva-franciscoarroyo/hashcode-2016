package com.beeva.hashcode.beevateam.drone.operations;

public class Deliver implements Operation{

    int drone;

    String tag = "D";

    int costumerOrder;

    int productType;

    int numItems;

    public Deliver(int drone, int costumer, int productType, int numItems) {
        this.drone = drone;
        this.costumerOrder = costumer;
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

    public int getCostumerOrder() {
        return costumerOrder;
    }

    public void setCostumerOrder(int costumerOrder) {
        this.costumerOrder = costumerOrder;
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
                .append(costumerOrder).append(" ")
                .append(productType).append(" ")
                .append(numItems).toString();
    }

    public static void main(String args[]) {
        Deliver deliver = new Deliver(0, 1, 2, 3);

        System.out.println(deliver.getOperation());
    }
}
