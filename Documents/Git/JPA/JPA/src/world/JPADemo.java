package world;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import world.domain.City;
import world.domain.Country;

public class JPADemo {

	
	/* Find cities in database by name.
	 * @param name is the name of the city to find
	 */
	
	public static void findCity(String name){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("world");
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("SELECT c from City c where c.name = :name");
		query.setParameter("name", name);
		List<City> cities = query.getResultList();
		System.out.printf("Found %d matches for %s\n", cities.size(), name);
		for(City c : cities)
			System.out.println(c);
			}
	
	public static void findACountry(String name){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("world");
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("SELECT cn from Country cn where cn.name = :name");
		query.setParameter("name", name);
		
		Country countryToFind = (Country) query.getSingleResult();
		
		
		System.out.printf("Found country %s\n", name);
		System.out.println(countryToFind);
		
		
	}
	
		
	public static void main(String[] args){
		findCity("Los Angeles");
		
		String countryName;
		Scanner keyboard = new Scanner(System.in);
		for(;;){
						
				System.out.println("Enter a country you want to search: ");
				countryName = keyboard.nextLine();
				findACountry(countryName);
						
		}
	}
	
	
}
