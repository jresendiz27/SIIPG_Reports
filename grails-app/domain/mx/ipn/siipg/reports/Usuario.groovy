package mx.ipn.siipg.reports

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes = 'rfc')
@ToString(includes = 'rfc', includeNames = true, includePackage = false)
class Usuario implements Serializable {

    private static final long serialVersionUID = 1

    String rfc
    String username
    String password
    String email
    Integer rol_id
    transient boolean enabled = true
    transient boolean accountExpired = false
    transient boolean accountLocked = false
    transient boolean passwordExpired = false

    Usuario(String rfc, String password) {
        this()
        this.username = rfc
        this.rfc = rfc
        this.password = password
    }

    Set<Rol> getAuthorities() {
        Rol userRol = Rol.get(this.rol_id)
        [userRol] as Set
    }


    static constraints = {
        rfc blank: false, unique: true
        password blank: false
    }

    String getUsername() {
        return this.rfc
    }

    static mapping = {
        version false

        rfc column: 'rfc'
        username column: 'rfc', insertable: false, updateable: false
        email column: 'email'
        password column: 'password'
        rol_id column: 'rol_id'
    }
}
