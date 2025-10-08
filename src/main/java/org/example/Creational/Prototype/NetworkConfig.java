package org.example.Creational.Prototype;

public class NetworkConfig implements Cloneable{

    private String ipaddress;
    private  String gateway;
    private String subnetmask;
    private Boolean firewallEnabled;

    NetworkConfig(String ipaddress, String gateway, String subnetmask, boolean firewallEnabled){
        this.ipaddress = ipaddress;
        this.gateway = gateway;
        this.subnetmask = subnetmask;
        this.firewallEnabled = firewallEnabled;
    }

    @Override
    public NetworkConfig clone() {
        try {
            return (NetworkConfig) super.clone(); //Shallow copy
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("Clonning is not supported ", e);
        }
    }

    //Setters for constumization


    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public void setFirewallEnabled(Boolean firewallEnabled) {
        this.firewallEnabled = firewallEnabled;
    }

    @Override
    public String toString(){

        return "NetworkConfig : {" + "IpAdress =" +ipaddress + '\''
                + "subnetmask =" + subnetmask + '\'' +
                "Gatway =" + gateway + '\'' +
                "Firewall Enabled =" + firewallEnabled +
                "}";
    }
}
