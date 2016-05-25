package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//  game/users/su/characters/1234
@Controller
@RequestMapping("/game/users/{userId}")
public class CharacterInfoController {

	@RequestMapping("/characters/{characterId}")
	public String characterInfo(@PathVariable("userId") String userId,
			@PathVariable int characterId, ModelMap model) {
		model.addAttribute("userId", userId);
		model.addAttribute("characterId", characterId);
		return "character/info";
	}
}






