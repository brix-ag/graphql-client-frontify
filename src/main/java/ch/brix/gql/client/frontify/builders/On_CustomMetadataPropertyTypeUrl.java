package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeUrl extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeUrl() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeUrl"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeUrl name() {
    _add_field("name");
    return this;
  }
}
