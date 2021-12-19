package ru.antara.testing.example;

import ru.antara.testing.example.services.ClosedConsoleIOService;
import ru.antara.testing.example.services.ConsoleContext;
import ru.antara.testing.example.services.IOService;
import ru.antara.testing.example.services.OpenedConsoleIOService;
import ru.antara.testing.example.services.CalculatorServiceImpl;
import ru.antara.testing.example.services.CalculatorService;

public class Main {

  public static void main(String[] args) {
    IOService closedConsoleIOService = new ClosedConsoleIOService();
    IOService openedConsoleIOService = new OpenedConsoleIOService(new ConsoleContext());

    closedConsoleIOService.out("Hello World");
    //openedConsoleIOService.out("Hello World 2");


    CalculatorService calculatorService = new CalculatorServiceImpl(closedConsoleIOService);
    calculatorService.readTwoDigitsAndMultiply();
    openedConsoleIOService.out("---------------------------------------------------------");
    calculatorService.readTwoDigitsAndMultiply("Введите два числа и мы их перемножим!");
    openedConsoleIOService.out("---------------------------------------------------------");
    calculatorService.multiplyTwoDigits("Мы перемножили для вас два числа. Результат смотри ниже", 53, 42);
    openedConsoleIOService.out("---------------------------------------------------------");

  }
}
