package Modelo;

import java.io.Serializable;

public class Key extends Personagem implements Serializable {


    public Key(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.isKey = true;
        this.whatIsIt = "Key";
    }
    public void autoDesenho(){
        super.autoDesenho();
    }


}
