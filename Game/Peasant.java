import java.util.List;

/**
* Класс Крестьянин
*/
class Peasant extends BaseHero {            // Peasant это наследник BaseHero

    /**
        * Крестьянин - осной контруктор без параметров
    */
    public Peasant(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Peasant";
        attack = 1;
        defence = 1;
        shoot = 0;
        damage = new Vector2(1, 1);
        crntHealth = 1;
        health = 1;
        speed = 3;
        delivery = true;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }
    
    public boolean status() {return status.equals("active");}
    
    public void step() {
    
    }
}
