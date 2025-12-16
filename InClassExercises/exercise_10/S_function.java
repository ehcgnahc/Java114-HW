public class S_function implements Function{
    double a,b,c;
    public S_function(){
        this(0,0,0);
    }
    public S_function(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double f(double x){
        return a*x*x+b*x+c;
    }
    public double derivative(double x){
        //return 2*a*x+b;
        return (f(x+0.00000000000001)-f(x))/0.00000000000001;
    }
    public double Integral(double a, double b){
        double result = 0, dx = 1e-7;
        for (double x = a; x <= b; x += dx) {
            result += f(x) * dx;
        }
        return result;
    }
}