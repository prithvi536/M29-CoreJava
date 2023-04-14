package org.tnsif.hierarchicalinheritance;


//child class 1
public class Snowcone extends Android {
	private int versionName;
	private String modelName;
	public int getVersionName() {
		return versionName;
	}
	public void setVersionName(int versionName) {
		this.versionName = versionName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public Snowcone() {
		System.out.println("default constructor for child class 1");
	}
	
	public Snowcone(int versionName, String modelName) {
		super();
		this.versionName = versionName;
		this.modelName = modelName;
	}
	
	@Override
	public String toString() {
		return "Snowcone [versionName=" + versionName + ", modelName=" + modelName + ", getBrand()=" + getBrand()
				+ ", getOwnerName()=" + getOwnerName() + "]";
	}

}
