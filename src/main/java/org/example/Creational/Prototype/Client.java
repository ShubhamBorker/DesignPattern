package org.example.Creational.Prototype;

public class Client {
    public static void main (String [] args){
        NetworkConfig baseConfig = new NetworkConfig("123:456:789:010","255.255.255.0","568.464.259", true);

        NetworkConfig nodeA = baseConfig.clone();
        nodeA.setIpaddress("987:686:456");
        nodeA.setFirewallEnabled(false);

        NetworkConfig nodeB = baseConfig.clone();
        nodeB.setIpaddress("645:746:584");
        nodeB.setFirewallEnabled(true);

        System.out.println("Basig Configration are "+ baseConfig);
        System.out.println("Node A =" + nodeA);
        System.out.println("Node B =" + nodeB);

    }

}
