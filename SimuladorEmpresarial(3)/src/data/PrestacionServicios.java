/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

public class PrestacionServicios extends Empleados{

    private boolean informeServicios;
    private boolean certificadoSeguridadSocial;

    public PrestacionServicios(boolean informeServicios, boolean certificadoSeguridadSocial, String tipoDeContrato, double salario) {
        super(tipoDeContrato, salario);

        this.informeServicios = informeServicios;
        this.certificadoSeguridadSocial = certificadoSeguridadSocial;
    }

    public boolean isInformeServicios() {
        return informeServicios;
    }

    public void setInformeServicios(boolean informeServicios) {
        this.informeServicios = informeServicios;
    }

    public boolean isCertificadoSeguridadSocial() {
        return certificadoSeguridadSocial;
    }

    public void setCertificadoSeguridadSocial(boolean certificadoSeguridadSocial) {
        this.certificadoSeguridadSocial = certificadoSeguridadSocial;
    }

   @Override
   public void generarPagoSalario(){
       Scanner sn=new Scanner(System.in);
       boolean informeServicios, certificadoSeguridadSocial;
       double salario, totalPrestacionSevicios;

       System.out.println("Ingrese el sueldo del empleado: $");
           salario=sn.nextDouble();
       System.out.println("El empleado entrego el informe de trabajo?");
            informeServicios=sn.nextBoolean();
       System.out.println("El empleado entrego el certificado de pago de seguridad social?");
            certificadoSeguridadSocial=sn.nextBoolean();

       if(certificadoSeguridadSocial&&informeServicios==true){
           totalPrestacionSevicios=salario;
       }else{
           System.out.println("No se puede generar el pago al empleado");
       }
       
   }
}
