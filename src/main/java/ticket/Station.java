package ticket;

public class Station {
    public static final Station RAINBOW=
            new Station(50,"彩虹國");
    public static final Station PONY=
            new Station(50,"小馬國");
    public static final Station METEOR=
            new Station(50,"流星國");
    int id;
    String name;
    public Station(int id, String name) {
        this.id = id;
        this.name = name;

    }}

