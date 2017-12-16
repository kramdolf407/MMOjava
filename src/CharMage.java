import java.util.ArrayList;

public class CharMage extends Character {

    private int WhiteMagic;
    private int BlackMagic;
    private int AbsorbDamage;

    public CharMage(int WhiteMagic, int BlackMagic, int AbsorbDamage, int id, String name, int money, ArrayList itemArray, int strength, int speed, int health) {
        super(id, name, money, itemArray, strength, speed, health);
        this.WhiteMagic = WhiteMagic;
        this.BlackMagic = BlackMagic;
        this.AbsorbDamage = AbsorbDamage;
    }

    public int getWhiteMagic() {
        return WhiteMagic;
    }

    public void setWhiteMagic(int whiteMagic) {
        WhiteMagic = whiteMagic;
    }

    public int getBlackMagic() {
        return BlackMagic;
    }

    public void setBlackMagic(int blackMagic) {
        BlackMagic = blackMagic;
    }

    public int getAbsorbDamage() {
        return AbsorbDamage;
    }

    public void setAbsorbDamage(int absorbDamage) {
        AbsorbDamage = absorbDamage;
    }
}