public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public double div(int a, int b){
        return (double) a/(double) b;                      // При делении int-ов результат автоматически приводится к int
    }
}
