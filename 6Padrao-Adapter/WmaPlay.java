public class WmaPlay {
    String arquivo;
    int inicio;

    public void setFile(String arquivo)
    {
        this.arquivo = arquivo;
        System.out.println("Arquivo selecionado: " + this.arquivo);
    }

    public void open(){
        System.out.println("Abrir arquivo: " + arquivo);
    }

    public void setLocation(int inicio)
    {
        this.inicio = inicio;
        System.out.println("Arquivo começando a partir dos: " + this.inicio);
    }

    public void play()
    {
        System.out.println("Reproduzindo " + arquivo + " a partir de: " + inicio);
    }

    public void stop()
    {
        System.out.println(arquivo + " Pausado");
    }

}
