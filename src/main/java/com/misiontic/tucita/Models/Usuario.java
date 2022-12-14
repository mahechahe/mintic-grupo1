package com.misiontic.tucita.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

/**
 * Modelo de usuario que sera almacenado en la base de datos
 *
 * @author Yelan
 */
@Entity
@Getter
@Setter
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Column(name = "email")
    private String email;
    @Column(name = "apellido_usuario")
    private String apellidoUsuario;
    @JsonIgnore
    private String contraseña;

    //RELACION MUCHOS A MUCHOS PARA LOS ROLES DEL USUARIO
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuario_roles",
            joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "id"))
    private Collection<Rol> roles;
    
   /* @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private List<Servicio> servicios = new ArrayList<Servicio>();
*/
    public Usuario() {
    }

    public Usuario(String nombreUsuario, String email, String apellidoUsuario, String contraseña, Collection<Rol> rol) {
        super();
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.apellidoUsuario = apellidoUsuario;
        this.contraseña = contraseña;
        this.roles = rol;

    }

    public Usuario(Long idUSUARIO, String nombreUsuario, String apellidoUsuario, String email, String pass, Collection<Rol> rol) {
        super();
        this.id = idUSUARIO;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.email = email;
        this.contraseña = pass;
        this.roles = rol;

    }
 
}
