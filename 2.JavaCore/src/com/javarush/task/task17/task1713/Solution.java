package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;


/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public Iterator<Long> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Long> action) {
        List.super.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return List.super.toArray(generator);
    }

    @Override
    public boolean add(Long aLong) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Long> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super Long> filter) {
        return List.super.removeIf(filter);
    }

    @Override
    public void replaceAll(UnaryOperator<Long> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Long> c) {
        List.super.sort(c);
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public Long get(int index) {
        return null;
    }

    @Override
    public Long set(int index, Long element) {
        return null;
    }

    @Override
    public void add(int index, Long element) {

    }

    @Override
    public Long remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }


    @Override
    public ListIterator<Long> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Long> listIterator(int index) {
        return null;
    }

    @Override
    public List<Long> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<Long> spliterator() {
        return List.super.spliterator();
    }

    @Override
    public Stream<Long> stream() {
        return List.super.stream();
    }

    @Override
    public Stream<Long> parallelStream() {
        return List.super.parallelStream();
    }
}
