/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ramirez;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

/**
 *
 * @author Natalia
 */
@WebService(serviceName = "parcial_1_ramirez_web_operaciones_9a")
public class parcial_1_ramirez_web_operaciones_9a {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calcular_intensidad")
    public double calcular_intensidad(@WebParam(name = "voltaje") double voltaje,@WebParam(name = "resistencia") double resistencia) {
        double intensidad=voltaje/resistencia;
        return (double)(intensidad);
    }
    
}
