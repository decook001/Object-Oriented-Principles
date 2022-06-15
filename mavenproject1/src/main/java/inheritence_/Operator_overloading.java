package inheritence_;

public class Operator_overloading {
    public void run()
    {
        Add();
        Add(5);
        Add(2,8);
        int [] x = new  int [10];
        Add(x);
    }

    void Add()
    {
        System.out.println("nothing");
    }

    void Add(int a)
    {
        System.out.println(a+" ");
    }

    void Add(int a, int b)
    {
        System.out.println(a+ " "+b);
    }

    void Add(int[] arr)
    {
        for(int x: arr)
        {
            System.out.print(x);
        }
        System.out.println();
    }
}
