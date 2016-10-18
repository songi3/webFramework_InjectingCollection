package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/spring/di/deans/wildLife.xml");
		AnimalCollection animalCollection = (AnimalCollection) context.getBean("arrayCollection");

		System.out.println("animalList : " + animalCollection.getAnimalList());
		System.out.println("animalMap : " + animalCollection.getAnimalMap());
		System.out.println("animalSet : " + animalCollection.getAnimalSet());
		System.out.println("animalProps : " + animalCollection.getAnimalPro());

	}

}
