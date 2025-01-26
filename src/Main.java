public class Main {
    public static void main(String[] args) {
        int savings=15000;
        int total=0;
        int i=1;
        while(total < 245900) {
            total= total+savings;
            System.out.println("Месяц "+i+" ,сумма накоплений равна "+total+" рублей");
            i++;}

        int start = 1;
        while(start<=10){
            System.out.print(" "+start);
            start++;}
        System.out.println();
        for (int b = 10; b > 0; b--){
            System.out.print(" " + b);
        }
    }
}
