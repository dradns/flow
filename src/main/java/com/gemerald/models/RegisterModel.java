package com.gemerald.models;

import java.io.Serializable;

public class RegisterModel implements Serializable {

	private UserInfo userInfo;
	private ImageInfo imageInfo;

	public RegisterModel() {
		imageInfo = new ImageInfo();
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public ImageInfo getImageInfo() {
		return imageInfo;
	}

	public void setImageInfo(ImageInfo imageInfo) {
		this.imageInfo = imageInfo;
	}
}