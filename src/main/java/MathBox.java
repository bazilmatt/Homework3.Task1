import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class MathBox extends ObjectBox<Number>{


    Set<Number> numberSet = new HashSet<>();

    public MathBox(Number[] num)  {
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

    @Override
    public String toString() {
        return numberSet.toString();
    }

    public Number summator() {
        Integer sum = 0;
        for (Number n : numberSet) {
            sum += (Integer) n;
        }
        return sum;
    }

    public void splitter(double split){
        Set<Number> rez = new HashSet<>();
        Number[] a= new Number[numberSet.size()];
        Iterator iter = numberSet.iterator();
        int i =0;
        while (iter.hasNext()){
            a[i] = (double) iter.next();
            rez.add((double)a[i]/split);
            //numberSet.remove(a);
            iter.remove();
        }
        numberSet.addAll(rez);
    }

    public Set<Number> getNumberSet() {
        return numberSet;
    }


    @Override
    public void addObject(Number[] array) {
        super.addObject(array);
    }

    @Override
    public void addObject(Number object) {
        super.addObject(object);
    }

    @Override
    public void deleteObject(Number object) {
        super.deleteObject(object);
    }

    @Override
    public void dump(ObjectBox box) {
        super.dump(box);
    }

    public void deleteObject(Integer del) {
        if (numberSet.contains(del)) {
            numberSet.remove(del);
        } else {
            System.out.println("Нет такого элемента");
        }
    }
}





