package springsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/handler")
	public RedirectView handle(@RequestParam("search") String search) {

		RedirectView redirect = new RedirectView();

		redirect.setUrl("https://www.google.com/search?q=" + search);
		return redirect;

	}

}
