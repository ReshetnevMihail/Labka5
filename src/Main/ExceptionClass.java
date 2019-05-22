package Main;

import static java.lang.Math.pow;

public class ExceptionClass
{
    void ExceptionOfSearch(int Low, int High) {
        try {
            if (Low >= High) throw new Exception("Нижний предел не может превышать верхний. Введите еще раз");
        } catch (Exception b) {

            System.out.println(b.getMessage());
        }
    }
}
