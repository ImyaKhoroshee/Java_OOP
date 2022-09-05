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
