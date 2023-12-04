package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeNumber extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeNumber() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeNumber"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeNumber name() {
    _add_field("name");
    return this;
  }
}
