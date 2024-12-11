package br.com.alura.minhamusica.modelos;

public class Podcast extends Audio{
    private String apresentador;
    private String descripcao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescripcao() {
        return descripcao;
    }

    public void setDescripcao(String descripcao) {
        this.descripcao = descripcao;
    }

    @Override
    public int getClasificacao(){
       if(this.getTotalCurtidas()> 500){
           return 10;
       } else{
           return 8;
       }

    }
}
