package com.gemerald.models;

import java.io.IOException;
import java.io.Serializable;
import java.util.Base64;

import javax.validation.constraints.NotBlank;

import org.springframework.web.multipart.MultipartFile;

public class ImageInfo implements Serializable {

	private byte[] imageContent;
	private String img;

	public ImageInfo() {
		img = "https://upload.wikimedia.org/wikipedia/ru/thumb/c/c1/%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B.jpg/210px-%D0%94%D0%B6%D0%B5%D0%BD%D1%82%D0%BB%D1%8C%D0%BC%D0%B5%D0%BD%D1%8B.jpg";
	}

	public byte[] getImageContent() {
		return imageContent;
	}

	public String getImageBase64() {
		return Base64.getEncoder().encodeToString(imageContent);
	}

	public void setImage(MultipartFile image) throws IOException {
		this.imageContent = image.getBytes();
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
}
