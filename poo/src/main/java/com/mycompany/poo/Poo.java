package com.mycompany.poo;

public class Poo {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de seguridad", 33, "A la grande le puse cuca");
        homero.greeting();
        
        Character bart = new Character ("Bartolomeo", "Vago", 10, "Ay caramba");
        bart.greeting();
        
    }
    static class Character{
        String name;
        String occupation;
        int age;
        String phrase;

        public Character(String name, String occupation, int age, String phrase) {
            this.name = name;
            this.occupation = occupation;
            this.age = age;
            this.phrase = phrase;
        }
        
        void greeting (){
            System.out.println(this.phrase);
        }
        
        void year (){
            System.out.println(this.age);
        }
    }
}
