package Behavioural.Observer;

public class Main {

    public static void main(String [] args){
        Newschannel channel = new Newschannel();

        Observer Users1 = new Users("Shubham");
        Observer Users2 = new Users("Aditi");
        Observer Users3 = new Users("Ravi");

        channel.attach(Users1);
        channel.attach(Users2);
        channel.attach(Users3);

        channel.publishedHeadLines("Breaking: New tech unveiled at Global Summit!");
        channel.detach(Users2);
        channel.publishedHeadLines("Weather Alert: Heavy rains expected tomorrow.");

    }
}
