/**
 * Created by sergiy on 05.03.16.
 * Java Programmer lessons
 * kademika.com
 */
public class Car {

    private Color color;
    private Direction direction;
    private String vendor;
    private String model;
    private int shift;
    private int maxShift;
    private int speed;
    private int maxSpeed;
    private int distance;
    private boolean transmissionManual; // manual = true; automatic = false;

    public Car() {
        this(Color.WHITE, "BMW", "X1", 5, 240, false);
    }

    public Car(Color color, String vendor, String model, int maxShift, int maxSpeed, boolean transmissionManual) {
        this.color = color;
        this.vendor = vendor;
        this.model = model;
        this.maxShift = maxShift;
        this.maxSpeed = maxSpeed;
        this.transmissionManual = transmissionManual;
        this.direction=Direction.FWD;
        out("NEW\tdetails: "+this.color+", "+this.maxShift+getTransmissionType()+", max.sp. "+this.maxSpeed);
    }

    public void move(int dist){
        out("MOVE\tCurrent distance  = " + String.valueOf(this.distance));
        out("MOVE\tCurrent direction = " + String.valueOf(this.direction));
        out("MOVE\tCurrent shift     = " + String.valueOf(this.shift));
        for (int i=0; i<dist;i++) movePrivate();
        out("MOVE\tNew distance      = " + String.valueOf(this.distance));
    }
    private void movePrivate(){
        this.distance+=1;
    }
    public void move(){
        out("MOVE\tCurrent distance  = " + String.valueOf(this.distance));
        out("MOVE\tCurrent direction = " + String.valueOf(this.direction));
        out("MOVE\tCurrent shift     = " + String.valueOf(this.shift));
        this.distance+=1;
        out("MOVE\tNew distance      = " + String.valueOf(this.distance));
    }

    public void turn(Direction dir){
        out("TURN\tCurrent direction = " + String.valueOf(this.direction));
        out("TURN\tNew     direction = " + String.valueOf(dir));
        if (this.direction.equals(dir)) return;
        this.direction=dir;
    }

    public void shiftTransmission(Shift sh){
        out("SHIFT\t" + String.valueOf(sh));
        out("SHIFT\tCurrent shift = " + String.valueOf(this.shift));
        if (String.valueOf(sh).equals(Shift.UP) && this.shift < this.maxShift) this.shift +=1;
        if (String.valueOf(sh).equals(Shift.DOWN) && this.shift >0) this.shift -=1;
        out("SHIFT\tNew     shift = " + String.valueOf(this.shift));
    }

    public String getTransmissionType(){
        if (isTransmissionManual()) return "MANUAL";
        else return "AUTO";
    }

    public boolean isTransmissionManual() {
        return transmissionManual;
    }

    public void outInfo(){
        out("SHOW\tdetails: "+this.color+", "+this.maxShift+getTransmissionType()+", max.sp."+this.maxSpeed+", "
        +", dist.cntr."+this.distance+", cur.direct."+this.direction);
    }

    private void out(String s){
        System.out.println("["+this.vendor+" "+this.model+"]\t"+s);
    }
}
