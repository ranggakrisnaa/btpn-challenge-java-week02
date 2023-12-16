public class Calculate {
    private int a,b;
    private String operator;
    private int result;

    Calculate(int a, int b, String operator){
        this.a=a;
        this.b=b;
        this.operator=operator;
    }


    public void showValue() {
        switch (this.operator) {
            case "*":
                result = this.a * this.b;
                break;
            case "+":
                result = this.a + this.b;
                break;
            case "-":
                result = this.a - this.b;
                break;
            case "/":
                result = this.a / this.b;
                break;
            default:
                System.out.println("Unsupported operator");
                break;
        }
        System.out.println("Result: "+result);
    }
}
