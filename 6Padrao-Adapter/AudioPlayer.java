public class AudioPlayer {
    public static void main(String[] args) {

        WmaPlay wmaPlay = new WmaPlay();
        WmaPlayAdapter adapter = new WmaPlayAdapter(wmaPlay);

        adapter.abrir("musica.wma");
        adapter.reproduzir();


        System.out.println("\nParando reprodução:");
        adapter.parar();
    }
}
