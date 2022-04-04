package com.Civil.Civil.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "info_Usuario")
public class User {

    @Id// creamos un id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto es para que se auto incremente cuando creamos un usuario
    @Column(name = "Id_ususario", nullable = false, unique = true)
    private Long id;

    @Column(name = "Nombre", nullable = false)// se van a representar como columnas a nivel de base de datos
    private String name;

    @Column(name = "Apellido", nullable = false)
    private String apellido;

    @Column(name = "Cedula", nullable = false)
    private String cedula;

    @Column(name = "Correo", nullable = false)
    private String correo;

    @Column(name = "Contraseña", nullable = false)
    private String contrasena;

    @Column(name = "Telefono", nullable = false)
    private Long telefono;

    @Column(name = "Rol", nullable = false)
    private Long rol;

    @Column(name = "N_Unidad", nullable = false)
    private String numUnidad;

    @Column(name = "Departamento", nullable = false)
    private String departamento;

    @Column(name = "Municipio", nullable = false)
    private String municipio;

    @Column(name = "Barrio", nullable = false)
    private String barrio;

    @Column(name = "Nivel_Formacion", nullable = false)
    private String nivelFormacio;

    @Column(name = "Autorizo_Datos", nullable = false)
    private int autorizoDatos;

}
