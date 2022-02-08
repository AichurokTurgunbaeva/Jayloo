package com.company;

public class Main {

    public static void main(String[] args) {
	Cow cow1 = new Cow("Brownie",3,55);
    Cow cow2 = new Cow("Baby",4,60);
    Cow cow3 = new Cow("Brownie",3,55);
    Cow cow4 = new Cow("Lamby",7,80);
    Cow cow5 = new Cow("Cupcake",6,45);

    Cow[] uylar = {cow1,cow2,cow3,cow4,cow5};

    Sheep sheep1 = new Sheep("Lamby",4,20);
    Sheep sheep2 = new Sheep("koy2",3,25);
    Sheep sheep3 = new Sheep("koy3",5,21);
    Sheep sheep4 = new Sheep("koy4",1,40);
    Sheep sheep5 = new Sheep("koy5",3,22);
    Sheep sheep6 = new Sheep("koy6",5,28);
    Sheep sheep7 = new Sheep("koy7",9,30);
    Sheep sheep8 = new Sheep("koy8",8,24);
    Sheep[] koylor = {sheep1,sheep2,sheep3,sheep4,sheep5,sheep6,sheep7,sheep8};


    Horse horse1 = new Horse("Lilly",6,90);
    Horse horse2 = new Horse("At",8,100);
    Horse[] attar = {horse1,horse2};

    Jayloo jayloo1 = new Jayloo("Kegety","Chuy","Aychurok",uylar,koylor,attar);

    Cow cow = new Cow("Uy1",5,65);
    Cow cow6 = new Cow("Torpok",2,45);
    Cow[] uylar2 = {cow,cow6};

    Sheep sheep9 = new Sheep("Lamby1",12,25);
    Sheep sheep10 = new Sheep("koy10",13,32);
    Sheep sheep11 = new Sheep("koy11",15,36);
    Sheep sheep12 = new Sheep("koy12",11,37);
    Sheep[] koylor2 = {sheep9,sheep10,sheep11,sheep12};

     Horse horse3 = new Horse("Lilly",6,90);
     Horse horse4 = new Horse("At",8,100);
     Horse horse5 = new Horse("at2",12,110);
     Horse horse6 = new Horse("at3",13,111);
     Horse horse7 = new Horse("at4",14,112);
     Horse[] attar2 = {horse3,horse4,horse5,horse6,horse7};

    Jayloo jayloo2 = new Jayloo("Ala-too","Batken","Chinara",uylar2,koylor2,attar2);


        System.out.println(jayloo1.getName()+" жайлоосу. Адрес: " +jayloo1.getAddress()+". Владелец: "
                +jayloo1.getChabanName()+". Жайлоодо "
                +uylar.length+" уй "+koylor.length +" кой "+attar.length+" ат бар. ");
        System.out.println("Уйлар: ");
        for (Cow a:jayloo1.getUylar()) {
            System.out.println(a.getName()+" "+a.getAge()+" "+a.getWeight());}
        System.out.println("Койлор: ");
        for (Sheep b:jayloo1.getKoylor()) {
            System.out.println(b.getName()+" "+b.getAge()+" "+b.getWeight());}
        System.out.println("Аттар: ");
        for (Horse c:jayloo1.getAttar()) {
            System.out.println(c.getName()+" "+c.getAge()+" "+c.getWeight());
        }

        System.out.println(jayloo2.getName()+" жайлоосу. Адрес: " +jayloo2.getAddress()+". Владелец: "
                +jayloo2.getChabanName()+". Жайлоодо "
                +uylar2.length+" уй "+koylor2.length +" кой "+attar2.length+" ат бар. ");

        System.out.println("Уйлар: ");
        for (Cow a:jayloo2.getUylar()) {
            System.out.println(a.getName()+" "+a.getAge()+" "+a.getWeight());}
        System.out.println("Койлор: ");
        for (Sheep b:jayloo2.getKoylor()) {
            System.out.println(b.getName()+" "+b.getAge()+" "+b.getWeight());}
        System.out.println("Аттар: ");
        for (Horse c:jayloo2.getAttar()) {
            System.out.println(c.getName()+" "+c.getAge()+" "+c.getWeight());
        }



        }

    }

