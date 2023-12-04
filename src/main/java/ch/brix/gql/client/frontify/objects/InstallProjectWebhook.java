package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class InstallProjectWebhook {
  /**
   * `Webhook` details.
   */
  @com.google.gson.annotations.SerializedName("webhook")
  private ch.brix.gql.client.frontify.interfaces.Webhook webhook;
}
