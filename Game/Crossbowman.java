import java.util.List;

/**
* Класс Арбалетчик
*/
class Crossbowman extends BaseHero {        // Crossbowman это наследник BaseHero

    /**
        * Арбалетчик - основной контруктор без параметров
    */
    public Crossbowman(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Crossbowman";
        attack = 6;
        defence = 3;
        shoot = 16;
        damage = new Vector2(2, 3);
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
        boolean insideFlag = false;
        for (BaseHero basehero : super.list) {
            if (basehero.name.equals("Peasant")) {
                insideFlag = true;
            }
            if (insideFlag) {
                shoot++;
            }
        }
    }
}
