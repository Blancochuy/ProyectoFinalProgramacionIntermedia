package vista;
import java.io.*;
import java.util.ArrayList;

public class Inicio extends javax.swing.JFrame {

    public static registro frmReg;
    public static login frmLog;

    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    //Guarda y acomoda alguna fecha ingresada
//Con esta clase se reutiliza el codigo para que otras clases la utilicen

class Fecha{
   private byte dia;
   private byte mes;
   private int anio;
   //Metodo Constructor
   public Fecha(byte dia, byte mes, int anio){
      setDia(dia);
      setMes(mes);
      setAnio(anio);
   }
   
   public Fecha(){
   
   }
   //--------------------------------SETS
   public void setDia(byte dia){
      this.dia=dia;
   }
   
   public void setMes(byte mes){
      this.mes=mes;
   }
   
   public void setAnio(int anio){
      this.anio=anio;
   }
   //--------------------------------GETS
   public byte getDia(){
      return dia;
   }
   
   public byte getMes(){
      return mes;
   }
   
   public int getAnio(){
      return anio;
   }
   //Despliega la fecha en la orden preferida
   public String toString(){
      return getDia()+"/"+getMes()+"/"+getAnio();
   }
}


//Guarda y acomoda la direccion de alguna persona
//Con esta clase se reutiliza el codigo para que otras clases la utilicen

class Direccion{
   private String calle;
   private int numeroCasa;
   private int codigoPostal;
   private String colonia;
   private String municipio;
   private String estado;
   private String pais;
   
   //Metodo Constructor
   public Direccion(String calle, int numeroCasa, int codigoPostal, String colonia, String municipio, String estado, String pais){
      setCalle(calle);
      setNumeroCasa(numeroCasa);
      setCodigoPostal(codigoPostal);
      setColonia(colonia);
      setMunicipio(municipio);
      setEstado(estado);
      setPais(pais);
   }
   
   public Direccion(){
   
   }
   //--------------------------------SETS
   public void setCalle(String calle){
      this.calle=calle;
   }
   
   public void setNumeroCasa(int numeroCasa){
      this.numeroCasa=numeroCasa;
   }
   
   public void setCodigoPostal(int codigoPostal){
      this.codigoPostal=codigoPostal;
   }
   
   public void setColonia(String colonia){
      this.colonia=colonia;
   }
   
   public void setMunicipio(String municipio){
      this.municipio=municipio;
   }
   
   public void setEstado(String estado){
      this.estado=estado;
   }
   
   public void setPais(String pais){
      this.pais=pais;
   }
   //--------------------------------GETS
   public String getCalle(){
      return calle;
   }
   
   public int getNumeroCasa(){
      return numeroCasa;
   }
   
   public int getCodigoPostal(){
      return codigoPostal;
   }
   
   public String getColonia(){
      return colonia;
   }
   
   public String getMunicipio(){
      return municipio;
   }
   
   public String getEstado(){
      return estado;
   }
   
   public String getPais(){
      return pais;
   }
   //Despliega la direccion en la orden preferida
   public String toString(){
      return getCalle()+" #"+getNumeroCasa()+", "+getColonia()+", "+
              getCodigoPostal()+", "+getMunicipio()+", "+getEstado()+
              ", "+getPais();
   }
}


//Guarda y acomoda el nombre completo de alguna persona
//Con esta clase se reutiliza el codigo para que otras clases la utilicen
class Nombre{
   private String nombre;
   private String aPaterno;
   private String aMaterno;
   
   //Metodo Constructor
   public Nombre(String nombre, String aPaterno, String aMaterno){
      setNombre(nombre);
      setAPaterno(aPaterno);
      setAMaterno(aMaterno);
   }
   //Metodos set
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   //Metodos Sets
   public void setAPaterno(String aPaterno){
      this.aPaterno=aPaterno;
   }
   //Metodos Sets
   public void setAMaterno(String aMaterno){
      this.aMaterno=aMaterno;
   }
   //Metodos gets
   public String getNombre(){
      return nombre;
   }
   //Metodos gets
   public String getAPaterno(){
      return aPaterno;
   }
   //Metodos gets
   public String getAMaterno(){
      return aMaterno;
   }
   //Despliega el nombre en la orden preferida
   public String toString(){
      return getNombre()+" "+getAPaterno()+" "+getAMaterno();
   }
}


//Guarda y acomoda los datos de los clientes

class Cliente{
   private Nombre nombre;
   private Direccion direccion;
   private String telefono;
   private String correo;
   private String rfc;
   //Metodo Constructor
   public Cliente(Nombre nombre, Direccion direccion, String telefono, String correo, String rfc){
      setNombre(nombre);
      setDireccion(direccion);
      setTelefono(telefono);
      setCorreo(correo);
      setRfc(rfc);   
   }
   
