package model;

public class User {
	public String name;
	public String occ;
	public String hobby;
	public String music;
	public int age;
	String major, campus;
	
	public User(String name, int age, String occ, String hobby, String music, String major, String campus) {
		super();
		this.name = name;
		this.occ = occ;
		this.hobby = hobby;
		this.music = music;
		this.age = age;
		this.major = major;
		this.campus = campus;
	}
	
	public String getGendint() {
        return "";
    }
	
	public String getLookingForAge() {
		return "";
	}
	
	public String getLookingForHobby() {
		return "";
	}
	
	public String getLookingForOcc() {
		return "";
		
	}
	public String getLookingForMusic() {
		return "";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	public String getOcc() {
		return occ;
	}

	public void setOcc(String occ) {
		this.occ = occ;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
