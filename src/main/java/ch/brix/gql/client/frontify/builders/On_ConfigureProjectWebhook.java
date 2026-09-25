package ch.brix.gql.client.frontify.builders;

public class On_ConfigureProjectWebhook extends ch.brix.gql.client.TypeBuilder {
  public On_ConfigureProjectWebhook() {
    super(new ch.brix.gql.client.On("ConfigureProjectWebhook"));
  }
  /**
   * The configured project webhook.
   */
  public On_ConfigureProjectWebhook webhook(ConfigureProjectWebhook_webhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
