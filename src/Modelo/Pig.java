package Modelo;

import java.io.Serializable;

public class Pig extends Personagem implements Serializable {




    public Pig(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.isPig = true;
        this.setbTransponivel(true);
    }
    public void autoDesenho(){
        super.autoDesenho();
    }





}