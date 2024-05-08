public class WmaPlayAdapter implements FormatoAudio{
    WmaPlay wmaPlay;
    
    public WmaPlayAdapter(WmaPlay wmaPlay){
        this.wmaPlay = wmaPlay;
    }

    @Override
    public void abrir(String nomeMusica) {
        wmaPlay.setFile(nomeMusica);
        wmaPlay.open();
        wmaPlay.setLocation(0);
    }

    @Override
    public void reproduzir() {
        wmaPlay.play();
    }

    @Override
    public void parar() {
        wmaPlay.stop();
    }
}
