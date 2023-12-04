package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeText extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeText() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeText"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeText name() {
    _add_field("name");
    return this;
  }
}
