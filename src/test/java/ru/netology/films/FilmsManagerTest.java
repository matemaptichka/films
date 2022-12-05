package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {

    @Test
    public void testFindAll() {
        String[] expected = {"отель Белград"};
        FilmsManager manager = new FilmsManager();
        manager.add("отель Белград");
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd() {
        FilmsManager manager = new FilmsManager();
        manager.add("Вперёд");
        String[] expected = {"Вперёд"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast() {
        FilmsManager manager = new FilmsManager();
        manager.add("отель Белград");
        manager.add("Вперёд");
        String[] expected = {"Вперёд","отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastN() {
        FilmsManager manager = new FilmsManager(1);
        manager.add("отель Белград");
        manager.add("Вперёд");
        String[] expected = {"Вперёд"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}