import java.util.*;

public class day_con_dai_nhat_cac_phan_tu_lien_ke_khac_nhau {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; ++i){
            a[i] = scn.nextInt();
        }

        long  sum = a[0], max = Long.MIN_VALUE;
        int siz = 1, indf = 0, indl = 0, maxSize = -1;
        int[] savInd = new int[2];
        for(int i=1; i<n; ++i){
            if(a[i] != a[i-1]){
                siz++;
                indl = i;
                sum+= a[i];
            }
            else{
                siz = 1;
                indf = i;
                indl = i;
                sum = a[i];
            }
            if(siz > maxSize){
                maxSize = siz;
                savInd[0] = indf;
                savInd[1] = indl;
                max = sum;
            }
            else if(siz == maxSize){
                if(sum > max){
                    savInd[0] = indf;
                    savInd[1] = indl;
                    max = sum;
                }
            }
        }
        System.out.println(savInd[1] - savInd[0] + 1);
        for(int i= savInd[0]; i <= savInd[1]; ++i){
            System.out.print(a[i] + " ");
        }
        scn.close();
    }
}
