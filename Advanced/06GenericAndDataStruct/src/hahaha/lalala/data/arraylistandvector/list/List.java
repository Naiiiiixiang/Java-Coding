package hahaha.lalala.data.arraylistandvector.list;

public interface List<E> extends Iterable<E>{

    void add(E e);

    boolean isEmpty();

    boolean isContain(E e);

    int indexOf(E e);

    void delete(E e);

    void delete(int index);

    int size();

    int lastIndexOf(E e);


    void  set(int index, E e);


}
