import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class HttpSession {

  private final Map<String, Object> map = new HashMap<>();

  public Object getAttribute(String name) {
    return map.get(name);
  }

  public Enumeration<String> getAttributeNames() {
    return Collections.enumeration(map.keySet());
  }

  public void setAttribute(String name, Object value) {
    this.map.put(name, value);
  }
}
