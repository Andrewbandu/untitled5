public class Main {
    public static void main(String[] args) {
        System.out.println("завдання 1");
        for(int i = 500; i <= 650; i = i+10){
            System.out.println(i);
        }

        System.out.print("while");



        int a = 500;
        while(a<=650){
            System.out.println(a);
            a = a+10;
        }

        System.out.println("do while");

        int j = 500;
        do {
            System.out.println(j);
            j = j+10;

        }while(j <= 650);


        System.out.println("завдання 2");

        int b = 2;
        for(;b<5000; b = 2*b-1){
            System.out.println(b);
        }

        System.out.println("завдання 3");

        int d = 10;
        for(int s = 1; s <= 10;s++){
            if (d%s==0) {
                System.out.println(s);


            }
        }

        System.out.println("завдання 4");

        int n = 10;
        int f = 1;
        for(int l = 1; l<=n; l++){
            f *= l;
        }
        System.out.println("факторіал числа: " + f);

        //2 while
        int n1 = 10;
        int f1 = 1;
        int l1 = 1;
        while(l1 <= n1){
            f1 *= l1;
            l1++;

        }
        System.out.println("факторіал числа " + f1);


        System.out.println("завдання 5");

        int h = 0;
        int c = 0;
        while(h<24){
            int m = 0;
            while(m<60){
                if((h /10 == m % 10)&&(h%10 == m/10) ){//еревірка умов симетрії
                    c++;
                }
                m++;

            }
            h++;
        }
        System.out.println("кількість симетричних комбінацій: " + c);
    }
}
    
