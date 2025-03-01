package Stack;

import java.util.Arrays;

public class CarFleet {
    class Car{
        private int pos;
        private double time;
        Car(int pos, double time){
            this.pos = pos;
            this.time = time;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Car[] c = new Car[n];

        for(int i =0;i<n;i++){
            c[i] = new Car(position[i],(double) (target-position[i])/speed[i]);
        }
        Arrays.sort(c,(a,b)->b.pos-a.pos);
        int res = 0;
        double prevTime = c[0].time;
        for(int i =1;i<n;i++){
            if(c[i].time>prevTime){
                res++;
                prevTime = c[i].time;
            }
        }
        return res;
    }
}
