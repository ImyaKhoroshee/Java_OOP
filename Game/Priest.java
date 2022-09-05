import java.util.List;
import java.util.Random;

/**
* Класс Монах
*/
class Priest extends BaseHero  {            // Priest это наследник BaseHero

    /**
        * Монах - основной контруктор без параметров
    */
    public Priest(List<BaseHero> side, int x, int y) {

        super(side);
        name = "Priest";
        attack = 6;
        defence = 3;
        shoot = 16;
        damage = new Vector2(-4, -4);
        crntHealth = 30;
        health = 30;
        speed = 4;
        delivery = false;
        magic = false;
        status = "stand";
        position = new Vector2(x, y);
    }
    
    public boolean status() {return status.equals("active");}
    
    @Override
    public void step() {
        int i = new Random().nextInt(super.list.size());
        BaseHero p = super.list.get(i);
        if (!p.status.equals("Die.")){
            super.list.get(i).crntHealth -= damage.x;
            if (super.list.get(i).crntHealth >= super.list.get(i).health) {
                super.list.get(i).crntHealth = super.list.get(i).health;
            }
        }
    }
}
