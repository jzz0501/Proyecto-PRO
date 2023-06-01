package CompanySource;

public class Product {

    private int cod_product;
    private String modelo;
    private String name;
    private String description;
    private float precio;
    private int period_warrantly;

    public Product() {

    }

    public Product(int cod_product, String modelo, String name, String description, float precio, int period_warrantly) {
        this.cod_product = cod_product;
        this.modelo = modelo;
        this.name = name;
        this.description = description;
        this.precio = precio;
        this.period_warrantly = period_warrantly;
    }

    public int getCod_product() {
        return cod_product;
    }

    public void setCod_product(int cod_product) {
        this.cod_product = cod_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPeriod_warrantly() {
        return period_warrantly;
    }

    public void setPeriod_warrantly(int period_warrantly) {
        this.period_warrantly = period_warrantly;
    }
}
