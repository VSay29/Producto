public class Tienda {

    private int id;
    private String nombre;
    private String direccion;
    private List<Producto>;

    public Tienda(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void almacenar (Producto p) {

    }

    public int cantidadStock() {

    }

    public Map<String,Integer> contarProductosPorTipo() {

    }

    public String nombreProductoMasCaro() {

    }

    public float precioProducto(String nombre) {

    }

    public Map<Long,List<Producto>> agruparPorDiasCaducadosDescendente() {

    }

}