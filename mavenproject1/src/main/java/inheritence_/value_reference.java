package inheritence_;

import java.awt.*;

public class value_reference {
    public void main()
    {
        int x=10;
        int y=x;
        x=20;
        System.out.println(y);
        Point p1=new Point(1,2);
        Point p2=p1;
        p1.x=10;
        System.out.println(p2.x);
    }
}
