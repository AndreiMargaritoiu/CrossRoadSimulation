import java.util.Arrays;

public class Controller {

    int num1 = CrossRoad.north.getNumberOfCars();
    int num2 = CrossRoad.south.getNumberOfCars();
    int num3 = CrossRoad.east.getNumberOfCars();
    int num4 = CrossRoad.west.getNumberOfCars();

//    public void sort(){
//        int[] arr = {num1, num2, num3, num4};
//        Arrays.sort(arr);
//    }

    int a, b, c, d;

    public void dothecheck1(){
        // checking value of num1 against the other fourth values
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            a = num1;
            CrossRoad.tlNorth.setPosition(true);
        }
        if (num1 < num2 && num1 > num3 && num1 > num4){
            b = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 < num3 && num1 > num4){
            c = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 < num3 && num1 < num4){
            d = num1;
            CrossRoad.tlNorth.setPosition(false);
        }

        // checking value of num2 against the other fourth values
        if (num2 > num1 && num2 > num3 && num2 > num4) {
            a = num2;
            CrossRoad.tlSouth.setPosition(true);
        }
        if (num2 < num1 && num2 > num3 && num2 > num4){
            b = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 < num3 && num2 > num4){
            c = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4){
            d = num2;
            CrossRoad.tlSouth.setPosition(false);
        }

        // checking value of num3 against the other fourth values
        if (num3 > num2 && num3 > num1 && num3 > num4) {
            a = num3;
            CrossRoad.tlEast.setPosition(true);
        }
        if (num3 < num2 && num3 > num1 && num3 > num4){
            b = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 < num1 && num3 > num4){
            c = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 < num1 && num3 < num4){
            d = num3;
            CrossRoad.tlEast.setPosition(false);
        }

        // checking value of num4 against the other fourth values
        if (num4 > num1 && num4 > num2 && num4 > num3) {
            a = num4;
            CrossRoad.tlWest.setPosition(true);
        }
        if (num4 < num1 && num4 > num2 && num4 > num3) {
            b = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 < num2 && num4 > num3) {
            c = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3) {
            d = num4;
            CrossRoad.tlWest.setPosition(false);
        }
    }


    public void dothecheck2(){
        // checking value of num1 against the other fourth values
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            a = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 > num3 && num1 > num4){
            b = num1;
            CrossRoad.tlNorth.setPosition(true);
        }
        if (num1 < num2 && num1 < num3 && num1 > num4){
            c = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 < num3 && num1 < num4){
            d = num1;
            CrossRoad.tlNorth.setPosition(false);
        }

        // checking value of num2 against the other fourth values
        if (num2 > num1 && num2 > num3 && num2 > num4) {
            a = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 > num3 && num2 > num4){
            b = num2;
            CrossRoad.tlSouth.setPosition(true);
        }
        if (num2 < num1 && num2 < num3 && num2 > num4){
            c = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4){
            d = num2;
            CrossRoad.tlSouth.setPosition(false);
        }

        // checking value of num3 against the other fourth values
        if (num3 > num2 && num3 > num1 && num3 > num4) {
            a = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 > num1 && num3 > num4){
            b = num3;
            CrossRoad.tlEast.setPosition(true);
        }
        if (num3 < num2 && num3 < num1 && num3 > num4){
            c = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 < num1 && num3 < num4){
            d = num3;
            CrossRoad.tlEast.setPosition(false);
        }

        // checking value of num4 against the other fourth values
        if (num4 > num1 && num4 > num2 && num4 > num3) {
            a = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 > num2 && num4 > num3) {
            b = num4;
            CrossRoad.tlWest.setPosition(true);
        }
        if (num4 < num1 && num4 < num2 && num4 > num3) {
            c = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3) {
            d = num4;
            CrossRoad.tlWest.setPosition(false);
        }
    }


    public void dothecheck3(){
        // checking value of num1 against the other fourth values
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            a = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 > num3 && num1 > num4){
            b = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 < num3 && num1 > num4){
            c = num1;
            CrossRoad.tlNorth.setPosition(true);
        }
        if (num1 < num2 && num1 < num3 && num1 < num4){
            d = num1;
            CrossRoad.tlNorth.setPosition(false);
        }

        // checking value of num2 against the other fourth values
        if (num2 > num1 && num2 > num3 && num2 > num4) {
            a = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 > num3 && num2 > num4){
            b = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 < num3 && num2 > num4){
            c = num2;
            CrossRoad.tlSouth.setPosition(true);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4){
            d = num2;
            CrossRoad.tlSouth.setPosition(false);
        }

        // checking value of num3 against the other fourth values
        if (num3 > num2 && num3 > num1 && num3 > num4) {
            a = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 > num1 && num3 > num4){
            b = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 < num1 && num3 > num4){
            c = num3;
            CrossRoad.tlEast.setPosition(true);
        }
        if (num3 < num2 && num3 < num1 && num3 < num4){
            d = num3;
            CrossRoad.tlEast.setPosition(false);
        }

        // checking value of num4 against the other fourth values
        if (num4 > num1 && num4 > num2 && num4 > num3) {
            a = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 > num2 && num4 > num3) {
            b = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 < num2 && num4 > num3) {
            c = num4;
            CrossRoad.tlWest.setPosition(true);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3) {
            d = num4;
            CrossRoad.tlWest.setPosition(false);
        }
    }


    public void dothecheck4(){
        // checking value of num1 against the other fourth values
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            a = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 > num3 && num1 > num4){
            b = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 < num3 && num1 > num4){
            c = num1;
            CrossRoad.tlNorth.setPosition(false);
        }
        if (num1 < num2 && num1 < num3 && num1 < num4){
            d = num1;
            CrossRoad.tlNorth.setPosition(true);
        }

        // checking value of num2 against the other fourth values
        if (num2 > num1 && num2 > num3 && num2 > num4) {
            a = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 > num3 && num2 > num4){
            b = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 < num3 && num2 > num4){
            c = num2;
            CrossRoad.tlSouth.setPosition(false);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4){
            d = num2;
            CrossRoad.tlSouth.setPosition(true);
        }

        // checking value of num3 against the other fourth values
        if (num3 > num2 && num3 > num1 && num3 > num4) {
            a = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 > num1 && num3 > num4){
            b = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 < num1 && num3 > num4){
            c = num3;
            CrossRoad.tlEast.setPosition(false);
        }
        if (num3 < num2 && num3 < num1 && num3 < num4){
            d = num3;
            CrossRoad.tlEast.setPosition(true);
        }

        // checking value of num4 against the other fourth values
        if (num4 > num1 && num4 > num2 && num4 > num3) {
            a = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 > num2 && num4 > num3) {
            b = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 < num2 && num4 > num3) {
            c = num4;
            CrossRoad.tlWest.setPosition(false);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3) {
            d = num4;
            CrossRoad.tlWest.setPosition(true);
        }
    }
}
