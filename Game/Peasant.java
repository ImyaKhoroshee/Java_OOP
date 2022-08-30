/**
* Класс Крестьянин
*/
class Peasant extends BaseHero {            // Peasant это наследник BaseHero

    /**
        * Крестьянин - осной контруктор без параметров
    */
    public Peasant() {

        super.setName("Vasya");
        super.setAttack(1);
        super.setDefence(1);
        super.setShoot(0);
        super.setDamage(0, 1); 
        super.setHealth(1);
        super.setSpeed(3);
        super.setDelivery(true);
        super.setMagic(false);
    }
    /**
     * Крестьянин - доп контруктор с параментом имя и скорость
     */
    public Peasant(String name, int speed) {
        super.setName(name);
        super.setSpeed(speed);
    }

    /**
     * Крестьянин - доп контруктор с параментом защита и атака
     */
    public Peasant(int defence, int attack) {
        super.setDefence(defence);
        super.setAttack(attack);
    }
    
    @Override
    public float hit() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getHit(float damage) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean status() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean changePosition() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String returnCondition() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
