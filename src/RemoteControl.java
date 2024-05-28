public class RemoteControl implements Controller{
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Sobrescrever Metodos
    public void ligar() {
        this.setLigado(true);
    }
    public void desligar() {
        this.setLigado(false);
    }
    public void abrirMenu() {
        System.out.println("----MENU----");
        System.out.println("Esta Liagdo? "+getLigado());
        System.out.print("Esta Tocando? "+getVolume());
        for (int i=0; i<=this.getVolume(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }  else {
            System.out.println("Impossivel Aumentar Volume!");
        }
    }
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel Diminuir Volume!");
        }
    }
    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else{
            System.out.println("Não Consegui Reproduzir!");
        }

    }
    public void pause(){
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não Consegui Pausar!");
        }
    }

    // Metodos Especiais
    public RemoteControl() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }
}
