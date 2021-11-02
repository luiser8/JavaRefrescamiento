import java.util.Scanner;

/**
 * @author Luis Rondon
 */
public class Main {
    //Variables globales
    int opciones = 0;
    double saldo = 0.00;
    String usuario = "";

    //Funcion para iniciar
    public void inciar() {
        System.out.println("Bienvenido: Elige las opciones");
        System.out.println("1: INICIAR SESION \n 2: CERRAR SESSION \n 0: TERMINAR");
        Scanner opcionesScanner = new Scanner(System.in);

        this.opciones = opcionesScanner.nextInt();

           switch(this.opciones){
               case 1 :
                   this.sesion();
               case 2 :
                   this.desconectarse();
               case 0 :
                   return;
           }
    }

    //Funcion para iniciar sesion
    public void sesion() {
        Scanner usuarioScanner = new Scanner(System.in);
        System.out.println("Cuenta de usuario");

        this.usuario = usuarioScanner.nextLine();
        
        this.principal();
        
    }
    
    //Funcion para desconectarse
    public void desconectarse() {
        this.inciar();
    }

    //Funcion para Menu de funciones
    public void principal() {
        System.out.println("1: SALDO \n 2: RECARGAR \n 3: RETIRAR \n 0:SALIR");
        Scanner opcionesScanner = new Scanner(System.in);
        
        switch(opcionesScanner.nextInt()){
              case 1 :
                   this.saldo();
               case 2 :
                   this.recargar();
               case 3 :
                   this.retirar();
               case 0 :
                   this.inciar();
        }
    }
   //Funcion para ver saldo
    public void saldo() {
        System.out.println("SALDO : " + this.saldo);
        this.principal();
    }
    //Funcion para recargar
    public void recargar() {
        System.out.println("INGRESA MONTO A RECARGAR:");
        Scanner recargaScanner = new Scanner(System.in);
        
        this.saldo = this.saldo + Float.parseFloat(recargaScanner.nextLine());
        System.out.println("SALDO : " + this.saldo);
        this.principal();
    }
    
    //Funcion para retirar
    public void retirar() {
        System.out.println("INGRESA MONTO A RETIRAR:");
        Scanner retiroScanner = new Scanner(System.in);
        
        this.saldo = this.saldo - Float.parseFloat(retiroScanner.nextLine());
        System.out.println("SALDO : " + this.saldo);
        this.principal();
    }
    //Metodo de entrada
    public static void main(String[] args) {
        Main main = new Main();
        main.inciar();
        System.out.println("Bienvenido: " + main.usuario);
    }
}
