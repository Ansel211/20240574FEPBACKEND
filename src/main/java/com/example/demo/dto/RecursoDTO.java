package com.example.demo.dto;

public class RecursoDTO {
    private String materia;
    private String tipoRecurso;
    private String tipoActo;
    private String numValor;
    private Double montoMateria;
    private String periodo;
    private String sustento;
    private Long usuarioId;
    private String fecha;
    private String indicadorPreciosTransferencia;
    private String codigoTributo;
    private Double montoInsoluto;
    private Double montoInteres;

    // Getters y Setters
    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }

    public String getTipoRecurso() { return tipoRecurso; }
    public void setTipoRecurso(String tipoRecurso) { this.tipoRecurso = tipoRecurso; }

    public String getTipoActo() { return tipoActo; }
    public void setTipoActo(String tipoActo) { this.tipoActo = tipoActo; }

    public String getNumValor() { return numValor; }
    public void setNumValor(String numValor) { this.numValor = numValor; }

    public Double getMontoMateria() { return montoMateria; }
    public void setMontoMateria(Double montoMateria) { this.montoMateria = montoMateria; }

    public String getPeriodo() { return periodo; }
    public void setPeriodo(String periodo) { this.periodo = periodo; }

    public String getSustento() { return sustento; }
    public void setSustento(String sustento) { this.sustento = sustento; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getIndicadorPreciosTransferencia() { return indicadorPreciosTransferencia; }
    public void setIndicadorPreciosTransferencia(String indicadorPreciosTransferencia) { this.indicadorPreciosTransferencia = indicadorPreciosTransferencia; }

    public String getCodigoTributo() { return codigoTributo; }
    public void setCodigoTributo(String codigoTributo) { this.codigoTributo = codigoTributo; }

    public Double getMontoInsoluto() { return montoInsoluto; }
    public void setMontoInsoluto(Double montoInsoluto) { this.montoInsoluto = montoInsoluto; }

    public Double getMontoInteres() { return montoInteres; }
    public void setMontoInteres(Double montoInteres) { this.montoInteres = montoInteres; }
}