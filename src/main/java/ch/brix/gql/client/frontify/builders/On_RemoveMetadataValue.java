package ch.brix.gql.client.frontify.builders;

public class On_RemoveMetadataValue extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveMetadataValue() {
    super(new ch.brix.gql.client.On("RemoveMetadataValue"));
  }
  /**
   * `MetadataValue` Id.
   */
  public On_RemoveMetadataValue id() {
    _add_field("id");
    return this;
  }
  /**
   * `User` who created the `MetadataValue`.
   */
  public On_RemoveMetadataValue creator(RemoveMetadataValue_creator callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `MetadataValue` creation.
   */
  public On_RemoveMetadataValue createdAt() {
    _add_field("createdAt");
    return this;
  }
  /**
   * `User` who last modified the `MetadataValue`.
   */
  public On_RemoveMetadataValue modifier(RemoveMetadataValue_modifier callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `DateTime` of the `MetadataValue` last modification.
   */
  public On_RemoveMetadataValue modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * `MetadataField` related to the `MetadataValue`.
   */
  public On_RemoveMetadataValue metadataField(RemoveMetadataValue_metadataField callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `MetadataValue` value.
   */
  public On_RemoveMetadataValue value() {
    _add_field("value");
    return this;
  }
}
