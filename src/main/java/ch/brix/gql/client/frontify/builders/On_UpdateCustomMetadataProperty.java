package ch.brix.gql.client.frontify.builders;

public class On_UpdateCustomMetadataProperty extends ch.brix.gql.client.TypeBuilder {
  public On_UpdateCustomMetadataProperty() {
    super(new ch.brix.gql.client.On("UpdateCustomMetadataProperty"));
  }
  /**
   * Name of the updated `CustomMetadataProperty`.
   */
  public On_UpdateCustomMetadataProperty property(UpdateCustomMetadataProperty_property callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
