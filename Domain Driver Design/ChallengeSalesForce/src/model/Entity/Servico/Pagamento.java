package model.Entity.Servico;

import java.time.LocalDateTime;
import java.util.Objects;

public class Pagamento {

    private Long id;
    private LocalDateTime dataPagamento;
    private Double valorTotal;
    private String metodo;
    private Integer parcelas;
    private Double valorParcelas;
    private String descricao;
    private String status;


    public Pagamento(LocalDateTime dataPagamento, Double valorTotal, String metodo, Integer parcelas, String descricao) {
        this.dataPagamento = dataPagamento;
        this.valorTotal = valorTotal;
        this.metodo = metodo;
        this.parcelas = parcelas;
        this.descricao = descricao;
        this.status = "Processando";
        this.valorParcelas = valorTotal/parcelas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Double getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(Double valorParcelas) {
        this.valorParcelas = valorParcelas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(id, pagamento.id) && Objects.equals(descricao, pagamento.descricao) && Objects.equals(dataPagamento, pagamento.dataPagamento) && Objects.equals(valorTotal, pagamento.valorTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, dataPagamento, valorTotal);
    }

    @Override
    public String toString() {
        return "\nPagamento: " + "\n" +
                "Id: "+ id + "\n" +
                "Data do Pagamento: "+ dataPagamento + "\n" +
                "Valor total: " + valorTotal + "\n" +
                "Metodo: " + metodo + "\n" +
                "Parcelas: " + parcelas + "\n" +
                "Valor das Parcelas: " + String.format("%.2f", valorParcelas) + "\n" +
                "Descrição: " + descricao + "\n" +
                "Status: " + status + "\n";
    }
}
