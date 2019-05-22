package Main;

import static java.lang.Math.*;

public class Pow
{
    long result;
    int counter;

    public Pow()
    {
        this.result = 1;
    }

    public long PowRecoursive(int Number, int NumPow)
    {
        Operationable1 operation;
        operation = (x,y)->x*y;
        if(NumPow != 0)
        {
            result = operation.calculate(result, Number);
            NumPow--;
            return PowRecoursive(Number, NumPow);
        }
        return  result;
    }

    interface Operationable1{
        long calculate(long x, int y);
    }

    interface Operationable2{
        long calculate(int x, int y);
    }

    public long PowNoRecoursive(int Number, int NumPow)
    {

        return (long)pow(Number,NumPow);
    }

    public int SearchSquareNumbersR(int High, int Low)
    {
        Operationable2 operation;
        operation = (x,y)->x*y;

        if(counter <= High)

            if (counter == operation.calculate((int)(sqrt(counter)), ((int)(sqrt(counter)))))
            {
                System.out.println(sqrt(counter));
                counter++;
                return SearchSquareNumbersR(High, Low);
            }
            else
            {
                counter++;
                return SearchSquareNumbersR(High, Low);
            }
        return 0;
    }

    public int SearchSquareNumbers(int High, int Low)
    {
        Operationable2 operation;
        operation = (x,y)->x*y;

        for(int i = Low;i<=High;i++) {

            if (i == operation.calculate((int) (sqrt(i)), ((int) (sqrt(i)))))
            {
                System.out.println(sqrt(i));
            }
            else {
                i++;
            }
        }
        return 0;
    }


    long Getresult()
    {
        return result;
    }







    void SetCounter(int Counter)
    {
        counter = Counter;
    }



}
