/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author micke
 */
public class Calculo {
  double capInicial = 0.0;
  double tasaInt = 0.0;
  double anho = 0.0;
  double resultado = 0.0;
  
  public double calculoInteres(){
    resultado = (capInicial * (tasaInt/100) *anho);
    return resultado;
  }
  
  //GETTERS
  public double getCap() {
    return capInicial;
  }
  
   public double getTasa() {
    return tasaInt;
  }
  
   public double getAnho() {
    return anho;
  }
  
  public double getResultado(){
    return resultado;
  }
  
  //SETTERS
  public void setCap(double capInicial){
    this.capInicial = capInicial;
  }
  
  public void setTasa(double tasaInt){
    this.tasaInt = tasaInt;
  }
  public void setAnho(double anho){
    this.anho = anho;
  }
  public void setResultado(double resultado){
    this.resultado = resultado;
  }
}
