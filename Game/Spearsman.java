/**
* Класс Копейщик
*/
class Spearsman extends BaseHero {              // Spearsman это наследник BaseHero

    /**
        * Копейщик - основной контруктор без параметров
    */
    public Spearsman() {

        super.setName("Mitya");
        super.setAttack(4);
        super.setDefence(5);
        super.setShoot(0);
        super.setDamage(1, 3); 
        super.setHealth(10);
        super.setSpeed(4);
        super.setDelivery(false);
        super.setMagic(false);
        
    }
    /**
     * Копейщик - доп контруктор с параментом имя и скорость
     */
    public Spearsman(String name, int speed) {
        super.setName(name); 
        super.setSpeed(speed);
    }
    /**
     * Копейщик - доп контруктор с параментом защита и атака
     */
    public Spearsman(int defence, int attack) {
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