   public Cliente(){
   
   }
   //------------------------------------SET
   public void setNombre(Nombre nombre){
      this.nombre=nombre;
   }
   
   public void setDireccion(Direccion direccion){
      this.direccion=direccion;
   }
   
   public void setTelefono(String telefono){
      this.telefono=telefono;
   }
   
   public void setCorreo(String correo){
      this.correo=correo;
   }
   
   public void setRfc(String rfc){
      this.rfc=rfc;
   }
   //------------------------------------GET
   public Nombre getNombre(){
      return nombre;
   }
   
   public Direccion getDireccion(){
      return direccion;
   }
   
   public String getTelefono(){
      return telefono;
   } 
   
   public String getCorreo(){
      return correo;
   }
   
   public String getRfc(){
      return rfc;
   }
   //Despliega la informacion del cliente en la orden preferida
   public String toString(){
      return getNombre()+"\n"+getDireccion()+"\n"+getTelefono()+"\n"+
              getCorreo()+"\n"+getRfc();
   }
}


//Guarda y acomoda los datos de los colaboradores

class Colaborador{
   private Nombre nombre;
   private Direccion direccion;
   private int numeroNomina;
   private String correo;
   private int horasTrabajo;
   private float salarioHoras;
   private String telefono;
   //Metodo Constructor
   public Colaborador(Nombre nombre, Direccion direccion, int numeroNomina, 
           String correo, int horasTrabajo, float salarioHoras, String telefono){
      setNombre(nombre);
      setDireccion(direccion);
      setNumeroNomina(numeroNomina);
      setCorreo(correo);
      setHorasTrabajo(horasTrabajo);
      setSalarioHoras(salarioHoras);
      setTelefono(telefono);
   }
   
   public Colaborador(){
   
   }
   //--------------------------------------SETS
   public void setNombre(Nombre nombre){
      this.nombre=nombre;
   }
   
   public void setDireccion(Direccion direccion){
      this.direccion=direccion;
   }
   
   public void setNumeroNomina(int numeroNomina){
      this.numeroNomina=numeroNomina;
   }
   
   public void setCorreo(String correo){
      this.correo=correo;
   }
   
   public void setHorasTrabajo(int horasTrabajo){
      this.horasTrabajo=horasTrabajo;
   }
   
   public void setSalarioHoras(float salarioHoras){
      this.salarioHoras=salarioHoras;
   }
   
   public void setTelefono(String telefono){
      this.telefono=telefono;
   }
   //--------------------------------------GETS
   public Nombre getNombre(){
      return nombre;
   }
   
   public Direccion getDireccion(){
      return direccion;
   }
   
   public int getNumeroNomina(){
      return numeroNomina;
   } 
   
   public String getCorreo(){
      return correo;
   }
   
   public int getHorasTrabajo(){
      return horasTrabajo;
   }
   
   public float getSalarioHoras(){
      return salarioHoras;
   }
   
   public String getTelefono(){
      return telefono;
   }
   //Despliega la informacion del cliente en la orden preferida
   public String toString(){
      return getNombre()+"\n"+getNumeroNomina()+"\n"+getTelefono()+"\n"+getCorreo();
   }
}


//Guarda los datos de los productos

class Producto{
   protected String nombre;
   protected float precioVenta;
   protected float precioCompra;
   protected Fecha fechaEntrada;
   protected int codigoBarras;
   //Metodo Constructor
   public Producto(String nombre, float precioVenta, float precioCompra,
           Fecha fechaEntrada, int codigoBarras){
      setNombre(nombre);
      setPrecioVenta(precioVenta);
      setPrecioCompra(precioCompra);
      setFechaEntrada(fechaEntrada);
      setCodigoBarras(codigoBarras);
   }
   //---------------------------------------SETS
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   
   public void setPrecioVenta(float precioVenta){
      this.precioVenta=precioVenta;
   }
   
