package com.example.cardviewprueba;

public class DataClass {

    private String dataNombre;
    private int dataDesc;
    private String dataInst;
    private int dataImagen;

    public DataClass(String dataNombre, int dataDesc, String dataInst, int dataImagen) {
        this.dataNombre = dataNombre;
        this.dataDesc = dataDesc;
        this.dataInst = dataInst;
        this.dataImagen = dataImagen;
    }

    public String getDataNombre() {
        return dataNombre;
    }

    public void setDataNombre(String dataNombre) {
        this.dataNombre = dataNombre;
    }

    public int getDataDesc() {
        return dataDesc;
    }

    public void setDataDesc(int dataDesc) {
        this.dataDesc = dataDesc;
    }

    public String getDataInst() {
        return dataInst;
    }

    public void setDataInst(String dataInst) {
        this.dataInst = dataInst;
    }

    public int getDataImagen() {
        return dataImagen;
    }

    public void setDataImagen(int dataImagen) {
        this.dataImagen = dataImagen;
    }
}
