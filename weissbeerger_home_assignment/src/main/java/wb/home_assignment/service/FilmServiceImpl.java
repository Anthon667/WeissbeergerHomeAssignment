package wb.home_assignment.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import wb.home_assignment.objects.Film;

@Service
public class FilmServiceImpl implements FilmService {

	Film film;
	String url;

	@Override
	public Film getFilm(String name, String id, String year, String plot) {

		if (id == null) {
			url = "http://www.omdbapi.com/?apikey=ddfc2181&t=" + name + "&y=" + year + "&plot=" + plot;
		} else {
			url = "http://www.omdbapi.com/?apikey=ddfc2181&i=" + id + "&y=" + year + "&plot=" + plot;
		}

		RestTemplate restTemplate = new RestTemplate();
		Film film = restTemplate.getForObject(url, Film.class);
		createXMLFile(film);
		return film;
	}

	public void createXMLFile(Film film) {
		XmlMapper xmlMapper = new XmlMapper();
		File folder = new File("D://" + "OMDB_Films");
		if(!folder.exists()) folder.mkdir();
		try {
			if (film.getImdbID() == null)
				xmlMapper.writeValue(new File("D://OMDB_Films" + File.separator + "FilmNull.xml"), null);
			else
				xmlMapper.writeValue(new File("D://OMDB_Films" + File.separator + film.getTitle() + ".xml"), film);

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public boolean searchFiles(String name) {
		File dir = new File("D://OMDB_Films");
		if (dir.isDirectory()) {
			for (File item : dir.listFiles()) {
				if (item.getName().equals(name+".xml")) {

					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Film getFilmFromXML(String name) throws IOException {
		File file = new File("D://OMDB_Films" + File.separator + name + ".xml");
		XmlMapper xmlMapper = new XmlMapper();
		String xml = inputStreamToString(new FileInputStream(file));
		Film value = xmlMapper.readValue(xml, Film.class);
		value.setTitle(name);
		
		return value;
	}

	public String inputStreamToString(InputStream is) throws IOException {
		StringBuilder sb = new StringBuilder();
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		return sb.toString();
	}

}
