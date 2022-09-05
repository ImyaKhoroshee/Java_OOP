import java.util.List;

/**
 * Класс Колдун
 */
class Magician extends BaseHero { // Magician это наследник BaseHero

    /**
     * Колдун - основной контруктор без параметров
     */
    public Magician(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Magician";
        attack = 8;
        defence = 3;
        shoot = 0;
        damage = new Vector2(-5, -5);
        crntHealth = 30;
        health = 30;
        speed = 6;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }
    
    public boolean status() {return status.equals("active");}
    
    public void step() {
    
    }
}
