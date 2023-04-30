/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.ditalinnovation.gof;

import java.util.List;

/**
 *
 * @author gisla
 */
public class PagamentoFacade {
    private List<FormaPagamento> formasDePagamento;

    public PagamentoFacade() {
        this.formasDePagamento = PadroesFormaPagamento.getInstance().getFormasDePagamento();
    }

    public void realizarPagamento(double valor, int formaDePagamentoSelecionada) {
        FormaPagamento formaDePagamento = formasDePagamento.get(formaDePagamentoSelecionada);
        formaDePagamento.realizarPagamento(valor);
    }
}
