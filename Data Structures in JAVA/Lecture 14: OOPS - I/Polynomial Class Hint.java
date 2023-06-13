package accessmodifier;

public class Student
{
    private int data[];
    private int nextIndex;

    Student()
    {
        data = new int[5];
        nextIndex = 0;
    }
    public void setCoefficient(int deg, int value)
    {
        data[deg] = value;
    }

    public void print()
    {
        for(int i = 0; i < data.length; i++)
        {
            if(data[i] != 0)
            {
                System.out.print(data[i] + "x^" + i + " + ");
            }
        }
        System.out.println();
    }

    public void add(Student s)
    {
        for(int i = 0; i < data.length; i++)
        {
            if(s.data[i] != 0)
            {
                this.data[i] = this.data[i] + s.data[i];
            }
        }
    }

    public void multiply(Student s)
    {
        for(int i = 0; i < this.data.length; i++)
        {
            if(s.data[i] != 0)
            {
                this.data[i] = this.data[i] * s.data[i];
            }
        }
    }

    public static Student add(Student s1, Student s2)
    {
        Student s3 = new Student();
        for(int i = 0; i < s1.data.length && i < s2.data.length; i++)
        {
            if(s1.data[i] != 0 || s2.data[i] != 0)
            {
                 s3.data[i] = s1.data[i] + s2.data[i];
            }
        }
        return s3;
    }

    public int evaluate(int num)
    {
        int sum = 0;
        for(int i = 0; i < this.data.length; i++)
        {
            if(this.data[i] != 0)
            {
                sum = sum + (int)(data[i] * Math.pow(num, i));
            }
        }
        return sum;
    }
}

class StudentUse
{
    public static void main(String[] args)
    {
        //part 1
        Student s1 = new Student();
        s1.setCoefficient(0, 3);
        s1.setCoefficient(2, 2);
        s1.print();

        //part 2
        Student s2 = new Student();
        s2.setCoefficient(0, 3);
        s2.setCoefficient(2, 2);
        s2.setCoefficient(1, 4);
        s2.setCoefficient(2, 5);
        s2.print();

        //part 3
        s1.add(s2);
        s1.print();
        s2.print();

        //part 4
        s2.multiply(s1);
        s2.print();
        s1.print();

        //part 5
        Student s3 = Student.add(s1, s2);
        s3.print();
        s1.print();
        s2.print();

        //part 6
        System.out.println(s2.evaluate(10));
    }
}
