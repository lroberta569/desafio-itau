package desafio.itau.springboot.dto;

import jakarta.validation.constraints.NotNull;

public class TransactionRequest {

    @NotNull
    @Min(0)
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
