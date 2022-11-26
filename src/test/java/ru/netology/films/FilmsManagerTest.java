package ru.netology.films;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmsManagerTest {

    @Test
    public void testFindAll() {
        String[] expected = {"отель Белград"};
        FilmsManager manager = new FilmsManager(expected);
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd() {
        String[] films = {"отель Белград"};
        FilmsManager manager = new FilmsManager(films);
        manager.add("Вперёд");
        String[] expected = {"отель Белград", "Вперёд"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast() {
        String[] films = {"отель Белград", "Вперёд"};
        FilmsManager manager = new FilmsManager(films);
        String[] expected = {"Вперёд","отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastN() {
        String[] films = {"отель Белград", "Вперёд"};
        FilmsManager manager = new FilmsManager(films, 1);
        String[] expected = {"Вперёд"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}