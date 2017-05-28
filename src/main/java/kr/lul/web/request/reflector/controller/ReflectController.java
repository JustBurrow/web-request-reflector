package kr.lul.web.request.reflector.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author justburrow
 * @since 2017. 5. 28.
 */
@RequestMapping
public interface ReflectController {
  /**
   * @param req
   * @param model
   * @return
   */
  @RequestMapping(value = "/**", method = {GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE})
  String reflect(HttpServletRequest req, Model model);
}
