import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vinilos [][]=new String[100][3];
        agregarVinilo(vinilos, "iron Maiden", "Killers", "1980");
        mostrarColeccion(vinilos);
    }

    public static void mostrarColeccion(String m [][]) {
        for(int i=0;i<101;i++){
            for(int j=0;j<2;j++){
                System.out.println(m[i][j]);
            }
        }
    }

    public static void agregarVinilo(String[][] m, String nomA, String nomD, String agno) {
        Scanner teclado = new Scanner(System.in);
        int contador=0;
        while(contador<101){
            System.out.println( "¿Agregar nuevo vinilo? [1]=si [2]=no");
            int r1=teclado.nextInt();
            if(r1==1){
                System.out.println("Nombre artista");
                nomA=teclado.next();
                System.out.println("Nombre disco");
                nomD=teclado.next();
                System.out.println("Agregar año de estreno");
                agno=teclado.next();
                contador++;
            }
            else{
                break;
            }

        }
    }
}
