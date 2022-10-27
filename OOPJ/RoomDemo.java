import java.util.Scanner;

class Room{
    private int h;
    private int w;
    private int b;

    void getDetailes(int h,int w,int b){
        this.h = h;
        this.w = w;
        this.b = b;
    }

    void volume(){
        int v = h*w*b;
        System.out.println("volume of room= "+v);
    }
}


public class RoomDemo {
    public static void main(String[] args) {
        Room vi = new Room();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int x= sc.nextInt();
        System.out.println("Enter Width");
        int y= sc.nextInt();
        System.out.println("Enter breath");
        int z= sc.nextInt();
        vi.getDetailes(x,y,z);
        vi.volume();
    }
}
