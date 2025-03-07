package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyType"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyType name() {
    _add_field("name");
    return this;
  }
}
