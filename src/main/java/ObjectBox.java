import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Класс objectBox - для хранения объектов <b>maker</b> и <b>price</b>.
 * @autor Василий Матвеев
 * @version 1.0
 */
public class ObjectBox<T> {
    /**
     *Множество для хранения объектов. Т.К. повторы недопустимы - используется hashSet.
     */
    Set<T> hashSet = new HashSet<>();
    /**
     * Конструктор без параметров
     */
   // public ObjectBox(T[] array){ //ToDo - реализовать какую-нибудь дополнительную логику
   //     hashSet.addAll(Arrays.asList(array));
   //}

    /**
     * Добавляет элементы из массива в коллекцию
     */
    public void addObject(T[] array){
        for (int i = 0; i < array.length; i++) {
            hashSet.add(array[i]);
        }
    }

    /**
     * Добавляет объект в коллекцию
     */
    public void addObject(T object){
            hashSet.add(object);
    }

    /**
     * Удаляет объект из коллекции или выводит сообщение о его отсутствии
     */
    public void deleteObject(T object){
        if (hashSet.contains(object)) {
            hashSet.remove(object);
        } else {
            System.out.println("Нет такого элемента");
        }
    }

    @Override
    public String toString() {
        return hashSet.toString();
    }

    /**
     * Выводит содержимое objectBox в строку
     */
    public void dump(ObjectBox box){
        System.out.println(box.toString());
    }





}
