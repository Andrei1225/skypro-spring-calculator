package pro.sky.skyprospringcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
   @Override
    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String plus(String number1, String number2) {
        if (number1.length() == 0 || number2.length() == 0) {
            return "Ошибка! не введены параметры num1 и/или num2!";
        } else {
            int number11 = Integer.valueOf(number1);
            int number22 = Integer.valueOf(number2);
            int number3 = number11 + number22;
            return number11 + " + " + number22 + " = " + number3;
        }
    }

    @Override
    public String minus(String number1, String number2) {
        if (number1.length() == 0 || number2.length() == 0) {
            return "Ошибка! не введены параметры num1 и/или num2!";
        } else {
            int number11 = Integer.valueOf(number1);
            int number22 = Integer.valueOf(number2);
            int number3 = number11 - number22;
            return number11 + " - " + number22 + " = " + number3;
        }
    }

@Override
    public String multiply(String number1, String number2) {
        if (number1.length() == 0 || number2.length() == 0) {
            return "Ошибка! не введены параметры num1 и/или num2!";
        } else {
            int number11 = Integer.valueOf(number1);
            int number22 = Integer.valueOf(number2);
            int number3 = number11 * number22;
            return number11 + " * " + number22 + " = " + number3;
        }
    }

    @Override
    public String divide(String number1, String number2) {

        if (number1.length() == 0 || number2.length() == 0) {
            return "Ошибка! не введены параметры num1 и/или num2!";
        } else {
            if (Integer.valueOf(number2) == 0) {
                return "Ошибка! На нуль делить нельзя!";
            } else {
                int number11 = Integer.valueOf(number1);
                int number22 = Integer.valueOf(number2);
                int number3 = number11 / number22;
                return number11 + " / " + number22 + " = " + number3;
            }
        }
    }
}
