package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataValues implements ch.brix.gql.client.frontify.interfaces.CustomMetadata {
  /**
   * `CustomMetadataProperty` details.
   */
  @com.google.gson.annotations.SerializedName("property")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty property;
  /**
   * `CustomMetadataProperty` values. Returns an empty list or a list of objects with `optionId` and `text` property values (for `MULTISELECT` type only).
   */
  @com.google.gson.annotations.SerializedName("values")
  @ch.brix.gql.client.InnerType(ch.brix.gql.client.frontify.scalars.AnyScalar.class)
  private java.util.List<ch.brix.gql.client.frontify.scalars.AnyScalar> values;
}
