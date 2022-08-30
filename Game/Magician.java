/**
 * Класс Колдун
 */
class Magician extends BaseHero { // Magician это наследник BaseHero

    /**
     * Колдун - основной контруктор без параметров
     */
    public Magician() {

        super.setName("Pasha");
        super.setAttack(8);
        super.setDefence(3);
        super.setShoot(0);
        super.setDamage(2, 4);
        super.setHealth(10);
        super.setSpeed(6);
        super.setDelivery(false);
        super.setMagic(false);

    }

    /**
     * Колдун - доп контруктор с параментом имя и скорость
     */
    public Magician(String name, int speed) {
        super.setName(name);
        super.setSpeed(speed);
    }

    /**
     * Колдун - доп контруктор с параментом защита и атака
     */
    public Magician(int defence, int attack) {
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
