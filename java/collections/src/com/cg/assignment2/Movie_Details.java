package com.cg.assignment2;

import java.util.Comparator;

public class Movie_Details implements Comparator<Movie_Details>
{

	private String movie_name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	
	public Movie_Details(String movie_name, String lead_actor, String lead_actress,String genre)
	{
		super();
		this.movie_name = movie_name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre=genre;
	}

	
	public String getMovie_name() {
		return movie_name;
	}


	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getLead_actor() {
		return lead_actor;
	}

	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}

	public String getLead_actress() {
		return lead_actress;
	}

	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	@Override
	public String toString() {
		return "Movie_Details [movie_name=" + movie_name + ", lead_actor=" + lead_actor + ", lead_actress="
				+ lead_actress + ", genre=" + genre + "]";
	}


	@Override
	public int compare(Movie_Details o1, Movie_Details o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
