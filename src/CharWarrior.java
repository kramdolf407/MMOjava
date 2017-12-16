import java.util.ArrayList;

public class CharWarrior extends Character {

    private int WeaponAttack;
    private int AbsorbDamage;

    public CharWarrior(int WeaponAttack, int AbsorbDamage, int id, String name, int money, ArrayList itemArray, int strength, int speed, int health) {
        super(id, name, money, itemArray, strength, speed, health);
        this.WeaponAttack = WeaponAttack;
        this.AbsorbDamage = AbsorbDamage;
    }

    public int getWeaponAttack() {
        return WeaponAttack;
    }

    public void setWeaponAttack(int weaponAttack) {
        WeaponAttack = weaponAttack;
    }

    public int getAbsorbDamage() {
        return AbsorbDamage;
    }

    public void setAbsorbDamage(int absorbDamage) {
        AbsorbDamage = absorbDamage;
    }
}

