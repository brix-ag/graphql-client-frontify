package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class AddCustomMetadataPropertyOptions {
  /**
   * `CustomMetadataProperty` details.
   */
  @com.google.gson.annotations.SerializedName("customMetadataProperty")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty customMetadataProperty;
}
