import java.util.List;

/**
* Класс Снайпер
*/
class Sniper extends BaseHero {             // Sniper это наследник BaseHero

    /**
        * Снайпер - основной контруктор без параметров
    */
    public Sniper(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Sniper";
        attack = 12;
        defence = 10;
        shoot = 32;
        damage = new Vector2(8, 10);
        crntHealth = 15;
        health = 15;
        speed = 9;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }
    
    public boolean status() {return status.equals("active");}
    
    public void step() {
    
    }
}
