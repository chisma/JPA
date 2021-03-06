package world.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * A City in a country.
 * 
 *  * @author Soumya
 *
 */
@Entity
public class City {
	@Id
	private Integer iD;
	private String name;
	private String district;
	private int population;
	@ManyToOne
	@JoinColumn(name = "countrycode")
	private Country country;
	
	
	
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Integer getiD() {
		return iD;
	}
	public void setiD(Integer iD) {
		this.iD = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "City name=" + name + ", population=" + population;
	}
	
	
	
	
	
	
}
