public class Lasagna {
    private int defaultTime = 40;
    private int lasangaSingleLayerPreparationTime = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return defaultTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int lasangaTime) {
        int remainingTime = defaultTime-lasangaTime;
        return remainingTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int lasangaLayers) {
        int lasangaLayerPreparationTime = lasangaLayers * lasangaSingleLayerPreparationTime;
        return lasangaLayerPreparationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int lasangaLayers,int lasangaOvenTime) {
        int totalTime = preparationTimeInMinutes(lasangaLayers) + lasangaOvenTime;
        return totalTime;
    }
}
