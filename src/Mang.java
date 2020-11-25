import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
        int[] mang =new int[5];
        Scanner scan= new Scanner(System.in);
        System.out.println("nhap phan tu vao mang");
        for (int i=0;i<mang.length;i++){
            mang[i]=scan.nextInt();
        }
        System.out.println("mang vau nhap la");
        for (int x :mang){
            System.out.println(x);
        }
        System.out.println("vui long nhap phan tu muon tim kiem");
        int k=scan.nextInt();
        for (int i=0;i<mang.length-1;i++){
            if (mang[i]==k){
                System.out.println("vi tri cua phan tu k la " + i);
            }
        }
        for (int i=0;i<mang.length;i++){
            int m=mang[i];
            for (int j=i+1;j<mang.length;j++){
                if (m>mang[j]){
                    mang[i]=mang[j];
                    mang[j]=m;
                    m=mang[i];

                }
            }
        }
        System.out.println("mang duoc xap xep tang dan");
        for (int x:mang){
            System.out.println(x);
        }
    }
}
