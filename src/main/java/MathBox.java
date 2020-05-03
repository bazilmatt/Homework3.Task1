import java.util.HashSet;
import java.util.Iterator;

public class MathBox {


    HashSet hs = new HashSet();
        public MathBox(Number[] num){
            for (Number n: num){
                hs.add(n);
            }
            System.out.println("otrabotal");
        }

    public static void main(String[] args) {
        Number[] array = {1,2,3,4,5};
        MathBox mb = new MathBox(array);
    }

    @Override
    public String toString() {
        Iterator<Number> iter = hs.iterator();
        }
            return ;
    }
}
