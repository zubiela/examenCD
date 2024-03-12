package Examen;

public class Coche {

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        this.km = km;
    }
    private String marca;
    private String modelo;
    private double precio;
    private int km;

    private static int kmTotales = 0;
    public Coche(String marca, String modelo, double precio, int km) 
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.km = km;
    }
    public static int getKmTotales() 
    {
        return Coche.kmTotales;
    } 
    public double PrecioConIva(boolean ivareducido) 
    {
        /* si el impuesto es reducido, el precio con iva es el precio del coche incrementado un 10%
           si no es reducido, el precio con iva es el precio del coche incrementado un 21%
        */
        if (ivareducido){
            return getPrecio() * 1.10;
        }else {
            return getPrecio()* 1.21;
        }
    }
    public void aplicarDescuento() 
    {
        /*si el precio del coche es menor a 10.000€ se aplica un descuento del 15%
          sino se aplica un descuento del 7%
        */
        if (getPrecio()<10000){
            this.setPrecio(getPrecio() * 0.85);
        }else {
            this.setPrecio(getPrecio() * 0.93);
        }
    }
    public void recorrerKm(int km) {
        this.setKm(this.getKm() + km);
        Coche.kmTotales += km;
  }
}

