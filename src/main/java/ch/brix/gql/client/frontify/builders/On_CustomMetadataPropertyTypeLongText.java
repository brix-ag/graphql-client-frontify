package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeLongText extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeLongText() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeLongText"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeLongText name() {
    _add_field("name");
    return this;
  }
}
