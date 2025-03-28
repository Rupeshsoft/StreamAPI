package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Create Object with Prototype Pattern!");
        NetworkConnection networkConnection =  new NetworkConnection();
        networkConnection.setIp("192.168.4.4");
        networkConnection.loadImportantData();
        System.out.println(networkConnection);
        //NetworkConnection{ip='192.168.4.4', data='Important Data'}
        //networkConnection // create clone of this networkConnection object by clonable interface or marker interface
        //from java.lang.Object.clone
        NetworkConnection networkConnection2 = null;
        NetworkConnection networkConnection3 = null;
        try {
            networkConnection2 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2); //NetworkConnection{ip='192.168.4.4', data='Important Data'}
            networkConnection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection3);
            // once first object is created rest of objects are created immediately.
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}