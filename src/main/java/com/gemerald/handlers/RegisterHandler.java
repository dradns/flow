package com.gemerald.handlers;

import com.gemerald.models.ImageInfo;
import com.gemerald.models.ResultPage;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.gemerald.models.UserInfo;
import com.gemerald.models.RegisterModel;
import org.springframework.webflow.engine.Transition;

import java.util.Set;

@Component
public class RegisterHandler {

	public RegisterModel init() {
		return new RegisterModel();
	}

	public ResultPage initResult() { return new ResultPage(); }

	public void addImageInfo(RegisterModel registerModel, ImageInfo imageInfo) {
		registerModel.setImageInfo(imageInfo);
	}

	public void addUserInfo(RegisterModel registerModel, UserInfo userInfo) {
		registerModel.setUserInfo(userInfo);
	}

	public String parseImage(RegisterModel registerModel) {

		return "pick-up";
	}

	public String prepareResult(RegisterModel registerModel, ResultPage resultPage) {
		resultPage.setGreetings(
				makeGreetingsString(registerModel) + registerModel.getUserInfo().getName() + "!"
		);
		resultPage.setImgSource(registerModel.getImageInfo().getImg());
		return "pick-up";
	}

	private String makeGreetingsString(RegisterModel registerModel) {
		Set<String> male = Set.of("male", "m", "мужской", "м", "муж");
		Set<String> female = Set.of("female", "f", "женский", "ж", "жен");
		if (male.contains(registerModel.getUserInfo().getGender().toLowerCase())) {
			return "Привет джентльмен, ";
		} else if (female.contains(registerModel.getUserInfo().getGender().toLowerCase())) {
			return "Привет мадам, ";
		} else {
			return "Здравствуй неопределившийся, ";
		}
	}
}
