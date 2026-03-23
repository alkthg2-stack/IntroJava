public class Main {
    static void main() {
        System.out.println("--Exercice 4--");

        int a = 3;
        int b = 11;
        int c = 5;
        int d = 8;
        int i = 0;

        if(a==b){
             boolean e=true;
             i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }
        else{
            boolean e=false;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }

        if(b == a+d){
            boolean e=true;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }
        else{
            boolean e=false;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }

        if((b == a+d) && (a == b)){
            boolean e=true;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }
        else{
            boolean e=false;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }

        if((b == a) || (a==a)){
            boolean e=true;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }
        else{
            boolean e=false;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }

        if((c == 5) && (false)){
            boolean e=true;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }
        else{
            boolean e=false;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }

        if(((4 == 4) && (4 ==5)) || (a == a)){
            boolean e=true;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }
        else{
            boolean e=false;
            i++;
            System.out.println("La condition "+i+" retournera :");
            System.out.println(e);
        }





    }
}