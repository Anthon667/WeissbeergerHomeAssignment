package wb.home_assignment.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import wb.home_assignment.objects.Film;
import wb.home_assignment.service.FilmService;

@RestController
public class Controller {

	@Autowired
	FilmService service;

	@RequestMapping(value = "/film", method = RequestMethod.GET)
	public Film getFilm(@RequestParam(value = "name", required = false, defaultValue = " ") String name,
			@RequestParam(value = "id", required = false) String id, @RequestParam(required = false) String year,
			@RequestParam(required = false) String plot) throws IOException {
		if(service.searchFiles(name)) {
			System.out.println(service.getFilmFromXML(name));
			return service.getFilmFromXML(name);
			
		}
		System.out.println(year);
		return service.getFilm(name, id, year, plot);
	}

}
