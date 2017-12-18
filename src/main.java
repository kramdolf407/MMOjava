public class main {
    public static void main(String[] args) {
        CharHealer healer1 = new CharHealer("PlayerHealah");
        Character myChar = healer1;
        myChar.setName("PlayerRenamed");
        Character myCharModified = (Character) myChar;
        System.out.println(myCharModified.getName());
        Account testAcc = new Account("email@email.com","mypassword");
    }
}
