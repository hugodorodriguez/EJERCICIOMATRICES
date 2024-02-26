/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO2;

import java.util.Scanner;

/**
 *
 * @author fup
 */
public class Definitivas {
    double notas [][]= new double [3] [5];
    Scanner in =new Scanner(System.in);
    
    void registrar(){
        double codigo, valor;
        System.out.println("registrando copdigo de estudiante");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("codigo");
            codigo=in.nextDouble();
            System.out.println("nota definitiva de ED:");
            valor=in.nextDouble();
            //guardo en la matriz 
            notas [i][0]=codigo;
            notas [i][1]=valor;
            
            
        }
        System.out.println("Dtos registrados!!");
    }
    void listar(){
        System.out.println("Mostrando los Datos gUARDADOS");
        System.out.println("Materia: ESTRUCTURAS DE DATOS");
        System.out.println("CODIGO/NOTA DEFINITIVA");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas [i][0]+"/"+notas [i][1]);
            
            
        }
    }
    //Mostrar quienes perdieron la asignatura
    void mostrarReprobrados(){
        int contadorReprobados=0;
        System.out.println("ESTUDIANTES QUE REPROBARON ED");
        System.out.println("CODIGO/NOTA DEFINITIVA");
        for (int i = 0; i < notas.length; i++) {
            if(notas [i][1]<3){//reprobo
                System.out.println(notas[i][0]+"/"+notas[i][1]);
                contadorReprobados++;//incremento los reprobados
            }
        }
            System.out.println("total de reprobados="+contadorReprobados);
        
    }
     void menu (){
        int opcion=0;
        do{
            System.out.println("");
            System.out.println("""
                               ******Menu de opciones*****
                               
                               1.registar notas
                               2. listar notas
                               3. mostrar reprobados
                               4.salir
                               opcion:
                               """);
            opcion=in.nextInt();
            switch(opcion){
                case 1:
                    this.registrar();
                    break;
                case 2:
                    this.listar();
                    break;
                case 3:
                    this.mostrarReprobrados();
                    break;
                
           
            }}while(opcion>0 && opcion<4);
   }
    
}
