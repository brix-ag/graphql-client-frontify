package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadata extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadata() {
    super(new ch.brix.gql.client.On("CustomMetadata"));
  }
  /**
   * `CustomMetadataProperty` details.
   */
  public On_CustomMetadata property(CustomMetadata_property callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
