package com.example.crudmysql_wendy;

public class Config {


    public static final String urlGuardar = "http://192.168.185.100/mysqlcrud/guardar.php";                               //Guardar datos DB.

    public static final String urlEliminar = "http://192.168.43.46/mysqlcrud/eliminar.php";                             //Eliminar datos DB.
    public static final String urlActualizar = "http://192.168.43.46/mysqlcrud/actualizar.php";                          //Actualizar datos DB.

    public static final String urlConsultaApiMySQLi = "http://192.168.43.46/mysqlcrud/Api.php";                          //Ver todos los registros DB.
    public static final String urlConsultaApiPDO = "http://192.168.43.46/mysqlcrud/buscarAll.php";                       //Ver todos los registros DB.

    public static final String urlConsultaCodigo = "http://192.168.43.46/mysqlcrud/buscarArticulosCodigo.php";            //Busquedas por código.
    public static final String urlConsultaDescripcion = "http://192.168.43.46/mysqlcrud/buscarArticulosDescripcion.php";  //Busquedas por descripción.
    public static final String urlConsultaAllArticulos = "http://192.168.43.46/mysqlcrud/buscarArticulos.php";
}
