package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "recurso_impugnatorio")
public class RecursoImpugnatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materia;

    @Column(name = "tipo_recurso")
    private String tipoRecurso;

    @Column(name = "tipo_acto")
    private String tipoActo;

    @Column(name = "num_valor")
    private String numValor;

    @Column(name = "monto_materia")
    private Double montoMateria;

    private String periodo;

    private String sustento;

    private String estado;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @Column(name = "usuario_id")
    private Long usuarioId;

    private String fecha;

    @Column(name = "indicador_precios_transferencia")
    private String indicadorPreciosTransferencia;

    @Column(name = "codigo_tributo")
    private String codigoTributo;

    @Column(name = "monto_insoluto")
    private Double montoInsoluto;

    @Column(name = "monto_interes")
    private Double montoInteres;

    @Column(name = "archivos_adjuntos")
    private String archivosAdjuntos;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

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

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }

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

    public String getArchivosAdjuntos() { return archivosAdjuntos; }
    public void setArchivosAdjuntos(String archivosAdjuntos) { this.archivosAdjuntos = archivosAdjuntos; }
}