/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.ditalinnovation.gof;

/**
 *
 * @author gisla
 */
public class Boleto implements FormaPagamento{
    
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com boleto bancário no valor de R$ " + valor);
    }
 
}
