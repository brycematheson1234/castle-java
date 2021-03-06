package io.castle.client.model;

public class CastleNetwork {
    private boolean bluetooth;
    private boolean cellular;
    private String carrier;
    private boolean wifi;

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isCellular() {
        return cellular;
    }

    public void setCellular(boolean cellular) {
        this.cellular = cellular;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "CastleNetwork{" +
                "bluetooth=" + bluetooth +
                ", cellular=" + cellular +
                ", carrier='" + carrier + '\'' +
                ", wifi=" + wifi +
                '}';
    }
}
