package kr.lul.web.request.reflector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Collections.list;

/**
 * @author justburrow
 * @since 2017. 5. 28.
 */
@Controller class ReflectControllerImpl implements ReflectController {
  private static final Logger log = LoggerFactory.getLogger(ReflectController.class);

  /**
   * @param req
   * @param model
   * @return
   */
  private String reflect(final HttpServletRequest req, final Model model) throws MalformedURLException {
    // URL
    URL url = new URL(req.getRequestURL().toString());
    model.addAttribute("method", req.getMethod());
    model.addAttribute("url", url);

    // HEADER
    Map<String, String> headers = new LinkedHashMap<>();
    list(req.getHeaderNames()).forEach(name -> headers.put(name, req.getHeader(name)));
    model.addAttribute("headers", headers);
    model.addAttribute("params", req.getParameterMap());

    return "reflect/basic";
  }

  /**
   * @param req
   * @param model
   * @return
   */
  @Override
  public String get(final HttpServletRequest req, final Model model) {
    try {
      return reflect(req, model);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * @param req
   * @param model
   * @return
   */
  @Override
  public String post(HttpServletRequest req, Model model) {
    try {
      return reflect(req, model);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}
