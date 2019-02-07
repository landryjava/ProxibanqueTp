package com.objis.cameroun.proxibanque.domaine;

public class Role {

	private String libeleRole;

	public Role(String libeleRole) {
		super();
		this.libeleRole = libeleRole;
	}

	public String getLibeleRole() {
		return libeleRole;
	}

	public void setLibeleRole(String libeleRole) {
		this.libeleRole = libeleRole;
	}

	public String toString() {
		return "Role [libeleRole=" + libeleRole + "]";
	}
	
	

}
