package ch.brix.gql.client.frontify.builders;

public class On_MetadataField extends ch.brix.gql.client.TypeBuilder {
  public On_MetadataField() {
    super(new ch.brix.gql.client.On("MetadataField"));
  }
  /**
   * **DEPRECATED** `MetadataField` Id. This field will be removed. Use `CustomMetadataProperty.id` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.id` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField id() {
    _add_field("id");
    return this;
  }
  /**
   * **DEPRECATED** `User` who created the `MetadataField`. This field will be removed. Use `CustomMetadataProperty.creator` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.creator` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField creator(MetadataField_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `DateTime` of the `MetadataField` creation. This field will be removed. Use `CustomMetadataProperty.createdAt` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.createdAt` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * **DEPRECATED** `User` who last modified `MetadataField`. This field will be removed. Use `CustomMetadataProperty.modifier` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.modifier` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField modifier(MetadataField_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** `DateTime` of the `MetadataField`'s last modification. This field will be removed. Use `CustomMetadataProperty.modifiedAt` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.modifiedAt` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * **DEPRECATED** `MetadataField`'s name. This field will be removed. Use `CustomMetadataProperty.name` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.name` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField label() {
    _add_field("label");
    return this;
  }
  /**
   * **DEPRECATED** `MetadataField`'s type. This field will be removed. Use `CustomMetadataProperty.type.name` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.type.name` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField type() {
    _add_field("type");
    return this;
  }
  /**
   * **DEPRECATED** Possible values for `SELECT` type `MetadataField`. This field will be removed. Use `CustomMetadataProperty.type.options` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.type.options` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField values(MetadataField_values callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **DEPRECATED** Optional default value of the `MetadataField`. This field will be removed. Use `CustomMetadataProperty.defaultValue` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.defaultValue` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField defaultValue() {
    _add_field("defaultValue");
    return this;
  }
  /**
   * **DEPRECATED** Allow multiple values in `SELECT` type `MetadataField`. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField allowMultipleValues() {
    _add_field("allowMultipleValues");
    return this;
  }
  /**
   * **DEPRECATED** Allow an empty value as a valid `SELECT` type `MetadataField` value. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField allowEmptyValue() {
    _add_field("allowEmptyValue");
    return this;
  }
  /**
   * **DEPRECATED** Allow users to search for `MetadataField` values. This field will be removed. Use `CustomMetadataProperty.isSearchable` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.isSearchable` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField isSearchable() {
    _add_field("isSearchable");
    return this;
  }
  /**
   * **DEPRECATED** Allow users to edit `MetadataField` values. This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField isEditable() {
    _add_field("isEditable");
    return this;
  }
  /**
   * **DEPRECATED** Show/hide `MetadataField` values. This field will be removed. Use `CustomMetadataProperty.isViewable` instead. | Date: 2025-07-01T00:00:00.000+00:00
   * This field will be removed. Use `CustomMetadataProperty.isViewable` instead. | Date: 2025-07-01T00:00:00.000+00:00
   */
  @java.lang.Deprecated
  public On_MetadataField isVisible() {
    _add_field("isVisible");
    return this;
  }
}
