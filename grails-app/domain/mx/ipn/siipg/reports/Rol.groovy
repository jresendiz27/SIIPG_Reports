package mx.ipn.siipg.reports

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='rol')
@ToString(includes='rol', includeNames=true, includePackage=false)
class Rol implements Serializable {

	String rol

	Rol(String authority) {
		this()
		this.rol = authority
	}

	static constraints = {
		rol blank: false, unique: true
	}

	static mapping = {
		cache true
        version false
        id column: 'id'
		rol column: 'rol'
	}
}
