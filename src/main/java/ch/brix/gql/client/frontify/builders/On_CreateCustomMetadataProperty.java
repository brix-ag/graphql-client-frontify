package ch.brix.gql.client.frontify.builders;

public class On_CreateCustomMetadataProperty extends ch.brix.gql.client.TypeBuilder {
  public On_CreateCustomMetadataProperty() {
    super(new ch.brix.gql.client.On("CreateCustomMetadataProperty"));
  }
  /**
   * The newly created `CustomMetadataProperty`.
   */
  public On_CreateCustomMetadataProperty property(CreateCustomMetadataProperty_property callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
