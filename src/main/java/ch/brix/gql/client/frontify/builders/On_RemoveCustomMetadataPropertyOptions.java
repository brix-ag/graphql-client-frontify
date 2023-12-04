package ch.brix.gql.client.frontify.builders;

public class On_RemoveCustomMetadataPropertyOptions extends ch.brix.gql.client.TypeBuilder {
  public On_RemoveCustomMetadataPropertyOptions() {
    super(new ch.brix.gql.client.On("RemoveCustomMetadataPropertyOptions"));
  }
  /**
   * `CustomMetadataProperty` details.
   */
  public On_RemoveCustomMetadataPropertyOptions customMetadataProperty(RemoveCustomMetadataPropertyOptions_customMetadataProperty callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
