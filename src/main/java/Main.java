public class Main {

    public static void main(String[] args) {
        Number[] array = {1d, 2d, 3d, 4d, 5, 7.8, 5}; // цифра 5 дублируется в инициализации, но в сет попадет только одна
        Object[] array2 = {5d, 4f, 3, 2d, 1d, "asd"}; // в objectbox можно класть любые типы
        Number[] arrayForAdd = {80,10,100};
        MathBox mb = new MathBox(array);
        mb.addObject(arrayForAdd);
        ObjectBox<Object> ob2 = new ObjectBox<>();
        //ob2.addObject(array2);
        mb.deleteObject(2d);
        mb.addObject(12d);
        //mb.addObject(array2); //строчка вызывает ошибку, так как нельзя в матбокс положить обжект
        System.out.println("Первоначальный массив элементов матбокса = " + mb.toString());
        System.out.println("Первоначальный массив элементов объектбокса = " + ob2.toString());
        mb.splitter(2d);
        System.out.println("Массив матбокса после деления = " + mb.toString());
    }

}
