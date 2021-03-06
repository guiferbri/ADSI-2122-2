package data.streaming.dto;

public class TweetUserDTO {
	private String idStr;
	private String name;
	private String screenName;
	private Integer followers;
	private Integer friends;

	public TweetUserDTO(String idStr, String name, String screenName, Integer followers, Integer friends) {
		super();
		this.idStr = idStr;
		this.name = name;
		this.screenName = screenName;
		this.followers = followers;
		this.friends = friends;
	}

	public TweetUserDTO() {
		super();
	}

	public String getIdStr() {
		return idStr;
	}

	public String getName() {
		return name;
	}

	public String getScreenName() {
		return screenName;
	}

	public Integer getFollowers() {
		return followers;
	}

	public Integer getFriends() {
		return friends;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idStr == null) ? 0 : idStr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TweetUserDTO other = (TweetUserDTO) obj;
		if (idStr == null) {
			if (other.idStr != null)
				return false;
		} else if (!idStr.equals(other.idStr))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TweetUser [idStr=" + idStr + ", name=" + name + ", screenName=" + screenName + ", followers="
				+ followers + ", friends=" + friends + "]";
	}

}
