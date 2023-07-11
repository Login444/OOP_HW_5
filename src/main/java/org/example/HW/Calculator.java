package org.example.HW;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //1)расширить класс калькулятор на умножение
    //2)расширить класс калькулятор на деление
    //3)расширить класс калькулятор на бинарный перевод
    // (принимаемые значения как стринг, так и инт - тут необходимо подумать
    // как наилучшим образом реализовать, что будет если будут приниматься округляемые Double/Float
    // (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
    public Double sum(List<? extends Number> numbers){
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public Double multi(List<? extends Number> numbers){
        double multi = 1.0;
        for (Number number : numbers) {
            multi = multi * number.doubleValue();
        }
        return multi;
    }

    public Double div(List<? extends Number> numbers){
        double div = numbers.get(0).doubleValue();
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).doubleValue() != 0){
            div = div / numbers.get(i).doubleValue();
            } else {
                return null;
            }
        }
        return div;
    }

    public void convertBin(List<? extends Number> numbers){
        List<String> binaryList = new ArrayList<>();
        if (numbers.get(0) instanceof Integer){
            for (Number number : numbers) {
                binaryList.add(Integer.toBinaryString((Integer) number));
            }
        }
        if (numbers.get(0) instanceof Double){
            for (Number number : numbers) {
                binaryList.add(Long.toBinaryString(Double.doubleToRawLongBits((Double) number)));
            }
        }

        for (String s : binaryList) {
            System.out.println(s);
        }

    }
}
