package PoraTask;

public class MainPora {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMapas = new Mapas<>();
        dnsMapas.ideti(DnsProvider.GOOGLE, new DnsServer("10.10.11.1", "10.10.15.2"));
        dnsMapas.ideti(DnsProvider.CLOUDFLARE, new DnsServer("20.20.20.20", "20.20.30.10"));

        Mapas<String, String> stringMapas = new Mapas<>();
        stringMapas.ideti("Labas", "Hello");
        stringMapas.ideti("Pasaulis", "World");

        System.out.println("Google DNS: " + dnsMapas.gauti(DnsProvider.GOOGLE));

        System.out.println(stringMapas.gauti("Labas"));

        System.out.println("Cloudflare DNS: " + dnsMapas.gauti(DnsProvider.CLOUDFLARE));

        System.out.println(stringMapas.gauti("Pasaulis"));
    }

}
