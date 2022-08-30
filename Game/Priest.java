/**
* Класс Монах
*/
class Priest extends BaseHero  {            // Priest это наследник BaseHero

    /**
        * Монах - основной контруктор без параметров
    */
    public Priest() {

        super.setName("Zhenya");
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
     * Монах - доп контруктор с параментом имя и скорость
     */
    public Priest(String name, int speed) {
        super.setName(name);
        super.setSpeed(speed);
    }

    /**
     * Монах - доп контруктор с параментом защита и атака
     */
    public Priest(int defence, int attack) {
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
