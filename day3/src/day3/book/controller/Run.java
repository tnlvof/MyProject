package day3.book.controller;

import day3.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book book = new Book("어떻게 살 것인가", "출판사","유시민");
		Book book2 = new Book("Grit", "출판사","외쿡인..",10000,10.0);
		
		book.information();
		book2.information();
	}
}
