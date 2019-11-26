package wb.home_assignment.objects;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Raiting {

	String source;
	String value;

	public Raiting() {
	}

	public Raiting(String source, String value) {
		this.source = source;
		this.value = value;
	}

	public String getSource() {
		return source;
	}

	public String getValue() {
		return value;
	}

	@JsonSetter("Source")
	public void setSource(String source) {
		this.source = source;
	}

	@JsonSetter("Value")
	public void setValue(String value) {
		this.value = value;
	}

}
