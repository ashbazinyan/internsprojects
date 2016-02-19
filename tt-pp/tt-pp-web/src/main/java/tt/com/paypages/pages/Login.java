package tt.com.paypages.pages;

import org.apache.tapestry5.alerts.AlertManager;
import org.apache.tapestry5.annotations.Import;
import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.slf4j.Logger;

import java.util.Arrays;
import java.util.List;

@Import(module="bootstrap/collapse", stylesheet="context:css/login.css")
public class Login
{
  @Inject
  private Logger logger;

  @Inject
  private AlertManager alertManager;

  @InjectComponent
  private Form loginForm;

  @Property
  private String merchantNameProperty;

  @Property
  private String merchantIdentifierProperty;

  @Property
  private String offer = "Select Offer";

  @Property
  private List<String> listOfOffers = Arrays.asList("Test1", "Test2");

  @InjectComponent("merchantName")
  private TextField merchantName;

  @InjectComponent("merchantIdentifier")
  private TextField merchantIdentifier;

  void onValidateFromLoginForm()
  {
    if ( !merchantNameProperty.isEmpty() && !merchantNameProperty.equals("IMUSIC"))
      loginForm.recordError(merchantName, "Try with user: IMUSIC");

    if ( !merchantIdentifierProperty.isEmpty() &&!merchantIdentifierProperty.equals("123456789"))
      loginForm.recordError(merchantIdentifier, "Try with merchant identifier: 123456789");
  }

  Object onSuccessFromLoginForm()
  {
    logger.info("Login successful!");
    alertManager.success("Welcome aboard!");

    return Index.class;
  }

  void onFailureFromLoginForm()
  {
    logger.warn("Login error!");
    alertManager.error("I'm sorry but I can't log you in!");
  }

}
