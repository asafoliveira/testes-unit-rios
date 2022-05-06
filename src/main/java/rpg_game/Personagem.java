package rpg_game;

public class Personagem {
    private int agilidade;
    private int forca;
    private int inteligencia;
    
    private int hp;
    private int mana;
    
    private int level = 1;
    
    private Bota bota;

    public int getAgilidade() {
        if(this.bota != null)
            if(this.bota.getAgilidade() > 0)
                return agilidade + this.bota.getAgilidade();
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }

    public int getForca() {
        if(this.bota != null)
            if(this.bota.getForca() > 0)
                return forca + this.bota.getForca();
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getInteligencia() {
        if(this.bota != null)
            if(this.bota.getInteligencia() > 0)
                return inteligencia + this.bota.getInteligencia();
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getHp() {
        if(this.bota != null)
           setHp(100 * (forca+this.bota.getForca()));
        else
            setHp(100*forca);
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        if(this.bota != null)
            setMana(100 * (inteligencia+this.bota.getInteligencia()));
        else
            setMana(100*inteligencia);
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public int setLevel(int level) {
        return this.level = level;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void EquiparBota(Bota bota){
        this.bota = bota;
    }
    
    public void exibirDadosInicialJogador(){
        System.out.println("***********************************");
        System.out.println("*Dados inicial do jogador*");
        System.out.println("Level inicial: " + this.getLevel());
        System.out.println("HP inicial: " + this.getHp());
        System.out.println("Mana inicial: " + this.getMana());
        System.out.println("Força inicial: " + this.getForca());
        System.out.println("Agilidade inicial: " + this.getAgilidade());
        System.out.println("Inteligencia inicial: " + this.getInteligencia());
        System.out.println("***********************************");
    }
    
    public void exibirNovosDadosJogador(){
        System.out.println("***********************************");
        System.out.println("*Novos dados do jogador*");
        System.out.println("Novo Level: " + this.getLevel());
        System.out.println("Novo HP: " + this.getHp());
        System.out.println("Novo Mana: " + this.getMana());
        System.out.println("Nova Força: " + this.getForca());
        System.out.println("Nova Agilidade: " + this.getAgilidade());
        System.out.println("Nova Inteligencia: " + this.getInteligencia());
        System.out.println("***********************************");
    }

}