   public void setPrecioCompra(float precioCompra){
      this.precioCompra=precioCompra;
   }
   
   public void setFechaEntrada(Fecha fechaEntrada){
      this.fechaEntrada=fechaEntrada;
   }
   
   public void setCodigoBarras(int codigoBarras){
      this.codigoBarras=codigoBarras;
   }
   //---------------------------------------GETS
   public String getNombre(){
      return nombre;
   }
   
   public float getPrecioVenta(){
      return precioVenta;
   }
   
   public float getPrecioCompra(){
      return precioCompra;
   }
   
   public Fecha getFechaEntrada(){
      return fechaEntrada;
   }
   
   public int getCodigoBarras(){
      return codigoBarras;
   }
   
}


//Guarda los datos de los productos fisicos y despliega su nombre

class ProductoFisico extends Producto{
    private int unidades;
    private Fecha fechaCaducidad;
    //Metodo Constructor
    public ProductoFisico(String nombre, float precioVenta, float precioCompra, 
            Fecha fechaCaducidad, Fecha fechaEntrada, int codigoBarras, int unidades){
        super(nombre, precioVenta, precioCompra, fechaEntrada, codigoBarras);
        setUnidades(unidades);
        setFechaCaducidad(fechaCaducidad);
    }
    //---------------------------------------SETS
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
    
    public void setFechaCaducidad(Fecha fechaCaducidad){
      this.fechaCaducidad=fechaCaducidad;
    }
    //---------------------------------------GETS
    public int getUnidades(){
        return unidades;
    }
    
    public Fecha getFechaCaducidad(){
      return fechaCaducidad;
    }
    //Despliega el nombre y el codigo de barras del producto
    public String toString(){
        return nombre+" "+codigoBarras;
    }
}

//Guarda los datos de los productos digitales y despliega su nombre

public class ProductoDigital extends Producto{
    private String versionProducto;
    private float pesoMB;
    //Metodo Constructor
    public ProductoDigital(String nombre, float precioVenta, float precioCompra, Fecha fechaEntrada, int codigoBarras, String versionProducto, float pesoMB){
        super(nombre, precioVenta, precioCompra, fechaEntrada, codigoBarras);
        setVersionProducto(versionProducto);
        setPesoMb(pesoMB);
    }
    //---------------------------------------SETS
    public void setVersionProducto(String VersionProducto){
        this.versionProducto=versionProducto;
    }
    
    public void setPesoMb(float pesoMB){
        this.pesoMB=pesoMB;
    }
    //---------------------------------------GETS
    public String getVersionProducto(){
        return versionProducto;
    }
    
    public float getPesoMb(){
        return pesoMB;
    }
    //Despliega el nombre y el codigo de barras del producto
    public String toString(){
        return nombre+" "+codigoBarras;
    }
}


/*Guarda los detalles de los pedidos para asi ser usado despues en el metodo
de pedido
*/

class DetallePedido{
   private Producto producto;
   private int productosComprados;
   //Metodo Constructor
   public DetallePedido(Producto producto, int productosComprados){
      setProducto(producto);
      setProductosComprados(productosComprados);
   }
   
   public DetallePedido(){
   
   }
   //---------------------------------------SETS
   public void setProducto(Producto producto){
      this.producto=producto;
   }
   
   public void setProductosComprados(int productosComprados){
      this.productosComprados=productosComprados;
   }
   //---------------------------------------GETS
   public Producto getProducto(){
      return producto;
   }
   
