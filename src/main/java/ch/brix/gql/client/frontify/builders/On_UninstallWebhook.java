package ch.brix.gql.client.frontify.builders;

public class On_UninstallWebhook extends ch.brix.gql.client.TypeBuilder {
  public On_UninstallWebhook() {
    super(new ch.brix.gql.client.On("UninstallWebhook"));
  }
  /**
   * **DEPRECATED** `Webhook` details. This field will be removed. Use `id` instead. | Date: 2026-07-01
   * This field will be removed. Use `id` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  public On_UninstallWebhook webhook(UninstallWebhook_webhook callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * The Id of the deleted `Webhook`.
   */
  public On_UninstallWebhook id() {
    _add_field("id");
    return this;
  }
}
