package com.beeva.hashcode.beevateam.drone.operations;

/**
 * Created by franciscoarroyo on 11/02/16.
 */
public class Wait  implements Operation{

    int drone;

    String TAG = "W";

    int numTurnsWait;

    public Wait(int drone, int numTurnsWait) {
        this.drone = drone;
        this.numTurnsWait = numTurnsWait;
    }

    public int getDrone() {
        return drone;
    }

    public void setDrone(int drone) {
        this.drone = drone;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public int getNumTurnsWait() {
        return numTurnsWait;
    }

    public void setNumTurnsWait(int numTurnsWait) {
        this.numTurnsWait = numTurnsWait;
    }

    @Override
    public String getOperation() {
        return new StringBuilder()
                .append(drone).append(" ")
                .append(TAG).append(" ")
                .append(numTurnsWait).toString();
    }

    public static void main(String args[]) {
        Wait wait = new Wait(0, 1);

        System.out.println(wait.getOperation());
    }
}
