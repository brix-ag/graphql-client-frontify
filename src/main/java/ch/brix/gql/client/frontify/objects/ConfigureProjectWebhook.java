package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class ConfigureProjectWebhook {
  /**
   * The configured project webhook.
   */
  @com.google.gson.annotations.SerializedName("webhook")
  private ch.brix.gql.client.frontify.objects.ProjectWebhook webhook;
}
