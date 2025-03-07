package ch.brix.gql.client.frontify.builders;

public class On_AddAssetMetadataFieldValue extends ch.brix.gql.client.TypeBuilder {
  public On_AddAssetMetadataFieldValue() {
    super(new ch.brix.gql.client.On("AddAssetMetadataFieldValue"));
  }
  /**
   * `MetadataValue` Id.
   */
  public On_AddAssetMetadataFieldValue id() {
    _add_field("id");
    return this;
  }
  /**
   * `User` who created the `MetadataValue`.
   */
  public On_AddAssetMetadataFieldValue creator(AddAssetMetadataFieldValue_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `MetadataValue` creation.
   */
  public On_AddAssetMetadataFieldValue createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * `User` who last modified the `MetadataValue`.
   */
  public On_AddAssetMetadataFieldValue modifier(AddAssetMetadataFieldValue_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `MetadataValue` last modification.
   */
  public On_AddAssetMetadataFieldValue modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * `MetadataField` related to the `MetadataValue`.
   */
  public On_AddAssetMetadataFieldValue metadataField(AddAssetMetadataFieldValue_metadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `MetadataValue` value.
   */
  public On_AddAssetMetadataFieldValue value() {
    _add_field("value");
    return this;
  }
}
