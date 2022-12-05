package ru.netology.films;

public class FilmsManager {
    private String[] names;
    private int n;
    public FilmsManager() {
        this.n = 10;
        names = new String[0];
    }
    public FilmsManager(int n) {
        this.n = n;
        names = new String[0];
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
