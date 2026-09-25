package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CustomMetadataValue implements ch.brix.gql.client.frontify.interfaces.CustomMetadata {
  /**
   * `CustomMetadataProperty` details.
   */
  @com.google.gson.annotations.SerializedName("property")
  private ch.brix.gql.client.frontify.objects.CustomMetadataProperty property;
  /**
   * `CustomMetadataProperty` value. For `SELECT`, returns an object with `optionId` and `text`. For `CATALOG`, returns an opaque catalog selection ID string. For other single-value property types, returns the stored value as `String`/`Float`/`Int`/`DateTime`.
   */
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.AnyScalar value;
}
