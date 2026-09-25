package ch.brix.gql.client.frontify.builders;

public class On_ServiceApp extends ch.brix.gql.client.TypeBuilder {
  public On_ServiceApp() {
    super(new ch.brix.gql.client.On("ServiceApp"));
  }
  /**
   * **BETA** The ID of the ServiceApp
   */
  public On_ServiceApp id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The description text of the ServiceApp
   */
  public On_ServiceApp description() {
    _add_field("description");
    return this;
  }
  /**
   * **BETA** Describes if the ServiceApp is enabled or disabled
   */
  public On_ServiceApp status() {
    _add_field("status");
    return this;
  }
  /**
   * **BETA** The scopes that are accessible to the ServiceApp
   */
  public On_ServiceApp scopes() {
    _add_field("scopes");
    return this;
  }
  /**
   * **BETA** The title of the ServiceAPpp
   */
  public On_ServiceApp title() {
    _add_field("title");
    return this;
  }
}
