/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.ditalinnovation.gof;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gisla
 */
public class PadroesFormaPagamento {
    
    private static PadroesFormaPagamento instancia;
    private List<FormaPagamento> formasDePagamento;

    private PadroesFormaPagamento() {
        formasDePagamento = new ArrayList<>();
        // Adiciona as formas de pagamento disponíveis
        formasDePagamento.add(new CartaoCredito());
        formasDePagamento.add(new Boleto());
    }

    public static PadroesFormaPagamento getInstance() {
        if (instancia == null) {
            instancia = new PadroesFormaPagamento();
        }
        return instancia;
    }

    public List<FormaPagamento> getFormasDePagamento() {
        return formasDePagamento;
    }
    
}
