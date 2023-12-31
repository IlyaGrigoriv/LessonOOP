package org.example.Repeat.Lesson7;

public class Toy {
    private int _id;
    private static int count = 0;
    private String _name;
    private int _winningFrequency;
    private int _count;

    public Toy(String name, int winningFrequency, int count) {
        _count++;
        _id = count;
        _name = name;
        _winningFrequency = winningFrequency;//цифра 0-5
        _count += count;
    }

    public void setWinningFrequency(int count) {
        _winningFrequency = count;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "_id=" + _id +
                ", _name='" + _name + '\'' +
                ", _winningFrequency=" + _winningFrequency +
                ", _count=" + _count +
                '}';
    }
}
