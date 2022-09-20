package ru.mirea.kvbo1.khabarova;

public class Seasonfavor {
    public static void main(String[] args){
        Seasons seasons1 =Seasons.AUTUMN;
        System.out.println(seasons1);
        print (Seasons.AUTUMN);
        printValues();

        Seasons seasons2 = Seasons.valueOf("Зима");
        System.out.println(seasons2);
    }
    public static void print(Seasons seasons) {
        switch (seasons){
            case WINTER:
                System.out.println("Я люблю Зиму");
                break;
            case SRINGS:
                System.out.println("Я люблю Весну");
                break;
            case SUMMER:
                System.out.println("Я люблю Лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю Осень");
                break;



        }
    }
    public static void printValues(){
        for (Seasons s: Seasons.values()){
            System.out.println(s + " " + s.getTemp() + " " + s.getDescrption());
        }
    }
}
