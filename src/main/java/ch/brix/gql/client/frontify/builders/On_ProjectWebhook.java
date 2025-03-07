package ch.brix.gql.client.frontify.builders;

public class On_ProjectWebhook extends ch.brix.gql.client.TypeBuilder {
  public On_ProjectWebhook() {
    super(new ch.brix.gql.client.On("ProjectWebhook"));
  }
  /**
   * `Webhook` Id.
   */
  public On_ProjectWebhook id() {
    _add_field("id");
    return this;
  }
  /**
   * The `creator` is the `User` who created the `Webhook`.
   */
  public On_ProjectWebhook creator(ProjectWebhook_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * DateTime of the `Webhook` creation.
   */
  public On_ProjectWebhook createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * `Webhook` name.
   */
  public On_ProjectWebhook name() {
    _add_field("name");
    return this;
  }
  /**
   * The randomly generated secret of the current `Webhook`.
   */
  public On_ProjectWebhook secret() {
    _add_field("secret");
    return this;
  }
  /**
   * The `Url` which will be called by the `Webhook`
   */
  public On_ProjectWebhook notificationUrl() {
    _add_field("notificationUrl");
    return this;
  }
  /**
   * Returns the associated `Project`.
   */
  public On_ProjectWebhook project(ProjectWebhook_project callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
