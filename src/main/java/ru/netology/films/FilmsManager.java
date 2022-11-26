package ru.netology.films;

public class FilmsManager {
    String[] names;
    int n;
    public FilmsManager(String[] names) {
        this.names = names;
        this.n = 10;
    }
    public FilmsManager(String[] names, int n) {
        this.names = names;
        this.n = n;
    }

    public void add(String name) {
        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public String[] findAll() {
        return names;
    }

    public String[] findLast() {
        String[] tmp = new String[Math.min(names.length, n)];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = names[names.length - i - 1];
        }

        return tmp;
    }
}
