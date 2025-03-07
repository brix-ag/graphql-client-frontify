package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeDate extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeDate() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeDate"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeDate name() {
    _add_field("name");
    return this;
  }
}
