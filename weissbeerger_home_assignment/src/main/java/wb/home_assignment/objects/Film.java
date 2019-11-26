package wb.home_assignment.objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Film {

	String title;
	String year;
	String rated;
	String released;
	String runtime;
	String genre;
	String director;
	String writer;
	String actors;
	String plot;
	String language;
	String country;
	String awards;
	String poster;
	List<Raiting> ratings;
	String metascore;
	String imdbRating;
	String imdbVotes;
	String imdbID;
	String type;
	String DVD;
	String boxOffice;
	String production;
	String website;
	String response;

	public Film(String title, String year, String rated, String released, String runtime, String genre, String director,
			String writer, String actors, String plot, String language, String country, String awards, String poster,
			List<Raiting> ratings, String metascore, String imdbRating, String imdbVotes, String imdbID, String type,
			String dVD, String boxOffice, String production, String website, String response) {
		this.title = title;
		this.year = year;
		this.rated = rated;
		this.released = released;
		this.runtime = runtime;
		this.genre = genre;
		this.director = director;
		this.writer = writer;
		this.actors = actors;
		this.plot = plot;
		this.language = language;
		this.country = country;
		this.awards = awards;
		this.poster = poster;
		this.ratings = ratings;
		this.metascore = metascore;
		this.imdbRating = imdbRating;
		this.imdbVotes = imdbVotes;
		this.imdbID = imdbID;
		this.type = type;
		DVD = dVD;
		this.boxOffice = boxOffice;
		this.production = production;
		this.website = website;
		this.response = response;
	}

	public Film() {

	}

	public String getTitle() {
		return title;
	}

	@JsonSetter("Title")
	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	@JsonSetter("Year")
	public void setYear(String year) {
		this.year = year;
	}

	public String getRated() {
		return rated;
	}

	@JsonSetter("Rated")
	public void setRated(String rated) {
		this.rated = rated;
	}

	public String getReleased() {
		return released;
	}

	@JsonSetter("Released")
	public void setReleased(String released) {
		this.released = released;
	}

	public String getRuntime() {
		return runtime;
	}

	@JsonSetter("Runtime")
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	public String getGenre() {
		return genre;
	}

	@JsonSetter("Genre")
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	@JsonSetter("Director")
	public void setDirector(String director) {
		this.director = director;
	}

	public String getWriter() {
		return writer;
	}

	@JsonSetter("Writer")
	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getActors() {
		return actors;
	}

	@JsonSetter("Actors")
	public void setActors(String actors) {
		this.actors = actors;
	}

	public String getPlot() {
		return plot;
	}

	@JsonSetter("Plot")
	public void setPlot(String plot) {
		this.plot = plot;
	}

	public String getLanguage() {
		return language;
	}

	@JsonSetter("Language")
	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCountry() {
		return country;
	}

	@JsonSetter("Country")
	public void setCountry(String country) {
		this.country = country;
	}

	public String getAwards() {
		return awards;
	}

	@JsonSetter("Awards")
	public void setAwards(String awards) {
		this.awards = awards;
	}

	public String getPoster() {
		return poster;
	}

	@JsonSetter("Poster")
	public void setPoster(String poster) {
		this.poster = poster;
	}

	public List<Raiting> getRatings() {
		return ratings;
	}

	@JsonSetter("Ratings")
	public void setRatings(List<Raiting> ratings) {
		this.ratings = ratings;
	}

	public String getMetascore() {
		return metascore;
	}

	@JsonSetter("Metascore")
	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}

	public String getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}

	public String getImdbVotes() {
		return imdbVotes;
	}

	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}

	public String getImdbID() {
		return imdbID;
	}

	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}

	public String getType() {
		return type;
	}

	@JsonSetter("Type")
	public void setType(String type) {
		this.type = type;
	}

	public String getDVD() {
		return DVD;
	}

	@JsonSetter("DVD")
	public void setDVD(String dVD) {
		DVD = dVD;
	}

	public String getBoxOffice() {
		return boxOffice;
	}

	@JsonSetter("BoxOffice")
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}

	public String getProduction() {
		return production;
	}

	@JsonSetter("Production")
	public void setProduction(String production) {
		this.production = production;
	}

	public String getWebsite() {
		return website;
	}

	@JsonSetter("Website")
	public void setWebsite(String website) {
		this.website = website;
	}

	public String getResponse() {
		return response;
	}

	@JsonSetter("Response")
	public void setResponse(String response) {
		this.response = response;
	}

}
