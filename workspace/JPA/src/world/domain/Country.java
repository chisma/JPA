package world.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Country {
	@Id
	private String Code;
	private String name;
	private String continent;
	private String region;
	private long population;
	@OneToOne
	@JoinColumn(name = "capital")
	private City capital;
	@OneToMany(mappedBy = "country", fetch=FetchType.LAZY)
	private Set<City> cities;
	
	protected Country(){
		super();
	}
		
	public void setCities(List<City> citiesToAddToSet) {
		
		for(City city:citiesToAddToSet){
			this.cities.add(city);
		}
		
	}

		
	public Set<City> getCities() {
		return cities;
	}


	public String getCapital() {
		return capital.getName();
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}


	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country name=" + name + ", continent=" + continent + ", population=" + population;
	}
	

}
