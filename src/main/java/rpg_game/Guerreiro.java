package rpg_game;

public class Guerreiro extends Personagem {
    public Guerreiro(){
        this.setForca(10);
        this.setAgilidade(5);
        this.setInteligencia(2);
    }
    
    public void lvlUp(){
        int level = this.getLevel();
        this.setLevel(level+1);
        
        int forca = this.getForca();
        this.setForca(forca+3);
        
        int agilidade = this.getAgilidade();
        this.setAgilidade(agilidade+1);
        
        int inteligencia = this.getInteligencia();
        this.setInteligencia(inteligencia+1);
    }
}
