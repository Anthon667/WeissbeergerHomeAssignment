package wb.home_assignment.service;

import java.io.File;
import java.io.IOException;

import wb.home_assignment.objects.Film;

public interface FilmService {

	Film getFilm(String name, String id, String year, String plot);
	boolean searchFiles(String name);
	Film getFilmFromXML(String name) throws IOException;

}
