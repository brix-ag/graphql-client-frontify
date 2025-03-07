package ch.brix.gql.client.frontify.builders;

public class On_MetadataFieldValues extends ch.brix.gql.client.TypeBuilder {
  public On_MetadataFieldValues() {
    super(new ch.brix.gql.client.On("MetadataFieldValues"));
  }
  /**
   * **DEPRECATED** Value of `SELECT` type `Metadata Field`. This field will be removed. Use `CustomMetadataProperty.type.options.value` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.type.options.value` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataFieldValues value() {
    _add_field("value");
    return this;
  }
  /**
   * **DEPRECATED** Default value for `SELECT` type `Metadata Field`. This field will be removed. Use `CustomMetadataProperty.type.options.isDefault` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.type.options.isDefault` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataFieldValues default_() {
    _add_field("default");
    return this;
  }
}
