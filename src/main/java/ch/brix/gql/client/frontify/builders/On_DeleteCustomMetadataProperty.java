package ch.brix.gql.client.frontify.builders;

public class On_DeleteCustomMetadataProperty extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteCustomMetadataProperty() {
    super(new ch.brix.gql.client.On("DeleteCustomMetadataProperty"));
  }
  /**
   * The Id of the deleted `CustomMetadataProperty`.
   */
  public On_DeleteCustomMetadataProperty id() {
    _add_field("id");
    return this;
  }
}
