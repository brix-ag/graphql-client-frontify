package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataPropertyTypeSelect implements ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyType {
  /**
   * The `CustomMetadataProperty` type name.
   */
  @com.google.gson.annotations.SerializedName("name")
  private ch.brix.gql.client.frontify.scalars.StringScalar name;
  /**
   * `SELECT` type `CustomMetadataProperty` options.
   */
  @com.google.gson.annotations.SerializedName("options")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.objects.CustomMetadataPropertyOption.class)
  private java.util.List<ch.brix.gql.client.frontify.objects.CustomMetadataPropertyOption> options;
}
