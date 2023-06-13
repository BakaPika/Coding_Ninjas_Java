package accessmodifier;
import java.util.Scanner;


public class Student
{
    private int data[];
    private int nextIndex;

    public Student()
    {
        data = new int[5];
        nextIndex = 0;

    }

    public int size()
    {
        return nextIndex;
    }

    public boolean isEmpty()
    {
        return nextIndex == 0;
    }

    public int get(int i)
    {
        if(i >= nextIndex)
        {
            return -1;
        }
        return data[i];
    }

    public void set(int i, int num)
    {
        if(i > nextIndex)
        {
            return;
        }
        data[i] = num;
    }

    public int removeLast(int i)
    {
        if(nextIndex == 0)
        {
            return -1;
        }

        int temp = data[nextIndex - 1];
        data[nextIndex - 1] = 0;
        nextIndex--;
    }
    public void add(int num)
    {
        if(nextIndex == data.length)
        {
            doubleCapacity();
        }
        data[nextIndex] = num;
        nextIndex++;
    }

    private void doubleCapacity()
    {
        int temp[] = data;
        data = new  int[2 * temp.length];
        for(int i = 0; i < temp.length; i++)
        {
            data[i] = temp[i];
        }
    }

}

public class StudentUse
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Student s1 = new Student();

        for(int i = 0; i < 100; i++)
        {
            s1.add(100+i);
        }
        System.out.println(s1.size());
        System.out.println(s1.get(100));
    }
}
