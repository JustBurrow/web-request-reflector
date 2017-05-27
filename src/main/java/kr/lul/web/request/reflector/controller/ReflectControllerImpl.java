package kr.lul.web.request.reflector.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;

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
    URL url = new URL(req.getRequestURL().toString());

    model.addAttribute("method", req.getMethod());
    model.addAttribute("url", url);

    return "reflect/basic";
  }

  /**
   * @param request
   * @param model
   * @return
   */
  @Override
  public String get(final HttpServletRequest request, final Model model) {
    try {
      return reflect(request, model);
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
  }
}
