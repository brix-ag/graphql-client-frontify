package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateCustomMetadataProperty {
  /**
   * Name of the updated `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("property")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty property;
}
