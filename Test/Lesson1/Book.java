package org.example.Repeat.Test.Lesson1;

import java.util.AbstractList;
import java.util.ArrayList;

public class Book {
    private String _title;
    private String _author;
    private String _genre;
    private ArrayList<String> _listOfKeywords;

    public Book(String title, String author, String genre, ArrayList<String> listOfKeywords) {
        _title = title;
        _author = author;
        _genre = genre;
        _listOfKeywords = listOfKeywords;
    }
}
