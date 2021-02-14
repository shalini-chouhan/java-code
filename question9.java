class box1
{
    int length,width,depth;
    int volume;
    {
        return length*width*depth;

    }
public class question9
{
    public static void main (String args[])
    {
        box1 a=new box1();
        a.length = 10;
        a.depth = 10;
        a.width = 10;
        System.out.println(a.volume());
    }
}
