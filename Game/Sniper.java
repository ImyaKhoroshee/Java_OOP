/**
* Класс Снайпер
*/
class Sniper extends BaseHero {             // Sniper это наследник BaseHero

    /**
        * Снайпер - основной контруктор без параметров
    */
    public Sniper() {

        super.setName("Dima");
        super.setAttack(12);
        super.setDefence(10);
        super.setShoot(32);
        super.setDamage(8, 10); 
        super.setHealth(15);
        super.setSpeed(9);
        super.setDelivery(false);
        super.setMagic(false);
    
    }
    /**
     * Снайпер - доп контруктор с параментом имя и скорость
     */
    public Sniper(String name, int speed) {
        super.setName(name);
        super.setSpeed(speed);
    }

    /**
     * Снайпер - доп контруктор с параментом защита и атака
     */
    public Sniper(int defence, int attack) {
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
