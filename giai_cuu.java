import java.util.Scanner;

class Prince{
    private int power;
    private int blood;
    private boolean alive;

    Prince(int power, int blood, boolean alive){
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }

    public int getPower(){
        return this.power;
    }

    public void mushroom(){
        if(this.alive){
            this.blood -= 15;    
            this.power -= 2;
        }
        if(this.blood <= 0 || this.power <= 0){
            this.power = 0;
            this.blood = 0;
            this.alive = false;
        }

    }

    public void witch(int powerWitch){
        if(this.alive){    
            if(this.power > powerWitch){
                this.power += 5;
            }
            else{
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            }
        }
    }

    public void pea(){
        if(this.alive){
            this.blood += 10;
            this.power += 2;
        }
    }

    public void soldier(int powerSodier){
        if(this.alive){
            if(this.power > powerSodier){
                this.blood += 5;
                this.power += 7;
            }
            else{
                this.power = 0;
                this.blood = 0;
                this.alive = false;
            }
        }
    }

    @Override
    public String toString(){
        String tmp = (this.alive)? "ALIVE" : "DEAD";
        return "POWER : " + this.power
        + "\nBLOOD : " + this.blood
        + "\n" + tmp
        + "\n--------------------";

    }

}

public class giai_cuu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line1 = scn.nextLine();
        String line2 = scn.nextLine();
        String tmp1 = "", tmp2 = "";
        for(char x : line1.toCharArray()){
            if(Character.isDigit(x)) tmp1 += x;
        }
        for(char x : line2.toCharArray()){
            if(Character.isDigit(x)) tmp2 += x;
        }
        int power = Integer.parseInt(tmp1);
        int blood = Integer.parseInt(tmp2);
        String line3 = scn.nextLine();
        boolean alive = (line3.equals("ALIVE")) ? true : false;
        Prince prince = new Prince(power, blood, alive);

        int n = scn.nextInt(); scn.nextLine();
        while(n-- > 0){
            String s = scn.next();
            if(s.equals("witch")){
                int powerWitch = Integer.parseInt(scn.next());
                prince.witch(powerWitch);
                System.out.println(prince);
            }
            else if(s.equals("soldier")){
                int powerSoldier = Integer.parseInt(scn.next());
                prince.soldier(powerSoldier);
                System.out.println(prince);
            }
            else if( s.equals("mushroom")){
                prince.mushroom();
                System.out.println(prince);
            }
            else{
                prince.pea();
                System.out.println(prince);
            }
        }
        scn.close();
    }
}
