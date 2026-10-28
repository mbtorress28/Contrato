package Clases;

import Enums.EstadoContrato;
import Excepciones.ContratoVencidoException;

import java.time.LocalDate;

public class Contrato {

    private int id;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double porcentajeRegalias;
    EstadoContrato estado;


    public Contrato(int id, LocalDate fechaInicio, LocalDate fechaFin, double porcentajeRegalias, EstadoContrato estado) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.porcentajeRegalias = porcentajeRegalias;
        this.estado = EstadoContrato.VIGENTE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPorcentajeRegalias() {
        return porcentajeRegalias;
    }

    public void setPorcentajeRegalias(double porcentajeRegalias) {
        this.porcentajeRegalias = porcentajeRegalias;
    }

    public EstadoContrato getEstado() {
        return estado;
    }

    public void setEstado(EstadoContrato estado) {
        this.estado = estado;
    }



    public boolean estaVigente(){
        actualizarEstado();
        return this.estado == EstadoContrato.VIGENTE;

    }

    public void actualizarEstado(){

        if (this.estado!= EstadoContrato.RESCINDIDO)
        {
            if( LocalDate.now().isAfter(fechaFin))
            {
                this.estado=EstadoContrato.VENCIDO;
            }
            else
                this.estado=EstadoContrato.VIGENTE;
        }
    }

    public void rescindir()
    {
        if(this.estado == EstadoContrato.VENCIDO)
        {
            throw new ContratoVencidoException("No se puede rescindir un contrato que esta vencido");
        }
        this.estado= EstadoContrato.RESCINDIDO;
    }

}
