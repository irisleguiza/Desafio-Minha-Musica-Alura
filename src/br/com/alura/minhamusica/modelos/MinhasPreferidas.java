package br.com.alura.minhamusica.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClasificacao()>=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" + " é preferido por todos");

        }else{
            System.out.println(audio.getTitulo() + " também é um dos que tudo mundo está" + " curtiendo");
        }


    }
}
