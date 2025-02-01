public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int savings=15000;
        int total=0;
        int i=1;
        while(total < 245900) {
            total= total+savings;
            System.out.println("Месяц "+i+" ,сумма накоплений равна "+total+" рублей");
            i++;}
        System.out.println("Задача 2");
        int start = 1;
        while(start<=10){
            System.out.print(" "+start);
            start++;}
        System.out.println();
        for (int a = 10; a > 0; a--){
            System.out.print(" " + a);
        }System.out.println();
        System.out.println("Задача 3");
 int Population = 12000000;
 int fertility = 17;
 int mortality = 8;
 int growth = 0;
 for(int b=1;b<=10;b++){
     growth=Population*(fertility-mortality)/1000;
     Population=Population+growth;
     System.out.println("Год "+b+", численность населения составляет "+Population);
 }System.out.println("Задача 4");
float contribution = 15000f;
float percent = 0.07f;
int month = 1;
while(contribution<=12_000_000){
    contribution+= contribution*percent;
    System.out.println("Месяц "+month+" накопления составляют "+contribution+" рублей.");
    month++;
}
System.out.println("Задача 5");
float Contribution = 15000f;
float Percent = 0.07f;
int Month=1;
while(Contribution<=12_000_000){
    Contribution+= Contribution*Percent;//+Contribution;
    if(Month % 6 == 0){
    System.out.println("Месяц "+Month+" накопления составляют "+Contribution+" рублей.");}
    if(Contribution>12_000_000){
        break;}
    Month++;
    }
    System.out.println("Целевая сумма накоплений достигнута за " + Month + " месяцев.");
System.out.println("Задача 6");
float contributioN = 15000f;
float percenT = 0.07f;
for(int year=1; year<=9;year++){
    for(int montH=1;montH<=12;montH++){
           contributioN+=contributioN*percenT;
           if(montH % 6==0){
               System.out.println("Накопления сотавляют "+contributioN);}
    }
    }
System.out.println("Задача 7");
int friday = 3;
while(friday<=31){
    System.out.println("Сегодня пятница "+friday+"-е число. Необходимо подготовить отчёт.");
    friday+=7;
    }
System.out.println("Задача 8");
int ourDays=2017;
int Start=ourDays-200+79;
int future=ourDays+100;
while(Start<=future) {
    System.out.println("Год появления кометы " + Start);
    Start += 79;
}
}
}

