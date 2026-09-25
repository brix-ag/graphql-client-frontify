package ch.brix.gql.client.frontify.builders;

public class On_CreateServiceApp extends ch.brix.gql.client.TypeBuilder {
  public On_CreateServiceApp() {
    super(new ch.brix.gql.client.On("CreateServiceApp"));
  }
  /**
   * **BETA** The created ServiceApp
   */
  public On_CreateServiceApp serviceApp(CreateServiceApp_serviceApp callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The secret tied to the ServiceApp
   */
  public On_CreateServiceApp secret() {
    _add_field("secret");
    return this;
  }
  /**
   * **BETA** Disclaimer message
   */
  public On_CreateServiceApp message() {
    _add_field("message");
    return this;
  }
}
