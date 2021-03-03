public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.abs(Math.PI*Math.pow(radius,2));

    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return Math.abs((4*Math.PI*Math.pow(radius,3))/3);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a){return true;}
        else {return false;}
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if(isTrianglePossible(a, b, c)){
            double p = (a+b+c)/2;

            double temp = p*(p-a)*(p-b)*(p-c);

            return Math.sqrt(temp);
        }

        else {return -1.0;}
    }
}
