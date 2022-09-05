import java.util.List;

/**
* Класс Копейщик
*/
class Spearsman extends BaseHero {              // Spearsman это наследник BaseHero

    /**
        * Копейщик - основной контруктор без параметров
    */
    public Spearsman(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Spearsman";
        attack = 4;
        defence = 5;
        shoot = 0;
        damage = new Vector2(1, 3);
        crntHealth = 10;
        health = 10;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }
    
    public boolean status() {return status.equals("active");}
    
    public void step() {
    
    }
    
}
