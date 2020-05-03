import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class MathBox {


    Set<Number> numberSet = new HashSet<>();

    public MathBox(Number[] num) {
        for (int i = 0; i < num.length; i++) {
            numberSet.add(num[i].doubleValue());
        }
        System.out.println("Элементы добавлены в коллекцию");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(numberSet, mathBox.numberSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberSet);
    }

    public static void main(String[] args) {
        Number[] array = {1d, 2d, 3d, 4d, 5, 7.8, 5};
        Number[] array2 = {5d, 4f, 3, 2d, 1d};
        MathBox mb = new MathBox(array);
        MathBox mb2 = new MathBox(array2);
        System.out.println("Первоначальный массив элементов" + mb.toString());
        System.out.println(mb.equals(mb2));
        mb.splitter(2d);
        System.out.println(mb.toString());
    }

    @Override
    public String toString() {
        return numberSet.toString();
    }

    public Number summator() {
        Integer sum = 0;
        for (Number n : this.numberSet) {
            sum += (Integer) n;
        }
        return sum;
    }

    public void splitter(double split){
        Set<Number> rez = new HashSet<>();
        Number[] a= new Number[this.numberSet.size()];
        Iterator iter = numberSet.iterator();
        int i =0;
        while (iter.hasNext()){
            a[i] = (double) iter.next();
            rez.add((double)a[i]/split);
            //numberSet.remove(a);
            iter.remove();
        }
        this.numberSet.addAll(rez);
    }

    public Set<Number> getNumberSet() {
        return numberSet;
    }

    public void eraser(Integer del) {
        if (this.numberSet.contains(del)) {
            this.numberSet.remove(del);
        } else {
            System.out.println("Нет такого элемента");
        }
    }
}





