public class Main {

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

}
