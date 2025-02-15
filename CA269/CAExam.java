import java.util.Map;

interface Weather {
    String getName();
    int getDuration();
    // Boolean output required (True/false)
    boolean wasItRaining();
    boolean wasItSunny();
    boolean wasItWindy();
    boolean wasItSnowy();
}

class TypicalDay implements Weather {

    String name = "Typical Day";
    int duration = 1440;
    String rainLocation;
    boolean wasItRaining = true;
    boolean wasItSunny = true;
    boolean wasItWindy = true;
    boolean wasItSnowy = true;

    public TypicalDay(String name, int duration, String rainLocation, boolean wasItRaining, boolean wasItSunny, boolean wasItWindy, boolean wasItSnowy) {
        this.name = name;
        this.duration = duration;
        this.rainLocation = rainLocation;
        this.wasItRaining = wasItRaining;
        this.wasItSunny = wasItSunny;
        this.wasItWindy = wasItWindy;
        this.wasItSnowy = wasItSnowy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        if (name.length() > 5) {
            this.name = name;
        }
        else {
            this.name = null;
        }

    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        if (duration > 60) {
            this.duration = duration;
        }

    }

}

//////////////////////////////////////////////////////

class WeatherStation {

    public final Map<String, Integer> pair;
    WeatherStation(Weather weathermap) {
        this.pair = new Map<>();
        
    }

    public addWeather (weather weatherInstance) {
        return weather;
        
    }

    public String toString() {
        // representing the type of weather for the total number of hours
        return pair.String + ": " + pair.Integer;
    }

}

///////////////////////////////////////////////////////

class SingleWeather<T extends Weather> {
    private T singleton;

    public T getSingleton() {
        return this.singleton;
    }

    public void setInstance(T singleton) {
        this.singleton = singleton;
    }

}