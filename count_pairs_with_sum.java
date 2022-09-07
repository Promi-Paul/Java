import java.util.*;
public class COUNT_PAIRS_WITH_SUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,c=0;
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("enter sum");
        int k=sc.nextInt();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(i=0;i<n;i++){
            if(hm.containsKey(k-a[i]))
                c=c+hm.get(k-a[i]);
            if(hm.containsKey(a[i]))
                hm.put(a[i],hm.get(a[i])+1);
            else
                hm.put(a[i],1);
        }
        System.out.println(c);
    }
}
