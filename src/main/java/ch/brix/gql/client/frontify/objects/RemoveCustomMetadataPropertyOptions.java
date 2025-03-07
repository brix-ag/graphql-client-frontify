package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class RemoveCustomMetadataPropertyOptions {
  /**
   * `CustomMetadataProperty` details.
   */
  @com.google.gson.annotations.SerializedName("customMetadataProperty")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty customMetadataProperty;
}
