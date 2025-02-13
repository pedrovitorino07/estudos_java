package POO.EntidadesExercicio;

public class Rectangle {

    public double Width;
    public double Height;

    public double Area() {
        return Width * Height;
    }

    public double perimeter(){
        return 2 * (Width + Height);
    }

    public double diagonal(){
        return Math.sqrt(Math.sqrt(Width * Width + Height * Height));
    }
}
