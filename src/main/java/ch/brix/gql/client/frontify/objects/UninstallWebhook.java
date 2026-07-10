package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UninstallWebhook {
  /**
   * **DEPRECATED** `Webhook` details. This field will be removed. Use `id` instead. | Date: 2026-07-01
   * This field will be removed. Use `id` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("webhook")
  private ch.brix.gql.client.frontify.interfaces.Webhook webhook;
  /**
   * The Id of the deleted `Webhook`.
   */
  @com.google.gson.annotations.SerializedName("id")
  private ch.brix.gql.client.frontify.scalars.IdScalar id;
}
