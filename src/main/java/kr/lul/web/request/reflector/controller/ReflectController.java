package kr.lul.web.request.reflector.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author justburrow
 * @since 2017. 5. 28.
 */
@RequestMapping("/**")
public interface ReflectController {
  @GetMapping
  String get(HttpServletRequest request, Model model);
}
