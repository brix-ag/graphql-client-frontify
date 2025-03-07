package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyMultiSelectValueType implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyValueType {
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  @com.google.gson.annotations.SerializedName("propertyType")
  private ch.brix.gql.client.frontify.scalars.StringScalar propertyType;
  /**
   * `MultiSelectPropertyValueType` options.
   */
  @com.google.gson.annotations.SerializedName("options")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataPropertyOption.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyOption> options;
}
