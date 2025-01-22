public class Main {
            public static void main(String[] args) {
                var dog = 8.0;
                var cat = 3.6;
                var paper = 763789;
                System.out.println("Значение переменной dog" + " = " + dog);
                System.out.println("Значение переменной cat" + " = " + cat);
                System.out.println("Значение переменной paper" + " = " + paper);
                 dog = dog + 4;
                 cat  = cat + 4;
                 paper = paper + 4;
                System.out.println("Значение переменной dog после сложения" + " = " + dog);
                System.out.println("Значение переменной cat после сложения" + " = " + cat);
                System.out.println("Значение переменной paper после сложения" + " = " + paper);
                dog = dog -3.5;
                cat = cat - 1.6;
                paper = paper - 7639;
                System.out.println("Значение переменной dog после вычитания" + " = " + dog);
                System.out.println("Значение переменной cat после вычитания" + " = " + cat);
                System.out.println("Значение переменной paper после вычитания" + " = " + paper);

                var friend = 19;
                System.out.println("Значение переменной friend" + " = " + friend);
                friend = friend + 2;
                System.out.println("Значение переменной friend после сложения" + " = " + friend);
                friend = friend / 7;
                System.out.println("Значение переменной friend после деления" + " = " + friend);

                var frog = 3.5;
                System.out.println("Значение переменной frog" + " = " + frog);
                frog = frog * 10;
                System.out.println("Значение переменной frog после умножения" + " = " + frog);
                frog = frog / 3.5;
                System.out.println("Значение переменной frog после деления" + " = " + frog);
                frog = frog + 4;
                System.out.println("Значение переменной frog после сложения" + " = " + frog);

                var boxerWeight = 78.2;
                var boxerWeight_2 = 82.7;
                var mod = boxerWeight_2%boxerWeight;
                System.out.println ("Общая масса бойцов " + "= " + sumWeight(boxerWeight, boxerWeight_2));
                System.out.println ("Разность весов бойцов  " + "= " + Math.abs(boxerWeight-boxerWeight_2));
                System.out.println ("Остаток от деления веса бойцов  " + "= " + mod);

            }
    public static double sumWeight(double a, double b) {
        return a + b;
    }
        }
