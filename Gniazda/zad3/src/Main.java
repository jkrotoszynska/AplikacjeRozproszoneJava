import java.net.*;
public class Main
{
    public static void main(String args[])
    {
        if (args.length < 1){
            System.out.println("Wywołanie programu: Main nazwa_hosta");
            System.exit(0);
        }
        String host = args[0];
        InetAddress inetAddress = null;
        try{
            inetAddress = InetAddress.getByName(host);
        }
        catch(UnknownHostException e){
            System.out.println(
                    "Nie można uzyskać adresu IP dla hosta " + host);
            System.exit(0);
        }
        String ip = inetAddress.getHostAddress();
        System.out.println("Adres IP komputera " + host +" to: " + ip);
    }
}
