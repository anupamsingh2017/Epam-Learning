import java.io.*;
import java.util.*;
 
class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;
 
    public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
    public Movie(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
	public double getRating() { 
		return rating; 
	}
	
    public String getName() {
		return name;
	}
	
    public int getYear() {
		return year;
	}
}

class Test {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Lagaan", 8.3, 2001));
        list.add(new Movie("LOC Kargil", 7.1, 2010));
        list.add(new Movie("ZNMD, 8.1, 2015));
        list.add(new Movie("Shershaah", 8.4, 2021));
 
        Collections.sort(list);
 
        System.out.println("Movies after sorting : ");
		
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
    }
}