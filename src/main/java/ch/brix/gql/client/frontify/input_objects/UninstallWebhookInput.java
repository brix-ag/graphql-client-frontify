package ch.brix.gql.client.frontify.input_objects;

public class UninstallWebhookInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `Webhook` to be uninstalled.
   */
  public UninstallWebhookInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
