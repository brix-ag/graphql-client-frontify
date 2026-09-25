package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyCatalogValueType implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyValueType {
  /**
   * **BETA** `CustomMetadataPropertyValueType` property type.
   */
  @com.google.gson.annotations.SerializedName("propertyType")
  private ch.brix.gql.client.frontify.scalars.StringScalar propertyType;
}
