import java.util.List;

/**
 * Класс Разбойник
 */
class Robber extends BaseHero  {            // Robber это наследник BaseHero

    /**
     * Разбойник - основной контруктор без параметров
     */
    public Robber(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Robber";
        attack = 8;
        defence = 3;
        shoot = 0;
        damage = new Vector2(2, 4);
        crntHealth = 10;
        health = 10;
        speed = 6;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }
    
    public boolean status() {return status.equals("active");}
    
}
