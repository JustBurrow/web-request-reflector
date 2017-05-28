package kr.lul.web.request.reflector.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author justburrow
 * @since 2017. 5. 28.
 */
@RequestMapping("/**")
public interface ReflectController {
  /**
   * @param req
   * @param model
   * @return
   */
  @GetMapping
  String get(HttpServletRequest req, Model model);

  /**
   * @param req
   * @param model
   * @return
   */
  @PostMapping
  String post(HttpServletRequest req, Model model);
}
