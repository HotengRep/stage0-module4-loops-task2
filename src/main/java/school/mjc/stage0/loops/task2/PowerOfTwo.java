package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        int result = 1;

        if(power < 0)
        {
            System.out.println("too much power");
            return;
        }

        while (counter <= power)
        {
            result = (int)Math.pow(2,counter);
            System.out.println(result);
            counter++;
        }
    }
}
