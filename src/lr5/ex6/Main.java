package lr5.ex6;

public class Main {
    public static void main(String[] args) {
        IntegerField a = new IntegerField();
        a.setMaxAndMin(10);
    }
}

class IntegerField {
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;

    public IntegerField(int ... d) {
        if (d.length > 2) {
            System.out.println("Максимум можно указать 2 аргумента");
            return;
        };

        if (d.length == 1) {
            this.max = Math.max(this.max, d[0]);
            this.min = Math.min(this.min, d[0]);

        } else if (d.length == 2) {
            this.max = Math.max(this.max, (Math.max(d[0], d[1])));
            this.min = Math.min(this.min, (Math.min(d[0], d[1])));
        }
    }

    public void setMaxAndMin(int ... d) {
        if (d.length > 2) {
            System.out.println("Максимум можно указать 2 аргумента");
            return;
        };

        if (d.length == 1) {
            this.max = Math.max(this.max, d[0]);
            this.min = Math.min(this.min, d[0]);

        } else if (d.length == 2) {
            this.max = Math.max(this.max, (Math.max(d[0], d[1])));
            this.min = Math.min(this.min, (Math.min(d[0], d[1])));
        }

    }


}
