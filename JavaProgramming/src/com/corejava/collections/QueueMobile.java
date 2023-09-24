package com.corejava.collections;

import java.util.Objects;

public class QueueMobile {
	int modelno;
	String modelname;
	int ram;
	int rom;
	String release_year;
	int screen_size;

	public QueueMobile(int modelno, String modelname, int ram, int rom, String release_year, int screen_size) {
		this.modelno = modelno;
		this.modelname = modelname;
		this.ram = ram;
		this.rom = rom;
		this.release_year = release_year;
		this.screen_size = screen_size;
	}

	@Override
	public int hashCode() {
		return Objects.hash(modelname, modelno, ram, release_year, rom, screen_size);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueueMobile other = (QueueMobile) obj;
		return Objects.equals(modelname, other.modelname) && modelno == other.modelno && ram == other.ram
				&& Objects.equals(release_year, other.release_year) && rom == other.rom
				&& screen_size == other.screen_size;
	}
}
