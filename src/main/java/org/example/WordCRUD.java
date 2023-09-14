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
        System.out.print("=> 검색할 단어 입력: ");
        String search = s.next();
        listAll(search);
    }
    @Override
    public void searchLevel() {
        System.out.print("=> 레벨(1:초급, 2:중급, 3:고급) 선택 : ");
        int level = s.nextInt();
        listAll(level);
    }

    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 단어장에 추가되었습니다. ");
    }

    public void listAll(){
        System.out.println("————————————————————————————————");
        for(int i = 0; i< list.size(); i++){
            System.out.print((i+1)+ " ");
            System.out.println(list.get(i).toString());
        }
        System.out.println("————————————————————————————————");

    }

    public ArrayList<Integer> listAll(String search){
        ArrayList<Integer> idlist = new ArrayList<>();
        int j = 0;
        System.out.println("————————————————————————————————");
        for(int i = 0; i< list.size(); i++){
            String word = list.get(i).getWord();
            if(!word.contains(search)) continue;
            System.out.print((j+1)+ " ");
            System.out.println(list.get(i).toString());
            idlist.add(i);
            j++ ;
        }
        System.out.println("————————————————————————————————");
        return idlist;
    }




}