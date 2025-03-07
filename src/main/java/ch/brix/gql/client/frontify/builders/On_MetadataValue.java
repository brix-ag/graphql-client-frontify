package ch.brix.gql.client.frontify.builders;

public class On_MetadataValue extends ch.brix.gql.client.TypeBuilder {
  public On_MetadataValue() {
    super(new ch.brix.gql.client.On("MetadataValue"));
  }
  /**
   * **DEPRECATED** `MetadataValue` Id. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `User` who created the `MetadataValue`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue creator(MetadataValue_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `DateTime` of the `MetadataValue` creation. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * **DEPRECATED** `User` who last modified the `MetadataValue`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue modifier(MetadataValue_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `DateTime` of the `MetadataValue`'s last modification. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * **DEPRECATED** `MetadataField` associated to `MetadataValue`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue metadataField(MetadataValue_metadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `MetadataValue`'s value. This field will be removed. Use `CustomMetadataValueType.value` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataValueType.value` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataValue value() {
    _add_field("value");
    return this;
  }
}
