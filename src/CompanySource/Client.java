package CompanySource;

import java.time.LocalDate;

public class Client {

    private int id_client;
    private String name;
    private String dni;
    private int telefono;
    private String fecha_nac;
    private String address;
    private String gmail;

    public Client() {
    }

    public Client(int id_client, String name, String dni, int telefono, String fecha_nac, String address, String gmail) {
        this.id_client = id_client;
        this.name = name;
        this.dni = dni;
        this.telefono = telefono;
        this.fecha_nac = fecha_nac;
        this.address = address;
        this.gmail = gmail;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
