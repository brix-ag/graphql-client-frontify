package ch.brix.gql.client.frontify.input_objects;

public class ConfigureProjectWebhookInput extends ch.brix.gql.client.InputObject {
  /**
   * Project ID.
   */
  public ConfigureProjectWebhookInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * Webhook notification URL.
   */
  public ConfigureProjectWebhookInput notificationUrl(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("notificationUrl", v);
    return this;
  }
  /**
   * Webhook name.
   */
  public ConfigureProjectWebhookInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * Webhook payload version (1 or 2).
   */
  public ConfigureProjectWebhookInput version(ch.brix.gql.client.frontify.scalars.IntScalar v) {
    values.put("version", v);
    return this;
  }
  /**
   * Subscribe to specific webhook events. If not defined the webhook will subscribe to all events
   */
  @ch.brix.gql.client.DefaultValue("null")
  public ConfigureProjectWebhookInput subscribeTo(java.util.List<ch.brix.gql.client.frontify.enums.AssetWebhookEvent> v) {
    values.put("subscribeTo", v);
    return this;
  }
}
