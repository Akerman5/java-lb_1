
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;
import java.util.Stack;


class Main
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_ORANGE = "\u001B[38m";

    public static void main(String[] args) {

        Scanner srt = new Scanner(System.in);

        int ask = 0;

        while (ask != 5) {
            System.out.println("\n\t\t\t\tВведіть номер задачі 1-4");
            System.out.println("\n\t\t\t\tДля виходу натисніть 5");
            ask = srt.nextInt();
            switch (ask) {
                case 1:
                    System.out.println("\nЗавдання № 1 A-B Рішеннями\n");

                    double  t,s;
                    double ss;
                    int zav1;
                    zav1 = srt.nextInt();
                    switch (zav1)
                    {
                        case 1:
                        {

                            System.out.print("\tРішення способом A\n");
                            System.out.print("\tВведіть ціле цисло s:");
                            s = srt.nextInt();
                            System.out.print("\tВведіть ціле цисло t:");
                            t = srt.nextInt();
                            try
                            {  if (!(s == -7 || s == 14 || s == 7))
                            {
                                throw new Exception();
                            }
                                if (s == 7)
                                {
                                    System.out.print("\tВідповідь:" + "\t" + (s / t + 2 * s * t));
                                }
                                if (s == 14)
                                {

                                    System.out.print("\tВідповідь:" + "\t" + Math.sqrt(s / t + s * t));
                                }
                                if (s == -7)
                                {
                                    System.out.print("\tВідповідь:" + "\t" + Math.pow(s, 2) + 2 * t);
                                }
                            }
                            catch (Exception ex)
                            {
                                System.out.println("Помилка. Введено невірні числа");
                            }
                        }  break;
                        case 2:
                        {
                            System.out.print("\tРішення способом B\n");
                            System.out.print("\tВведіть ціле цисло s:");
                            s = srt.nextInt();
                            System.out.print("\tВведіть ціле цисло t:");
                            t = srt.nextInt();


                            if (s == 7)
                            {

                                System.out.print("\tВідповідь:"+"\t"+(s / t + 2 * s * t));
                            }
                            else if (s==14)
                            {

                                System.out.print("\tВідповідь:"+"\t"+Math.sqrt(s / t + s * t));
                            }
                            else if (s==-7)
                            {

                                System.out.print("\tВідповідь:"+"\t"+Math.pow(s, 2) + 2 * t);
                            }

                        }

                    } break;

                case 2:
                    System.out.println("Використати if … else або, за" + "необхідності, вкладення if…else if \n12. На числовій площині розміщено три точки А(x1, y1), В(x2, y2) та С(x3, y3). Визначити, яка з них\n" +
                            "розміщена ближче до точки А, вивести координати точки та її відстань до точки А.  ");

                    double x1, y1, x2, y2, x3, y3, s1, s2, s3;
                    System.out.println("Введіть координати A(x1 та y1)");
                    System.out.println("\tx1=");
                    x1 = srt.nextInt();
                    System.out.println("\ty1=");
                    y1 = srt.nextInt();
                    System.out.println("Введіть координати B(x2 та y2)");
                    System.out.println("\tx2=");
                    x2 = srt.nextInt();
                    System.out.println("\ty2=");
                    y2 = srt.nextInt();
                    System.out.println("Введіть координати C(x3 та y3)");
                    System.out.println("\tx3=");
                    x3 = srt.nextInt();
                    System.out.println("\ty3=");
                    y3 = srt.nextInt();

                    //Формула обрахунку відстані між двома точками A(x1, y1) і B(x2, y2) на площині

                    s1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 + y1, 2)); //Формула обрахунку відстані між двома точками A(x1,y1)  B(x2, y2)  на площині
                    s2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 + y1, 2)); //Формула обрахунку відстані між двома точками  A(x1,y1)  C(x3, y3)  на площині


                {

                    if(s1<=s2)
                    {
                        System.out.println("Найблища точка - B");

                    }
                    else if (s1>=s2)
                    {
                        System.out.println("Найблища точка - C");
                    }
                    else
                    {
                        System.out.println("Точки на площині рівні або введено не коректно");
                    }


                } break;

                case 3:
                    int a;
                    System.out.println("Введіть число від 1-7\n");
                    a = srt.nextInt();
                    switch (a) {
                        case 1:
                            System.out.print(ANSI_RED + "Червоний");
                            break;
                        case 2:
                            System.out.print(ANSI_WHITE + "Білий");
                            break;
                        case 3:
                            System.out.print(ANSI_YELLOW + "Жовтий");
                            break;
                        case 4:
                            System.out.print(ANSI_GREEN + "Зелений");
                            break;
                        case 5:
                            System.out.print(ANSI_CYAN + "Блакитний");
                            break;
                        case 6:
                            System.out.print(ANSI_BLUE + "Синій");
                            break;
                        case 7:
                            System.out.print(ANSI_PURPLE + "Фіолетовий");
                            break;
                        default:
                            System.out.println(ANSI_BLACK + "Введіть чесло від 1-7!");
                            break;
                    }
                    break;


                case 4:

                    try
                    {
                        double x, y, z, t1;
                        System.out.println("\tВведіть значення x");
                        x = srt.nextInt();
                        System.out.println("\tВведіть значення y");
                        y = srt.nextInt();
                        System.out.println("\tВведіть значення z");
                        z = srt.nextInt();
                        if(x<=0||y<=0||z<=0)
                        {
                            Exception pomilka = new Exception();
                            throw  pomilka;
                        }
                        t1 = ((1 + z) * ((x + (y / z)) / x - (1 / 1 + Math.pow(x, 2))));
                        System.out.println("\tВідповідь:");
                        System.out.print(t1);
                        break;
                    }
                    catch (Exception ex)
                    {
                        System.out.print("Спрацювало виключення!");
                    }

            }
        }
    }
}