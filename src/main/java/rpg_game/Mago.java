package rpg_game;

public class Mago extends Personagem {
    public Mago(){
        this.setForca(2);
        this.setAgilidade(5);
        this.setInteligencia(10);
    }
    
    public void lvlUp(){
        int level = this.getLevel();
        this.setLevel(level+1);
        
        int forca = this.getForca();
        this.setForca(forca+1);
        
        int agilidade = this.getAgilidade();
        this.setAgilidade(agilidade+1);
        
        int inteligencia = this.getInteligencia();
        this.setInteligencia(inteligencia+3);
    }
}