   public int getProductosComprados(){
      return productosComprados;
   }
   //Este metodo calcula el subtotal de este detalle
   public float calcularSubtotal(){
      return getProducto().getPrecioVenta()*getProductosComprados();
   }
   //Este metodo calcula la ganancia de este detalle
   public float calcularGanancia(){
       return (getProducto().getPrecioVenta()-getProducto().getPrecioCompra())*
               getProductosComprados();
   }
}	


//Guarda los datos del pedido


public class Pedido {
    private Cliente cliente;
    private Colaborador colaborador;
    private DetallePedido[] producto = new DetallePedido[3];
    private Fecha fechaEntrega;
    private int idPedido;
    private Fecha fecha;
    //Metodo Constructor
    public Pedido(Cliente cliente, Colaborador colaborador, DetallePedido[] 
            producto, Fecha fechaEntrega, int idPedido, Fecha fecha){
        setCliente(cliente);
        setColaborador(colaborador);
        setDetallePedido(producto);
        setFechaEntrega(fechaEntrega);
        setIdPedido(idPedido);
        setFecha(fecha);
    }
    //---------------------------------------SETS
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    
    public void setColaborador(Colaborador colaborador){
        this.colaborador=colaborador;
    }
    
    public void setDetallePedido(DetallePedido[] producto){
        this.producto=producto;
    }
    
    public void setFechaEntrega(Fecha fechaEntrega){
        this.fechaEntrega=fechaEntrega;
    }
    
    public void setFecha(Fecha fecha){
        this.fecha=fecha;
    }
    
    public void setIdPedido(int idPedido){
        this.idPedido=idPedido;
    }
    //---------------------------------------GETS
    public Cliente getCliente(){
        return cliente;
    }
    
    public Colaborador getColaborador(){
        return colaborador;
    }
    
    public DetallePedido[] getDetallePedido(){
        return producto;
    }
    
    public Fecha getFechaEntrega(){
        return fechaEntrega;
    }
    
    public int getIdPedido(){
        return idPedido;
    }
    
    public Fecha getFecha(){
        return fecha;
    }
    //Este metodo calcula el total del pedido
    public float calcularTotal(){
        float sum=0;
        for(int i=0; i<3; i++){
            sum+=producto[i].calcularSubtotal();
        }
        return sum;
    }
    //Este metodo calcula la ganancia total del pedido
    public float calcularGananciaTotal(){
        float sum=0;
        for(int i=0; i<3; i++){
            sum+=producto[i].calcularGanancia();
        }
        return sum;
    }
    
    public String toString(){
        return " ";
    }
    
}


//Guarda los datos del almacen y despliega informacion importante de la misma


public class Almacen {
    private int idAlmacen;
    private Direccion direccion;
    private ArrayList<Pedido> pedido = new ArrayList<Pedido>();
    private float[] gastosServicio=new float[4];
    private Colaborador[] colaborador = new Colaborador[10];
    //Metodo Constructor
    public Almacen(int idAlmacen, Direccion direccion, float[] gastosServicio,
            ArrayList<Pedido> pedido, Colaborador[] colaborador){
        setIdAlmacen(idAlmacen);
        setDireccion(direccion);
        setGastosServicio(gastosServicio);
        setPedido(pedido);
        setColaborador(colaborador);
    }
    //---------------------------------------SETS
    public void setIdAlmacen(int idAlmacen){
        this.idAlmacen=idAlmacen;
    }
    
    public void setDireccion(Direccion direccion){
        this.direccion=direccion;
    }
    
    public void setGastosServicio(float[] gastosServicio){
        this.gastosServicio=gastosServicio;
    }
    
    public void setPedido(ArrayList<Pedido> pedido){
        this.pedido=pedido;
    }
    
    public void setColaborador(Colaborador[] colaborador){
        this.colaborador=colaborador;
    }
    //------------------------------GETS
    public int getIdAlmacen(){
        return idAlmacen;
    }
    
    public Direccion getDireccion(){
        return direccion;
    }
    
    public float[] getGastosServicio(){
        return gastosServicio;
    }
    
    public ArrayList<Pedido> getPedido(){
        return pedido;
    }
    
    public Colaborador[] getColaborador(){
        return colaborador;
    }
    
    public String toString(){
        return " "+getDireccion();
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistro = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRegistro.setText("Registro");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Brandon Grotesque", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALMACEN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon("/Users/ChuyBC/Desktop/bgjava.jpg")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed

        if (frmReg == null) {

            frmReg = new registro();
            frmReg.setVisible(true);
        }

    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (frmLog == null) {
            frmLog = new login();
            frmLog.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
