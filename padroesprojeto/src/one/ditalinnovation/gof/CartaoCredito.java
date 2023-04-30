/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.ditalinnovation.gof;

/**
 *
 * @author gisla
 */
public class CartaoCredito implements FormaPagamento{
    
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito no valor de R$ " + valor);
    }
    
}
