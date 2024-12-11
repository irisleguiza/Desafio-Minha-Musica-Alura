package br.com.alura.minhamusica.modelos;

public class Musica extends Audio {
    private String album;
    private String genero;
    private String cantor;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }
    @Override
    public int getClasificacao(){
        if(this.getTotalReproducoes()> 2000){
            return 10;
        }else{
            return 7;
        }
    }
}
