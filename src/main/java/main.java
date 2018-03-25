import com.rps.shapes.Paper;
import com.rps.shapes.Rock;
import com.rps.shapes.Scissors;
import com.rps.shapes.Shape;

public class main {

    public static void main (String[] args){

        Shape shape = new Rock();
        Shape shape1 = new Scissors();
        Shape shape2 = new Paper();
        Shape shape3 = new Rock();

        System.out.println(shape.beats(shape3));
    }
}
