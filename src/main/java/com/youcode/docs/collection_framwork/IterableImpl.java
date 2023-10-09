package com.youcode.docs.collection_framwork;

import java.util.Iterator;

/**
 * is Iterable a functional interface? -> No because it has more than one abstract method : (iterator() and forEach())
 * what iterator() method returns? -> Iterator
 */
public class IterableImpl implements Iterable<Model> {

    private Model[] models;
    private int size;

    public IterableImpl(int size) {
        this.size = size;
        this.models = new Model[size];

        // Initialize the models array
        for (int i = 0; i < size; i++) {
            models[i] = new Model().initialize(i);
        }
    }

    @Override
    public Iterator<Model> iterator() {
        return new ModelIterator();
    }

    private class ModelIterator implements Iterator<Model> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public Model next() {
            if (hasNext()) {
                Model model = models[currentIndex];
                currentIndex++;
                return model;
            }
            throw new UnsupportedOperationException("No more elements to iterate.");
        }
    }

    public static void main(String[] args) {
        IterableImpl iterable = new IterableImpl(5);
        iterable.forEach(System.out::println);
    }
}
