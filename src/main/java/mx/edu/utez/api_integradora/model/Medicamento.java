package mx.edu.utez.api_integradora.model;


import jakarta.persistence.*;

import java.sql.Blob;

@Entity
@Table(name = "Medicamento")
public class Medicamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String nombreMedicamento;
    private String descripcionMedicamento;
    private String tipoMedicamento;
    private String estadoMedicamento;


    @Lob //Para almacenar datos pesados
    private Byte[] imagenMedicamento;

    public String getDescripcionMedicamento() {
        return descripcionMedicamento;
    }

    public void setDescripcionMedicamento(String descripcionMedicamento) {
        this.descripcionMedicamento = descripcionMedicamento;
    }

    public String getEstadoMedicamento() {
        return estadoMedicamento;
    }

    public void setEstadoMedicamento(String estadoMedicamento) {
        this.estadoMedicamento = estadoMedicamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Byte[] getImagenMedicamento() {
        return imagenMedicamento;
    }

    public void setImagenMedicamento(Byte[] imagenMedicamento) {
        this.imagenMedicamento = imagenMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }
}
