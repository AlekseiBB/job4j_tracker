package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;

public class ReconstructPhrase {

    private final Deque<Character> descedingElement;
    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descedingElement, Deque<Character> eventElement) {
        this.descedingElement = descedingElement;
        this.evenElements = eventElement;
    }

    private String getEvenElements() {
        StringBuilder result = new StringBuilder();
        int size = evenElements.size();
        for (int i = 0; i < size; i++) {
            Character character = evenElements.pollFirst();
            if (i % 2 == 0) {
                result.append(character);
            }
        }
        return result.toString();
    }

    private String getDescendingElements() {
        StringBuilder result = new StringBuilder();
        Iterator<Character> iterator = descedingElement.descendingIterator();
        while (iterator.hasNext()) {
            result.append(iterator.next());
        }
        return result.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}
