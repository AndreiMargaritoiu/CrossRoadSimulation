import javax.swing.*;
import java.awt.*;
import static java.lang.Thread.sleep;

public class Simulator extends JFrame implements Runnable {

    JButton butn, buts, butw, bute;
    JTextArea tf;
    private static final int WIDTH = 500, HEIGHT = 400;

    public Simulator() {
        JPanel p;
        JFrame frame = new JFrame("Intersection");
        frame.setSize(WIDTH, HEIGHT);
        p = new JPanel();
        p.setLayout(null);

        tf = new JTextArea();
        tf.setText("Current situation in the intersection: " +
                "\n" + "Cars on north: " + CrossRoad.north.getNumberOfCars() +
                "\n" + "Cars on south: " + CrossRoad.south.getNumberOfCars() +
                "\n" + "Cars on west: " + CrossRoad.west.getNumberOfCars() +
                "\n" + "Cars on east: " + CrossRoad.east.getNumberOfCars());
        tf.setBounds(150, 100, 200, 170);
        p.add(tf);

        butn = new JButton("N");
        butn.setBounds(220, 10, 60, 60);
        p.add(butn);
        buts = new JButton("S");
        buts.setBounds(220, 290, 60, 60);
        p.add(buts);
        bute = new JButton("E");
        bute.setBounds(420, 150, 60, 60);
        p.add(bute);
        butw = new JButton("W");
        butw.setBounds(10, 150, 60, 60);
        p.add(butw);

        frame.add(p);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void run() {
        Controller c = new Controller();
        butw.setBackground(Color.RED);
        butn.setBackground(Color.RED);
        bute.setBackground(Color.RED);
        buts.setBackground(Color.RED);
        for (int i = 0; i < 40; i++) {
            c.dothecheck1();
            if (CrossRoad.tlNorth.getPosition() == true) {
                butn.setBackground(Color.GREEN);
                buts.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlSouth.getPosition() == true) {
                buts.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlEast.getPosition() == true) {
                bute.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                butn.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlWest.getPosition() == true) {
                butw.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                buts.setBackground(Color.RED);
            }
            try {
                sleep(250);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        butw.setBackground(Color.RED);
        butn.setBackground(Color.RED);
        bute.setBackground(Color.RED);
        buts.setBackground(Color.RED);
        for(int i =0; i<30; i++){
            c.dothecheck2();
            if (CrossRoad.tlNorth.getPosition() == true) {
                butn.setBackground(Color.GREEN);
                buts.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
                //CrossRoad.tlNorth.setPosition(false);
            } else if (CrossRoad.tlSouth.getPosition() == true) {
                buts.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
                //CrossRoad.tlSouth.setPosition(false);
            } else if (CrossRoad.tlEast.getPosition() == true) {
                bute.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                butn.setBackground(Color.RED);
                butw.setBackground(Color.RED);
                //CrossRoad.tlEast.setPosition(false);
            } else if (CrossRoad.tlWest.getPosition() == true) {
                butw.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                buts.setBackground(Color.RED);
                //CrossRoad.tlWest.setPosition(false);
            }
            try {
                sleep(250);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        butw.setBackground(Color.RED);
        butn.setBackground(Color.RED);
        bute.setBackground(Color.RED);
        buts.setBackground(Color.RED);
        for(int i = 0; i <20; i++){
            c.dothecheck3();
            if (CrossRoad.tlNorth.getPosition() == true) {
                butn.setBackground(Color.GREEN);
                buts.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlSouth.getPosition() == true) {
                buts.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlEast.getPosition() == true) {
                bute.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                butn.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlWest.getPosition() == true) {
                butw.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                buts.setBackground(Color.RED);
            }
            try {
                sleep(250);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        butw.setBackground(Color.RED);
        butn.setBackground(Color.RED);
        bute.setBackground(Color.RED);
        buts.setBackground(Color.RED);
        for(int i = 0; i < 10; i++){
            c.dothecheck4();
            if (CrossRoad.tlNorth.getPosition() == true) {
                butn.setBackground(Color.GREEN);
                buts.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlSouth.getPosition() == true) {
                buts.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlEast.getPosition() == true) {
                bute.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                butn.setBackground(Color.RED);
                butw.setBackground(Color.RED);
            } else if (CrossRoad.tlWest.getPosition() == true) {
                butw.setBackground(Color.GREEN);
                butn.setBackground(Color.RED);
                bute.setBackground(Color.RED);
                buts.setBackground(Color.RED);
            }
            try {
                sleep(250);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        butw.setBackground(Color.RED);
        butn.setBackground(Color.RED);
        bute.setBackground(Color.RED);
        buts.setBackground(Color.RED);
    }
//    public  void close()
//    {
//        this.setVisible(false);
//        this.dispose();
//    }

    public static void main(String[] args) {

        for (int z =0; z<500; z++) {
            if (z % 101 == 0) {
                CrossRoad cr = new CrossRoad();
                cr.intersection();
                Simulator sim = new Simulator();
                sim.run();
            }

        }
    }
}
