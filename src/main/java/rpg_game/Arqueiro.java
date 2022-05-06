package rpg_game;

public class Arqueiro extends Personagem {
    public Arqueiro(){
        this.setForca(5);
        this.setAgilidade(10);
        this.setInteligencia(2);
    }
    
    public void lvlUp(){
        int level = this.getLevel();
        this.setLevel(level+1);
        
        int forca = this.getForca();
        this.setForca(forca+1);
        
        int agilidade = this.getAgilidade();
        this.setAgilidade(agilidade+3);
        
        int inteligencia = this.getInteligencia();
        this.setInteligencia(inteligencia+1);
    }
}
