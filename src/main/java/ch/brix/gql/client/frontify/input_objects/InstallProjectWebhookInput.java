package ch.brix.gql.client.frontify.input_objects;

public class InstallProjectWebhookInput extends ch.brix.gql.client.InputObject {
  /**
   * Destination `Project` Id.
   */
  public InstallProjectWebhookInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * `Url` to send the `ProjectWebhook` notification to.
   */
  public InstallProjectWebhookInput notificationUrl(ch.brix.gql.client.frontify.scalars.UrlScalar v) {
    values.put("notificationUrl", v);
    return this;
  }
  /**
   * `ProjectWebhook` name.
   */
  public InstallProjectWebhookInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
}
