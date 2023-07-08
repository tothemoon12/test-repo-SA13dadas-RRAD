package Math;

public class Operations<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Operations(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double divide() {
        double result = 0;

        try {
            result = (double) this.value1 / (double) this.value2;
        } catch (Exception e){
            System.out.println(e.fillInStackTrace());
        }
        return result;
    }
}
