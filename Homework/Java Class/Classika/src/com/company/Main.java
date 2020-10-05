package com.company;
import java.util.Scanner;
public class Main {

    Scanner in = new Scanner(System.in);

    class Books
    {
        public static final String OurOrg = "ЛУЧШИЙ МАГАЗИН В КОНСОЛЕ ОРГАНИЗАЦИИ 'КУПИКНИГУ' РЕКОМЕНДУЕТ ЭТИ КНИГИ!!!";
        public String writer;
        public String title;
        public byte chapters;
        public int pages;
        public String about_book;

        double minval; //Дополнительная логика при вводе данных
        public double getValue()
        {return minval;}
        public void setValue(double c)
            {
                if (c > 40) {minval = c;}
                else {minval = 413;}
            }


            //Конструктор (пустой(стандартный))//
        public Books()
        {
            writer = "Неизвестно!";
            title = "Ошибка!";
            chapters = 0;
            pages = 0;
            about_book = "Описания нет.";
        }
        // Конструктор для условия когда всё введено в коде//
        public Books(String writer, String title, byte chapters, int pages, String about_book, double minval)
        {
            this.writer = writer;
            this.title = title;
            this.chapters = chapters;
            this.pages = pages;
            this.about_book = about_book;
        }

        //Конструктор стандартный//
        public Books(int id)
        {
            System.out.print("Введите Автора: ");
            writer = in.next();

            System.out.print("Введите Название: ");
            title = in.next();

            System.out.print("Введите кол-во глав: ");
            chapters = in.nextByte();

            System.out.print("Введите кол-во страниц: ");
            pages = in.nextInt();

            System.out.print("Введите о чём книга: ");
            about_book = in.next();
        }

        public void AllBookInfo(int id) //Просто вывод о книге
    {System.out.print("\nАвтор: " + writer + "\nНазвание: " + title + "\nГлав: "+ chapters + "\nСтраниц: "+ pages + "\nОписание: "+ about_book);}

        public void WhatIsProg() //Лишний метод лишним не будет
        {System.out.print(OurOrg);}

        public void MoneyFilter(double minval)  //Mетод с перегрузкой
        {
            System.out.print("Введите от какой цены искать книги, или не вводите что-бы вам показало лишь самое дорогое: ");
            double shish = in.nextDouble();
            if (minval >= shish)
            {System.out.println("\nАвтор: " + writer + "\nНазвание: " + title + "\nГлав: "+ chapters + "\nСтраниц: "+ pages + "\nОписание: "+ about_book + "\nЦена: "+ minval);}
        }
    }

    class cl_essence extends Books
    {
        public String alignment;
        public String magic;


        //тащемта конструктор для САМОЙ СУТИ книги//
        public cl_essence(String writer, String title, byte chapters, int pages, String about_book, double minval, String alignment, String magic)
        {
            super(writer, title, chapters, pages, about_book, minval);
            this.alignment = alignment;
            this.magic = magic;
        }
        //МаГиЧеСкИй метод взятия книги//
        @Override
        public void AllBookInfo(int id) //к тому-же ПоЛиМоРфНыЙ
        {System.out.println("\nАвтор: " + writer + "\nНазвание: " + title + "\nГлав: "+ chapters + "\nСтраниц: "+ pages + "\nОписание: "+ about_book + "\nЦена: "+ minval + "Влияние на Мир: " + alignment + "Что-то происходит... " + magic);}
    }

        public static void main(String[] args) {
	// write your code here
    }
}
