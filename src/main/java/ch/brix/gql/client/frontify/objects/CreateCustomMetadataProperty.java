package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateCustomMetadataProperty {
  /**
   * The newly created `CustomMetadataProperty`.
   */
  @com.google.gson.annotations.SerializedName("property")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty property;
}
