package ch.brix.gql.client.frontify.builders;

public class On_InstallProjectWebhook extends ch.brix.gql.client.TypeBuilder {
  public On_InstallProjectWebhook() {
    super(new ch.brix.gql.client.On("InstallProjectWebhook"));
  }
  /**
   * `Webhook` details.
   */
  public On_InstallProjectWebhook webhook(InstallProjectWebhook_webhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
