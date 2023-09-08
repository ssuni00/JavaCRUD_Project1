package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD{

    ArrayList<Word> list;
    Scanner s;
    final String fname = "Dictionary.txt";

    WordCRUD(Scanner s){
        list = new ArrayList<>();
        this.s = s;
    }
    @Override
    public Object add() {
        System.out.print("=> 난이도(1,2,3) & 새 단어 입력: ");
        int level = s.nextInt();
        String word = s.nextLine();

        System.out.print("뜻 입력: ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);
    }

    @Override
    public void updateWord() {

    }

    @Override
    public void deleteWord() {

    }

    @Override
    public void searchWord() {

    }

    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }




}