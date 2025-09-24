public  class Producto {

    private int id;
    private String nombre;
    private int precio;
    private double peso;
    private enum TipoProducto {LIMPIEZA, VERDURA, LEGUMBRE, PAPELERIA, JUGUETE, ZAPATO} tipo;
    private int stock;
    private LocalDate fechaCaducidad;

    public Producto(int id, String nombre, double peso, int precio, int stock, LocalDate fechaCaducidad) {
        this.id = id;
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.stock = stock;
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}