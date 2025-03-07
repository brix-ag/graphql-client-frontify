package ch.brix.gql.client.frontify.builders;

public class On_UninstallWebhook extends ch.brix.gql.client.TypeBuilder {
  public On_UninstallWebhook() {
    super(new ch.brix.gql.client.On("UninstallWebhook"));
  }
  /**
   * `Webhook` details.
   */
  public On_UninstallWebhook webhook(UninstallWebhook_webhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
