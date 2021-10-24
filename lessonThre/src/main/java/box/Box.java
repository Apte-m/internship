package box;

import animal.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Box<V extends Animal> {
    private Map<String, V> animalBox = new HashMap<>();
    BoxSize size;

    public Box(BoxSize size) {
        this.size = size;
    }

    public Map<String, V> getAnimalBox() {
        return animalBox;
    }


    public void setAnimalBox(Map<String, V> animalBox) {
        this.animalBox = animalBox;
    }


    public void addAnimal(V animal) {
        if (size != animal.getSize()) {
            return;
        }
        animalBox.put(animal.getName(), animal);
        return;


    }

    public Animal getName(String name) {
        return animalBox.get(name);
    }

    public Animal removeAnimal(String name) {
        return animalBox.remove(name);
    }


    @Override
    public String toString() {
        return "Box{" +
                "animalBox=" + animalBox + '}';
    }
}


