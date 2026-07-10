package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class MetadataFieldValues {
  /**
   * **DEPRECATED** Value of `SELECT` type `Metadata Field`. This field will be removed. Use `CustomMetadataProperty.type.options.value` instead. | Date: 2026-07-01
   * This field will be removed. Use `CustomMetadataProperty.type.options.value` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("value")
  private ch.brix.gql.client.frontify.scalars.StringScalar value;
  /**
   * **DEPRECATED** Default value for `SELECT` type `Metadata Field`. This field will be removed. Use `CustomMetadataProperty.type.options.isDefault` instead. | Date: 2026-07-01
   * This field will be removed. Use `CustomMetadataProperty.type.options.isDefault` instead. | Date: 2026-07-01
   */
  @java.lang.Deprecated
  @com.google.gson.annotations.SerializedName("default")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar default_;
}
