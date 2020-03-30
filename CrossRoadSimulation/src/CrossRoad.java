import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CrossRoad {
    //objects needed for a road intersection
    static public Lane south, north, west, east;
    static public TrafficLight tlSouth, tlNorth, tlWest, tlEast;
    private Set<Integer> idCars;

    public void intersection(){
        for (int z =0; z<500; z++){
            if(z%100 == 0){
                south = new Lane(Lane.DIRECTION_SOUTH);
                north = new Lane(Lane.DIRECTION_NORTH);
                west = new Lane(Lane.DIRECTION_WEST);
                east = new Lane(Lane.DIRECTION_EAST);

                //traffic lights
                tlSouth = new TrafficLight();
                tlNorth = new TrafficLight();
                tlEast = new TrafficLight();
                tlWest = new TrafficLight();

                //create set for id so that one car can't be on multiple lanes
                idCars = new HashSet<>();
                Random random = new Random();

                //SetSouthCars
                ArrayList<Car> carsSouth = new ArrayList<>();
                for (int i = 0; i < random.nextInt(150) + 15; i = i + random.nextInt(7)) {
                    //add to set the id
                    if (!idCars.contains(i)) {
                        //addToSet
                        idCars.add(i);
                        Car car = new Car(i);
                        carsSouth.add(car);
                    }
                }
                south.addCars(carsSouth);

                //SetNorthCars
                ArrayList<Car> carsNorth = new ArrayList<>();
                for (int i = 0; i < random.nextInt(150) + 15; i = i + random.nextInt(7)) {
                    //add to set the id
                    if (!idCars.contains(i)) {
                        //addToSet
                        idCars.add(i);
                        Car car = new Car(i);
                        carsNorth.add(car);
                    }
                }
                if (carsNorth.size() == carsSouth.size()){
                    carsNorth.remove(carsNorth.size()-1);
                }
                north.addCars(carsNorth);

                //AddWestCars
                ArrayList<Car> carsWest = new ArrayList<>();
                for (int i = 0; i < random.nextInt(150) + 15; i = i + random.nextInt(7)) {
                    //add to set the id
                    if (!idCars.contains(i)) {
                        //addToSet
                        idCars.add(i);
                        Car car = new Car(i);
                        carsWest.add(car);
                    }
                }
                if (carsWest.size() == carsSouth.size()){
                    carsWest.remove(carsWest.size()-1);
                }
                if (carsNorth.size() == carsWest.size()) {
                    carsWest.remove(carsWest.size() - 1);
                }
                west.addCars(carsWest);

                //AddEastCars
                ArrayList<Car> carsEast = new ArrayList<>();
                for (int i = 0; i < random.nextInt(150) + 15; i = i + random.nextInt(7)) {
                    //add to set the id
                    if (!idCars.contains(i)) {
                        //addToSet
                        idCars.add(i);
                        Car car = new Car(i);
                        carsEast.add(car);
                    }
                }
                if (carsEast.size() == carsSouth.size()){
                    carsEast.remove(carsEast.size()-1);
                }
                if (carsEast.size() == carsNorth.size()){
                    carsEast.remove(carsEast.size()-1);
                }
                if (carsEast.size() == carsWest.size()){
                    carsEast.remove(carsEast.size()-1);

                }
                east.addCars(carsEast);
            }
        }
    }
}
