public class _Launcher {

    public static void main(String[] args) {
        Car vaz    = new Car(Color.YELLOW,"VAZ","Granta",5,180,true);
        Car tavria = new Car(Color.BLUE,"Tavria","1102",4,140,true);
        Car mers = new Car(Color.RED,"Mercedes","CLK 200",7,240,false);
        Car def = new Car();

        mers.turn(Direction.LEFT); mers.move(200);
        def.turn(Direction.BACK); def.move(); def.turn(Direction.RIGHT);
        tavria.turn(Direction.FWD); tavria.move(2000);
        vaz.turn(Direction.RIGHT); mers.move(100);

        mers.outInfo();
        def.outInfo();
        vaz.outInfo();
        tavria.outInfo();

    }
}
