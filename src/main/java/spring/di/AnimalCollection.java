package spring.di;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AnimalCollection {

	List<String> animalList;
	Map<String, String> animalMap;
	Set<String> animalSet;
	Properties animalPro;

}
