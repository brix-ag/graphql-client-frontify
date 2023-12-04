package ch.brix.gql.client.frontify.builders;

public class On_AddCustomMetadataPropertyOptions extends ch.brix.gql.client.TypeBuilder {
  public On_AddCustomMetadataPropertyOptions() {
    super(new ch.brix.gql.client.On("AddCustomMetadataPropertyOptions"));
  }
  /**
   * `CustomMetadataProperty` details.
   */
  public On_AddCustomMetadataPropertyOptions customMetadataProperty(AddCustomMetadataPropertyOptions_customMetadataProperty callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
