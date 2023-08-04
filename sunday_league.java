import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class League{
    private String code, name;
    private int match, score, mark;

    League(){}
    League(String code, String name, int match, int score, int mark){
        this.code = code;
        this.name = name;
        this.match = match;
        this.score = score;
        this.mark = mark;
    }

    public String getName(){
        return this.name;
    }

    public void setMatch(int match){
        this.match = match;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void setMark(int mark){
        this.mark = mark;
    }

    public int getMatch(){
        return this.match;
    }

    public int getScore(){
        return this.score;
    }

    public int getMark(){
        return this.mark;
    }

    public void print(int i){
        String ans ="#" + (i+1) + " " + this.code + " " + this.name + " " + this.match + " " + this.score + " " + this.mark + "\n------------------";
        System.out.println(ans);
    }
}

public class sunday_league {
    public static League find(League[] arr, String s){
        League tmp = new League();
        for(League x : arr){
            if(x.getName().equals(s)){
                return x;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        League[] arr = new League[20];
        for(int i=0; i<20; ++i){
            String trash = scn.nextLine();
            String code = scn.nextLine();
            String name = scn.nextLine();
            int match = scn.nextInt();
            int score = scn.nextInt();
            int mark = scn.nextInt();
            scn.nextLine();
            trash = scn.nextLine();
            arr[i] = new League(code, name , match, score, mark);
        }

        int t = 10;
        while(t-- > 0){
            String s = scn.nextLine();
            String[] arrStr = s.split("\\s+");
            int pos = 0;
            for(int i = 0; i<arrStr.length; ++i){
                if(arrStr[i].equals("-")){
                    pos = i;
                    break;
                }
            }

            String team1 = "", team2 = "";
            for(int i=0; i<pos-1; ++i){
                team1 += arrStr[i] + " ";
            }
            team1 = team1.substring(0, team1.length() - 1);
            for(int i= pos + 2; i < arrStr.length; ++i ){
                team2 += arrStr[i] + " ";
            }
            team2 = team2.substring(0, team2.length() - 1);

            int t1 = Integer.parseInt(arrStr[pos - 1]);
            int t2 = Integer.parseInt(arrStr[pos + 1]);

            League o1 = find(arr, team1);
            League o2 = find(arr, team2);

            o1.setMatch(o1.getMatch() + 1);
            o1.setScore(o1.getScore() + t1 - t2);
            if(t1 > t2){
                o1.setMark(o1.getMark() + 3);
            }
            else if(t1 == t2){
                o1.setMark(o1.getMark() + 1);
            }

            o2.setMatch(o2.getMatch() + 1);
            o2.setScore(o2.getScore() + t2 - t1);
            if(t2 > t1){
                o2.setMark(o2.getMark() + 3);
            }
            else if(t1 == t2){
                o2.setMark(o2.getMark() + 1);
            }

        }

        Arrays.sort(arr, new Comparator<League>(){
            @Override
            public int compare(League o1, League o2){
                if(o1.getMark() != o2.getMark()){
                    if(o1.getMark() > o2.getMark()) return -1;
                    else return 1;
                }
                else{
                    if(o1.getScore() > o2.getScore()){
                        return -1;
                    }
                    else return 1;
                }
            }
        });

        for(int i=0; i<20; ++i){
            arr[i].print(i);
        }
        scn.close();
    }
}
