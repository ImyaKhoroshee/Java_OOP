/**
* Класс Арбалетчик
*/
class Crossbowman extends BaseHero {        // Crossbowman это наследник BaseHero

    /**
        * Арбалетчик - основной контруктор без параметров
    */
    public Crossbowman() {

        super.setName("Kolya");         // если в абстрактном классе поля private, то в подклассе пишем super
        super.setAttack(6);
        super.setDefence(3);
        super.setShoot(16);
        super.setDamage(2, 3); 
        super.setHealth(10);
        super.setSpeed(4);
        super.setDelivery(false);
        super.setMagic(false);

    }
    /**
     * Арбалетчик - доп контруктор с параментом имя и скорость
     */
    public Crossbowman(String name, int speed) {
        super.setName(name); 
        super.setSpeed(speed);
    }
    /**
     * Арбалетчик - доп контруктор с параментом защита и атака
     */
    public Crossbowman(int defence, int attack) {
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
