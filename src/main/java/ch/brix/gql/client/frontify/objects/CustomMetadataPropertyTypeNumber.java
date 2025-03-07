package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyTypeNumber implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyType {
  /**
   * The `CustomMetadataProperty` type name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
}
