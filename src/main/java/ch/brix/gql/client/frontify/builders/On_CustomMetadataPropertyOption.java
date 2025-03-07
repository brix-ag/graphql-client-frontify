package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyOption extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyOption() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyOption"));
  }
  /**
   * `CustomMetadataPropertyOption` Id.
   */
  public On_CustomMetadataPropertyOption id() {
    _add_field("id");
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` value.
   */
  public On_CustomMetadataPropertyOption value() {
    _add_field("value");
    return this;
  }
  /**
   * Indicates if a `CustomMetadataPropertyOption` value is set to newly updated `Assets` by default.
   */
  public On_CustomMetadataPropertyOption isDefault() {
    _add_field("isDefault");
    return this;
  }
}
