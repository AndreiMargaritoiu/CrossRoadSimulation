import java.util.ArrayList;

public class Lane {
    //directions
    public static final int DIRECTION_NORTH = 0;
    public static final int DIRECTION_SOUTH = 1;
    public static final int DIRECTION_WEST = 2;
    public static final int DIRECTION_EAST = 3;

    //diretion of the lane
    private int direction;
    private ArrayList<Car> carArrayList;

    public Lane(int direction) {
        //set direction and create new arraylist
        this.direction = direction;

    }

    //setter & getter for number of cars
    public int getNumberOfCars() {
        return carArrayList.size();
    }

    //ArrayList of cars;
    public void addCars(ArrayList<Car> cList) {
        this.carArrayList = cList;
    }
}
