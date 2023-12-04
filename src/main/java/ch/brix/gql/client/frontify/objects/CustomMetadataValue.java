package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataValue implements ch.brix.gql.client.frontify.interfaces.CustomMetadata {
  /**
   * `CustomMetadataProperty` details.
   */
  @com.google.gson.annotations.SerializedName("property")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty property;
  /**
   * `CustomMetadataProperty` value. Returns an object with `optionId` and `text` property values (for `SELECT` type only) or a string for other `CustomMetadataProperty` single value items.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.AnyScalar value;
}
