
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import com.google.gson.Gson;

class StarWarsCharacter {
    private String name;
    private String height;
    private String mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeworld;
    private String species;

    public StarWarsCharacter() { 
        // empty default constructor -> iitializes all attributes in StarWarsCharacter
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String toString() {
        return "StarWarsCharacter{" +
                "name='" + name + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", gender='" + gender + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}

public class JarJarBinks {

    public static void main(String[] args) {

        List<StarWarsCharacter> charactersList = new ArrayList<>();
        Reader in = new FileReader("characters.csv");
        CSVFormat CSVparser = CSVFormat.Builder.create().setHeader().build();
        Iterable<CSVRecord> records = CSVparser.parse(in);

            
        for (CSVRecord record : records) {
            StarWarsCharacter character = new StarWarsCharacter();
            character.setName(record.get("name"));
            character.setHeight(record.get("height"));
            character.setMass(record.get("mass"));
            character.setHairColor(record.get("hair_color"));
            character.setSkinColor(record.get("skin_color"));
            character.setEyeColor(record.get("eye_color"));
            character.setBirthYear(record.get("birth_year"));
            character.setGender(record.get("gender"));
            character.setHomeworld(record.get("homeworld"));
            character.setSpecies(record.get("species"));

            charactersList.add(character);
        
        }

        Writer out = new FileWriter("characters.json");
        Gson gson = new Gson();
        gson.toJson(charactersList, out);
        out.close();

    }
}