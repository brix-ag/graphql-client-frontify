package ch.brix.gql.client.frontify.builders;

public class On_Webhook extends ch.brix.gql.client.TypeBuilder {
  public On_Webhook() {
    super(new ch.brix.gql.client.On("Webhook"));
  }
  /**
   * `Workspace` Id.
   */
  public On_Webhook id() {
    _add_field("id");
    return this;
  }
  /**
   * The `creator` is the `User` who created the asset on Frontify.
   */
  public On_Webhook creator(Webhook_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `Asset` creation.
   */
  public On_Webhook createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * The name of the current `Webhook`.
   */
  public On_Webhook name() {
    _add_field("name");
    return this;
  }
  /**
   * The `Url` which will be called by the `Webhook`.
   */
  public On_Webhook notificationUrl() {
    _add_field("notificationUrl");
    return this;
  }
  /**
   * The randomly generated secret of the current `Webhook`.
   */
  public On_Webhook secret() {
    _add_field("secret");
    return this;
  }
}
