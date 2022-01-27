package com.example.demo

import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DefaultController {

  @GetMapping("/index")
  public String index(Model model, @RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
                      @AuthenticationPrincipal OAuth2User oauth2User) {
      String name = oauth2User.getName()
      String clientName = authorizedClient.getClientRegistration().getClientName()
      Map<String, Object> attributes = oauth2User.getAttributes()

      model.addAttribute("userName", name)
      model.addAttribute("clientName", clientName)
      model.addAttribute("userAttributes", attributes)

      "index";
  }

    @GetMapping("/login")
    public String login()
    {
        "login"
    }
}
