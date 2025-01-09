package PoraTask;

public class Pora<K, V> {
    K raktas;
    V reiksme;

    public Pora(K raktas, V reiksme) {
        this.raktas = raktas;
        this.reiksme = reiksme;
    }

    public K getRaktas() {
        return raktas;
    }

    public V getReiksme() {
        return reiksme;
    }
}
