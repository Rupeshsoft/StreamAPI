package org.example;

public class NetworkConnection implements Cloneable {
    private  String ip;
    private  String data;

    public NetworkConnection(){

    }

    public String getIp() {
        return ip;
    }

    public String getData() {
        return data;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setData(String data) {
        this.data = data;
    }

    public  void  loadImportantData() throws InterruptedException {
        this.data = "Important Data"; //taking 5 min
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    protected  Object clone() throws  CloneNotSupportedException {
        return  super.clone();
    }

}
