public class Main {
    public static void main(String[] args) {
  Boss myBoss=new Boss();
        myBoss.setHealth(600);
        myBoss.setDamage(640);
        myBoss.setDefence("heal");

            System.out.println(myBoss.getHealth());
            System.out.println(myBoss.getDamage());
            System.out.println(myBoss.getDefence());
    }
}