public class CyclesHomework_1 {
    public static void main(String[] args) {

        System.out.println("Вторая задача");
        System.out.print("x | ");
        for (double x = -4.0; x <= 10.0; x += 0.5) {
            System.out.print(x + " | ");
        }
        System.out.println();
        System.out.print("y | ");
        double x = -4.0;
        while (x <= 10.0) {
            if (x >= -4.0 && x < -2.0) {
                System.out.print(1*(x+4)-1 + " | ");
            } else {
                if (x >= -2 && x <= 4) {
                    System.out.print(-0.5*(x+2)+1 + " | ");
                } else {
                    if (x > 4 && x <= 6) {
                        System.out.print(-2 + " | ");
                    } else {
                        if (x > 6 && x <= 10) {
                            System.out.print(  Math.sqrt(Math.abs(4 - x * x))  +  " | ");
                        }

                    }
                }
            }
            x += 0.5;
        }
    }
}


