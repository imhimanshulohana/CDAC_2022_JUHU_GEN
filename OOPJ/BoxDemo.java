import javax.xml.stream.events.EntityReference;
class Box{
    int h;int w;int b;

    Box()
    {
    }

    Box(int h,int w,int b){
        this.h = h;
        this.w = w;
        this.b = b;
    }

    void getvolume(){
        int v = h*w*b;
        System.out.println("volume of room= "+v);
    }

    void getarea(){
        int a = (2*(h*w)+(b*w)+(h*b));
        System.out.println("surface area of room= "+a);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box Bx = new Box(5,5,5);
        Bx.getvolume();
        Bx.getarea();
    }
}
