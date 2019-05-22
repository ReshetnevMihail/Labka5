package Main;

import java.util.Scanner;

public class Company
{
    public Employee[] obj ;
    String NameOfCompany;
    String Tasks;
    double Budget;

    public Company()
    {
        Budget = 100000;
        obj = new Employee[100];
    }

    Company(String nameOfcompany, String task, double buget)
    {
        NameOfCompany = nameOfcompany;
        Tasks = task;
        Budget = buget;
    }

    void inpCompany()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите название компании: ");
        NameOfCompany = in.nextLine();
        System.out.print("Введите задачу компании: ");
        Tasks = in.nextLine();
        System.out.print("Введите бюджет компании: ");
        Budget = in.nextDouble();
    }

    public void addEmploee(int i)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя сотрудника: ");
        obj[i].SetEmpName(in.nextLine());
        System.out.print("Введите зарплату сотрудника: ");
        obj[i].SetEmpMoney(in.nextDouble());
    }

    public double addBuget()
    {
        int i,j;
        ExceptionClass objOfExceptionClass = new ExceptionClass();
        if(objOfExceptionClass.ExceptionOfPremiumAndAddBuget() == false)
        {
            for(i=0;i<100;i++)
            {
                for(j=i+1;j<100;j++) {
                    Budget = Budget - (obj[i].GetEmpMoney()+obj[j].GetEmpMoney());
                }
            }
            return Budget;
        }
        else
            {
                return 0;
            }

    }

    public String GetNameOfCompany()
    {
        return NameOfCompany;
    }

    public String GetTasks()
    {
        return Tasks;
    }

    public double GetBuget()
    {
        return Budget;
    }
}
