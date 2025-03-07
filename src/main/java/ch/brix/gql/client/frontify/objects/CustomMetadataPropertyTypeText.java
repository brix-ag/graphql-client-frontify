package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyTypeText implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyType {
  /**
   * The `CustomMetadataProperty` type name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
