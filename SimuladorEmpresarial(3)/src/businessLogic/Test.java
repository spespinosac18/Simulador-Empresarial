/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import data.PrestacionServicios;
import data.Producto;

import java.util.HashMap;
import java.util.Scanner;
import data.Empresa;

 class Test {

     public static void main(String[] args) {




        Empresa empresa=new Empresa ("Muebles de Colombia", "pequeña", "S.A.S",
                "July Chaves","Diseño, construccion y venta de muebles en madera",
                "Cr 42 B N° 12B-40", 2686030, 60000000, 0);
         Scanner sc = new Scanner(System.in);



      PrestacionServicios contador=new PrestacionServicios();
      PrestacionServicios mantenimiento=new PrestacionServicios();
      PrestacionServicios auditor=new PrestacionServicios();

      int numero;
      double totalS, totalVac, totalCe, totalIce, totalPrima;
      boolean respuesta;
      String cargo;
      HashMap<String,Nomina>nomina=new HashMap<>();
      Nomina operario=new Nomina(1118950, "operario", 781242, 390621, 781242, 93749);
      Nomina administrativo=new Nomina(2038540, "administrativo", 1500000, 750000, 1500000, 180000);
      Nomina gerente=new Nomina(7861000, "gerente", 6000000, 3000000, 6000000, 720000);
      Nomina supervisor=new Nomina(2067200, "supervisor", 1500000, 750000, 1500000, 180000 );
      nomina.put("operario", operario);
      nomina.put("administrativo", administrativo);
      nomina.put("gerente", gerente);
      nomina.put("supervisor", supervisor);

      System.out.println("Ingrese el cargo del trabajador: ");
      cargo=sc.next();
      System.out.println("Ingrese la cantidad de trabajadores de este cargo :");
      numero=sc.nextInt();
      //while(numero>0) {
       totalS =numero* nomina.get(cargo).getSueldo();

      // numero--;
       System.out.println("El valor total es " + totalS);

       System.out.println("Se le pagaran vacaciones? ");
       respuesta=sc.nextBoolean();
       if(respuesta==true){
        totalVac=totalS+nomina.get(cargo).getVacaciones();
        System.out.println("El sueldo a pagar para cada  trabajador es: "+totalVac);
       }else{
        System.out.println("Se paga salario basico: "+totalS);
       }

         HashMap<Integer, Producto>productos = new HashMap<>();
         Producto producto = new Producto("Comedor Mesa en Vidrio con 6 Sillas", 301075, "Comedor Aragon", 499900);
         Producto producto2 = new Producto("Comedor de 4 puestos", 302458, "Comedor Inter", 299900);
         Producto producto3 = new Producto("Comedor de 4 puestos Arce", 308873, "Comedor Napoli", 609900);
         Producto producto4 = new Producto("Comedor Mesa en Vidrio con 4 Sillas", 297715, "Comedor Aragon pequen~o", 250000);
         Producto producto5 = new Producto("Comedor con 4 Puestos Wengue Muebles Juventud", 300913, "Comedor Sevilla Cristal", 1999900);
         Producto producto6 = new Producto("Comedor con 4 Puestos Wengue", 281065, "Comedor Brasilia", 399900);
         Producto producto7 = new Producto("Sofá Esquinero con 5 Puestos Tela Negro", 289572, "Sofa Trivoli Jazz", 1199900);
         Producto producto8 = new Producto("Sofá Esquinero Beige", 326130, "Lyon XS Santana ", 1499900);
         Producto producto9 = new Producto("Sofá con 2 Puestos", 311054, "Javiera", 499900);
         Producto producto10 = new Producto("Sofá de 2 Puestos Negro", 310306, "Sofa Mirko ", 299900);
         Producto producto11 = new Producto("Sofá de  3 Puestos en Tela Café", 300285, "Sofa Esquinero Valero", 499900);
         Producto producto12 = new Producto("Cama Sencilla  ", 313434, "Cama Macchiato Moduart", 550900);
         Producto producto13 = new Producto("Cama de Tela Gris", 310356, "Cama Sussan Queen", 499900);
         Producto producto14 = new Producto("cama doble", 325175, "Cama Wess  Wengue Maderkit", 899000);
         Producto producto15 = new Producto("Cama Doble ", 310409, "Cama Stride Oak", 1590000);
         Producto producto16 = new Producto("Cama sencilla ", 310368, "Cama Jonah Doble", 790000);

         productos.put(301075, producto);
         productos.put(302458, producto2);
         productos.put(308873, producto3);
         productos.put(297715, producto4);
         productos.put(300913, producto5);
         productos.put(281065, producto6);
         productos.put(289572, producto7);
         productos.put(326130, producto8);
         productos.put(311054, producto9);
         productos.put(310306, producto10);
         productos.put(300285, producto11);
         productos.put(313434, producto12);
         productos.put(310356, producto13);
         productos.put(325175, producto14);
         productos.put(310409, producto15);
         productos.put(310368, producto16);

         //System.out.println(empresa);
         double totalV = 0.0;
         int invInicial;
         double totalC=0.0;
         int ref;

         //empresa.setCaja(invInicial);

         System.out.println("Ingrese la cantidad de  referencias del catalogo");
         int cnt = sc.nextInt();
         while (cnt > 0){



             System.out.println("Ingrese la referencia");
             ref = sc.nextInt();
             System.out.println("Ingrese la cantidad");
             int cant = sc.nextInt();
             totalV += cant * productos.get(ref).getPrecio();
             cnt--;

         }
         System.out.println("El valor total fue " + totalV);

         System.out.println("Ingrese el valor de la inversion inicial");
         invInicial = sc.nextInt();
         totalC +=totalV+invInicial;


         }


     }


          
        /*  System.out.println("Ingrese la cantidad de productos ");
       a=sc.nextInt();
          for (int i = 0; i < 10; i++) {
               productos.put("301075", producto);
          productos.get("301075");
           System.out.println("El/los productos vendidos son: ");
          System.out.println(productos.get("301075"));
          
       if(a!=0){
          productos.put("a", producto );
          productos.get("a");
           System.out.println("El/los productos vendidos son: ");
          System.out.println(productos.get("a"));
       }else{
           System.out.println("Error");
          /*productos.put("Comedor Inter", producto2);
          productos.get("Comedor Inter");
          System.out.println(productos.get("Comedor Inter"));
          productos.put("Comedor Napoli", producto3);
          productos.get("Comedor Napoli");
          System.out.println(productos.get("Comedor Napoli"));
          productos.put("Comedor Aragon pequen~o", producto4);
          productos.get("Comedor Aragon pequen~o");
          System.out.println(productos.get("Comedor Aragon pequen~o"));
      }
             
       boolean respuesta;
       System.out.println("Ingrece la referencia del producto ");
          referencia=sc.nextInt();
     
          System.out.println("Ingrece el precio del producto ");
      b=sc.nextInt();
          
       HashMap<String, String>listaReferencias=new HashMap<>();
     
          listaReferencias.put("referencia", "b");
         
      
          System.out.println(listaReferencias.values())
     }*/




